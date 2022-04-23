package com.designpatterns.flyweight.soldierexample;

public class Sergeant extends Soldier{
    public Sergeant() {
        super("SWAT", "Sword", "Good");
    }

    @Override
    public void moveTo(int x, int y) {
        setX(x);
        setY(y);
        System.out.println(String.format("Sergeant (%d : %d) noktasına hareket etti.", getX(), getY()));
    }
}
