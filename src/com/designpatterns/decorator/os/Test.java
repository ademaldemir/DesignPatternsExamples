package com.designpatterns.decorator.os;

public class Test {
    public static void main(String[] args) {
       Ios ios = new Ios();
       //ios.update();
       OperatingSystem rollBack = new RollbackIos(ios);
       rollBack.update();
    }
}
