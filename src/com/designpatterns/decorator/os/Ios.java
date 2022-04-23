package com.designpatterns.decorator.os;

public class Ios implements OperatingSystem{
    @Override
    public void update() {
        System.out.println("iOS operating system is updating..");
    }
}
