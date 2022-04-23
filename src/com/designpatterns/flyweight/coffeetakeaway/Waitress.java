package com.designpatterns.flyweight.coffeetakeaway;

public class Waitress {
    private static Coffee[] coffees = new Coffee[20];
    private static ContextCoffee[] tables = new ContextCoffee[20];
    private static int ordersCount = 0;
    private static CoffeeFactory coffeeFactory;

    private static void takeOrder(String flavorName, int tableNumber) {
        coffees[ordersCount] = coffeeFactory.getCoffeeFlavor(flavorName);
        tables[ordersCount] = new ContextCoffee(tableNumber);
        ordersCount++;
    }

    public static void main(String[] args) {
        coffeeFactory = new CoffeeFactory();

        takeOrder("Americano", 3);
        takeOrder("Cappuccino", 2);
        takeOrder("Cappuccino", 5);
        takeOrder("Americano", 6);
        takeOrder("Americano", 8);
        takeOrder("Americano", 5);
        takeOrder("Americano", 1);
        takeOrder("Cappuccino", 9);
        takeOrder("Filter Coffee", 2);
        takeOrder("Filter Coffee", 3);

        for (int i = 0 ; i < ordersCount ; i++) {
            coffees[i].serveCoffee(tables[i]);
        }


        System.out.println("\nTotal coffee object is made : " + coffeeFactory.getTotalCoffeeFlavorsMade());
    }




}
