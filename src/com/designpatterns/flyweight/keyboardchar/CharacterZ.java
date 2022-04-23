package com.designpatterns.flyweight.keyboardchar;

// Z 'ConcreteFlyweight' class
public class CharacterZ extends Character {
    public CharacterZ() {
        this.symbol = 'Z';
        this.keyKod = 29;
    }

    @Override
    public void display(int pointIndex) {
        this.pointIndex = pointIndex;
        System.out.println(String.format("%c (pointIndex %d )", this.symbol, this.pointIndex));
    }
}
