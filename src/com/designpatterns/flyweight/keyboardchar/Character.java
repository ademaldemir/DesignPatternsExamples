package com.designpatterns.flyweight.keyboardchar;

/// The 'Flyweight' abstract class
public abstract class Character {
    // intrinsic
    protected char symbol;
    protected int keyKod;
    // extrinsic
    protected int pointIndex;

    public abstract void display(int pointIndex);
}
