package com.designpatterns.bridge.carproducts;

// Abstraction
public abstract class Car {
    private final Product product; // Bridge
    private final String carType;

    public Car(Product product, String carType) {
        this.product = product;
        this.carType = carType;
    }

    public abstract void produceProduct();
    public abstract void assemble();

    public String printDetails() {
        return "Car{" +
                "product=" + product.productName() +
                ", carType='" + carType + '\'' +
                '}';
    }
}
