package edu.whu.hytra.core;

import org.junit.Test;

public class JniTest {

    @Test
    public void JniInsertTest() {
        NativeTool test = new NativeTool();
        test.Java_Hello_sayHello();
    }
}
