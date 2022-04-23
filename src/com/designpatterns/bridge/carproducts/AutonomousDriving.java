package com.designpatterns.bridge.carproducts;

public class AutonomousDriving implements Product {
    private final String productName;

    public AutonomousDriving(String productName) {
        this.productName = productName;
    }

    @Override
    public String productName() {
        return productName;
    }

    @Override
    public void produce() {
        System.out.println("Producing Autonomous Driving System");
    }
}
