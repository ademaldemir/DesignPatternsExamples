package com.designpatterns.decorator.mirror;

public class Mirror implements HomeThings{
    @Override
    public void produce() {
        System.out.println("Mirror Produced.");
    }
}
