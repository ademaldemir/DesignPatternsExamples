package com.designpatterns.decorator.shapedecorator;

public class DecoratorPatternDemo {
    public static void main(String[] args) {
        Shape circle = new Circle();
        Shape rectangle = new Rectangle();

        Shape redCircle = new RedShapeDecorator(circle);
        Shape redRectangle = new RedShapeDecorator(rectangle);

        System.out.println("Circle with normal border");
        circle.draw();
        rectangle.draw();
        System.out.println("\nCicrle of Red Border");
        redCircle.draw();
        System.out.println("\nRectangle of red border");
        redRectangle.draw();
    }
}
