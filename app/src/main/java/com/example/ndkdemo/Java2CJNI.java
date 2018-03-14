package com.example.ndkdemo;

/**
 * Created by guodazhao on 2017/12/29 0029.
 */

public class Java2CJNI {
    static {
        System.loadLibrary("Java2C");
    }
    public native String java2C();
}
