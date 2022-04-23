package com.designpatterns.bridge.pizzaapp.goodcode;

import com.designpatterns.bridge.pizzaapp.goodcode.pizza.PepperoniPizza;
import com.designpatterns.bridge.pizzaapp.goodcode.pizza.VeggiePizza;
import com.designpatterns.bridge.pizzaapp.goodcode.restaurant.AmericanRestaurant;
import com.designpatterns.bridge.pizzaapp.goodcode.restaurant.ItalianRestaurant;

public class ClientCode {
    public static void main(String[] args){
        AmericanRestaurant americanRestaurant = new AmericanRestaurant(new PepperoniPizza());
        americanRestaurant.deliver();

        System.out.println("🍕🍕🍕🍕🍕🍕🍕🍕🍕");

        ItalianRestaurant italianRestaurant = new ItalianRestaurant(new VeggiePizza());
        italianRestaurant.deliver();
    }
}
