package com.designpatterns.decorator.mirror;

public abstract class MirrorDecorator implements HomeThings{
    private HomeThings mirror = new Mirror();

    public HomeThings getMirror() {
        return mirror;
    }

    public void setMirror(final HomeThings mirror) {
        this.mirror = mirror;
    }

}
