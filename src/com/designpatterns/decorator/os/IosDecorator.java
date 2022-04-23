package com.designpatterns.decorator.os;

public abstract class IosDecorator implements OperatingSystem{
    private Ios ios;

    public IosDecorator(Ios ios) {
        this.ios = ios;
    }

    public Ios getIos() {
        return ios;
    }

    public void setIos(Ios ios) {
        this.ios = ios;
    }

}
