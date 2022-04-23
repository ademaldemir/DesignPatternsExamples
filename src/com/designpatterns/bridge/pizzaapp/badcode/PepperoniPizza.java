package com.designpatterns.bridge.pizzaapp.badcode;

public class PepperoniPizza extends Pizza {
    @Override
    public void deliver() {
        System.out.println("Adding Sauce");
        System.out.println("Adding Toppings");
        System.out.println("Adding Pepperoni");
        System.out.println("Order in Progress!");
    }
}
