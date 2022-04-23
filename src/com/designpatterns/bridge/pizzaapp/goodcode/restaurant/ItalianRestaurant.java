package com.designpatterns.bridge.pizzaapp.goodcode.restaurant;

import com.designpatterns.bridge.pizzaapp.goodcode.pizza.Pizza;
import com.designpatterns.bridge.pizzaapp.goodcode.restaurant.Restaurant;

public class ItalianRestaurant extends Restaurant {
    public ItalianRestaurant(Pizza pizza) {
        super(pizza);
    }

    @Override
    void addSauce() {
        pizza.setSauce("Oil");
    }

    @Override
    void addToppings() {
        pizza.setToppings(null);
    }

    @Override
    void makeCrust() {
        pizza.setCrust("Thin");
    }
}
