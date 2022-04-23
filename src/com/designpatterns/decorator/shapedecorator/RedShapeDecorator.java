package com.designpatterns.decorator.shapedecorator;

public class RedShapeDecorator extends ShapeDecorator{
    public RedShapeDecorator(Shape decoratedShape) {
        super(decoratedShape);
    }

    @Override
    public void draw() {
        setRedBorder();
    }

    public void setRedBorder(){
        decoratedShape.draw();
        System.out.println("Border Color: RED!");
    }
}
