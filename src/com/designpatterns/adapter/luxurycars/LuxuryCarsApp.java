package com.designpatterns.adapter.luxurycars;

public class LuxuryCarsApp {
    public static void main(String[] args) {
        Movable ferrariSpyder = new ferrariSpyder();
        MovableAdapter ferrariAdapter = new MovableAdapterImpl(ferrariSpyder);
        System.out.println(ferrariAdapter.getSpeed());
    }
}
