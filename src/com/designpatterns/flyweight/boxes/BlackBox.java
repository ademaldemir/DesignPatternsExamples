package com.designpatterns.flyweight.boxes;

public class BlackBox extends Box{
    public BlackBox(int width, int height) {
        super(width, height);
        this.boxColor = BoxColor.Black;
    }

    @Override
    public void draw(int locationX, int locationY) {
        String message = String.format("%s box drawn. %d,%d", boxColor, locationX, locationY);
        System.out.println(message);
    }
}
