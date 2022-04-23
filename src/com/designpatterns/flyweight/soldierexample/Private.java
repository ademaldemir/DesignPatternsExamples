package com.designpatterns.flyweight.soldierexample;

public class Private extends Soldier{
    public Private() {
        super("SWAT", "Machine Gun", "Good");
    }

    @Override
    public void moveTo(int x, int y) {
        // Extrinsic değerler set edilir ve bir işlem gerçekleştirilir
       setX(x);
       setY(y);
        System.out.println(String.format("Private (%d : %d) noktasına hareket etti.", getX(), getY()));
    }
}
