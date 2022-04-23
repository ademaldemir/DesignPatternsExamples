package com.designpatterns.flyweight.coffeetakeaway;

public class ContextCoffee {
    private int tableNumber;

    public ContextCoffee(int tableNumber) {
        this.tableNumber = tableNumber;
    }

    public int getTableNumber() {
        return tableNumber;
    }
}
