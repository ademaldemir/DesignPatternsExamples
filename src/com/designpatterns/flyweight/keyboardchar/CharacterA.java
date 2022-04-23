package com.designpatterns.flyweight.keyboardchar;

// A 'ConcreteFlyweight' class
public class CharacterA extends Character{
    public CharacterA() {
        this.symbol = 'A';
        this.keyKod = 1;
    }

    @Override
    public void display(int pointIndex) {
        this.pointIndex = pointIndex;
        System.out.println(String.format("%c (pointIndex %d )", this.symbol, this.pointIndex));
    }
}
