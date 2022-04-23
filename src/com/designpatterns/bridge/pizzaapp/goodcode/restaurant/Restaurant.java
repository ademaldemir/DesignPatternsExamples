package com.designpatterns.bridge.pizzaapp.goodcode.restaurant;

import com.designpatterns.bridge.pizzaapp.goodcode.pizza.Pizza;

public abstract class Restaurant {
    //Bridge
    protected Pizza pizza;

    public Restaurant(Pizza pizza) {
        this.pizza = pizza;
    }

    abstract void addSauce();
    abstract void addToppings();
    abstract void makeCrust();

    public void deliver() {
        makeCrust();
        addSauce();
        addToppings();
        pizza.assemble();
        pizza.qualityCheck();
        System.out.println("Order in Progress!");
    }
}
