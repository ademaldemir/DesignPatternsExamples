package com.designpatterns.decorator.mirror;

public class FramedMirror extends MirrorDecorator {
    @Override
    public void produce() {
        getMirror().produce();
        addBorder();
    }

    private void addBorder() {
        System.out.println("Frame added to Mirror.");
    }
}
