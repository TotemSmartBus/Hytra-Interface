package edu.whu.hytra.core;

import java.lang.annotation.Native;
import java.util.Set;


public class NativeTool {
    public native Set<String> get(String k);

    public native void insert(String k, String v);

    static {
        System.loadLibrary("jLSM.so");
    }
}
