package com.designpatterns.flyweight.boxes;

public class BlueBox extends Box {

    public BlueBox(int width, int height) {
        super(width, height);
        this.boxColor = BoxColor.Blue;
    }

    @Override
    public void draw(int locationX, int locationY) {
        String message = String.format("%s box drawn. %d, %d", boxColor, locationX, locationY);
        System.out.println(message);
    }
}
