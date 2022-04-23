package com.designpatterns.bridge.carproducts;

public class StartMotorOnApp implements Product{
    private final String productName;

    public StartMotorOnApp(String productName) {
        this.productName = productName;
    }

    @Override
    public String productName() {
        return productName;
    }

    @Override
    public void produce() {
        System.out.println("Producing App to start motor " +
                "from your personal mobile device.");
    }
}
