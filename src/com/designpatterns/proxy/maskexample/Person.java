package com.designpatterns.proxy.maskexample;

import javax.imageio.stream.FileCacheImageOutputStream;

public class Person {
    public String address;
    public String tc;

    public Person(String address, String tc) {
        this.address = address;
        this.tc = tc;
    }
}
