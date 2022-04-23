package com.designpatterns.bridge.pizzaapp.badcode;

public class VeggiePizza extends Pizza{
    @Override
    public void deliver() {
        System.out.println("Adding sauce");
        System.out.println("Adding different Toppings");
        System.out.println("Adding Cheese");
        System.out.println("Order in Progress!");
    }
}
