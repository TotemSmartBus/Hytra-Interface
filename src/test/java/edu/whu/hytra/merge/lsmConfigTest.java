package edu.whu.hytra.merge;

import edu.whu.hyk.App;
import edu.whu.hyk.AppTest;
import edu.whu.hyk.DBTest;
import edu.whu.hyk.IndexTest;
import edu.whu.hyk.merge.Generator;
import edu.whu.hyk.merge.LsmConfig;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class lsmConfigTest {

    @Before
    public void prepare() {
        AppTest app = new AppTest();
        DBTest test = new DBTest();
        IndexTest index = new IndexTest();
        index.prepare();
        index.TestUpdateIndex();
    }

    /**
     * 测试是否能正确获取到配置
     */
    @Test
    public void generateConfigTest() {
        LsmConfig config = Generator.generateConfig();
        Assert.assertTrue(config.getMergeMap().size() > 0);
    }
}
