package com.designpatterns.flyweight.keyboardchar;

// B 'ConcreteFlyweight' class
public class CharacterB extends Character {

    public CharacterB() {
        this.symbol = 'B';
        this.keyKod = 2;
    }

    @Override
    public void display(int pointIndex) {
        this.pointIndex = pointIndex;
        System.out.println(String.format("%c (pointIndex %d )", this.symbol, this.pointIndex));
    }
}
