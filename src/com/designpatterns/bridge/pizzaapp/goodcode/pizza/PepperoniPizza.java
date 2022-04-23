package com.designpatterns.bridge.pizzaapp.goodcode.pizza;

public class PepperoniPizza extends Pizza{
    @Override
    public void assemble() {
        System.out.println("Adding sauce: "+sauce);
        System.out.println("Adding Toppings: "+toppings);
        System.out.println("Adding Cheese");
    }

    @Override
    public void qualityCheck() {
        System.out.println("Crust is: "+crust);
    }
}
