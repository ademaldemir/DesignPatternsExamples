package com.designpatterns.flyweight.boxes;

// Nesnenin ortak özelliklerini tutan sınıftır.
// UML diyagramındaki Flyweight yapısına denk gelmektedir.
public abstract class Box {
    // Intrinsic değerler
    public int width;
    public int height;
    public BoxColor boxColor;

    public Box(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public abstract void draw(int locationX, int locationY);

}
