package com.designpatterns.bridge.pizzaapp.badcode;

public class ItalianPepperoniPizza extends Pizza {
    @Override
    public void deliver() {
        System.out.println("Adding Oil sauce");
        System.out.println("Adding no Toppings");
        System.out.println("Adding Pepperoni");
        System.out.println("Crust is: Thin");
        System.out.println("Order in Progress!");
    }
}
