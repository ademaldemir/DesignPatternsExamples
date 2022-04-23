package com.designpatterns.bridge.pizzaapp.badcode;

public abstract class Pizza {
    protected String sauce;
    protected String toppings;
    protected String crust;

    public abstract void deliver();
}
