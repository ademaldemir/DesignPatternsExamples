package com.designpatterns.bridge.pizzaapp.badcode;

public class AmericanVeggiePizza extends Pizza{
    @Override
    public void deliver() {
        System.out.println("Adding Super Secret sauce");
        System.out.println("Adding All Toppings");
        System.out.println("Adding Cheese");
        System.out.println("Crust is: Thick");
        System.out.println("Order in Progress!");
    }
}
