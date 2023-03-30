package edu.whu.hytra.core;

import java.lang.annotation.Native;
import java.util.Set;


public class NativeTool {
    public native String Java_Hello_sayHello();
    public native Set<String> get(String k);

    public native void insert(String k, String v);

    static {
        System.load("/home/haoxingxiao/repos/Hytra-Interface/src/main/java/edu/whu/hytra/core/");
    }
}
