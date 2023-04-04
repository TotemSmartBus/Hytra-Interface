package edu.whu.hyk.merge;

import java.util.HashMap;
import java.util.List;

public class LsmConfig {

    private HashMap<String, String> mergeMap;

    private HashMap<Integer, String> keysPerLevel;

    private List<Integer> elementSizeThresholdPerLevel;

    private Integer elementLengthPerLevel;

    public HashMap<String, String> getMergeMap() {
        return mergeMap;
    }

    public void setMergeMap(HashMap<String, String> mergeMap) {
        this.mergeMap = mergeMap;
    }

    public HashMap<Integer, String> getKeysPerLevel() {
        return keysPerLevel;
    }

    public void setKeysPerLevel(HashMap<Integer, String> keysPerLevel) {
        this.keysPerLevel = keysPerLevel;
    }

    public List<Integer> getElementSizeThresholdPerLevel() {
        return elementSizeThresholdPerLevel;
    }

    public void setElementSizeThresholdPerLevel(List<Integer> elementSizeThresholdPerLevel) {
        this.elementSizeThresholdPerLevel = elementSizeThresholdPerLevel;
    }

    public Integer getElementLengthPerLevel() {
        return elementLengthPerLevel;
    }

    public void setElementLengthPerLevel(Integer elementLengthPerLevel) {
        this.elementLengthPerLevel = elementLengthPerLevel;
    }
}
