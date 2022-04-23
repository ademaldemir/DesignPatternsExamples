package com.designpatterns.adapter.example;

public class SpaceShip implements Ship{
    @Override
    public int speed() {
        return 1000;
    }
}
