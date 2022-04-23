package com.designpatterns.decorator.shapedecorator;

public class Circle implements Shape{
    @Override
    public void draw() {
        System.out.println("Shape : Circle");
    }
}
