package edu.whu.hyk;


import edu.whu.hytra.entity.Vehicle;
import edu.whu.hyk.model.Point;
import edu.whu.hyk.model.PostingList;
import org.junit.Before;
import org.junit.Test;

import java.time.LocalDateTime;
import java.time.ZoneOffset;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.stream.Collectors;

public class IndexTest {

    private List<Vehicle> dataList;

    @Before
    public void prepare() {
        new AppTest();
        DBTest test = new DBTest();
        dataList = test.readGtfsData();
        assert dataList.size() != 0;
    }

    @Test
    public void TestUpdateIndex() {
        assert dataList.size() != 0;
        List<Point> parsedList = dataList.stream().map(p -> new Point(p.getId().hashCode(), p.getLat(), p.getLon(), LocalDateTime.ofEpochSecond(p.getRecordedTime(), 0, ZoneOffset.ofHours(-5)).format(DateTimeFormatter.ofPattern("YYYY-MM-DD hh:mm:ss")), p.getTripID().hashCode())
        ).collect(Collectors.toList());
        Engine.buildIndex(parsedList);
        assert !PostingList.TC.isEmpty();
//        assert !PostingList.TP.isEmpty();
        assert !PostingList.TlP.isEmpty();
        assert !PostingList.GT.isEmpty();
        assert !PostingList.CT.isEmpty();
        assert !PostingList.CP.isEmpty();
        assert !Engine.TG.isEmpty();
    }

}
