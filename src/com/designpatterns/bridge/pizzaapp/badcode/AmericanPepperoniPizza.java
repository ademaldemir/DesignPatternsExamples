package com.designpatterns.bridge.pizzaapp.badcode;

public class AmericanPepperoniPizza extends Pizza {
    @Override
    public void deliver() {
        System.out.println("Adding Secret sauce");
        System.out.println("Adding All Toppings");
        System.out.println("Adding Pepperoni");
        System.out.println("Crust is: Thick");
        System.out.println("Order in Progress!");
    }
}
