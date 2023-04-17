package edu.whu.hytra.index;

import edu.whu.hyk.merge.Generator;
import edu.whu.hyk.merge.LsmConfig;

import java.util.HashMap;

public class IndexGenerator {

    /**
     * 生成索引的数据
     *
     * @return
     */
    public HashMap<String, Integer> generateIndexData() {
        return Generator.generateKV();
    }

    /**
     * 根据当前的 Hytra 数据生成配置文件
     *
     * @return
     */
    public LsmConfig generateConfigFile() {
        return Generator.generateConfig();
    }
}
