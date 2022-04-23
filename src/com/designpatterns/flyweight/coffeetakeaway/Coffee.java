package com.designpatterns.flyweight.coffeetakeaway;

//
public class Coffee implements ICoffee {
    private String flavor;

    public Coffee(String flavor) {
        this.flavor = flavor;
        System.out.println("Coffee is created with flavor - " + flavor);
    }

    public String getFlavor() {
        return flavor;
    }

    @Override
    public void serveCoffee(ContextCoffee context) {
        System.out.println("Serving " + flavor + " to table " + context.getTableNumber());
    }
}
