package com.designpatterns.bridge.carproducts;

public class Mercedes extends Car{
    private final Product product;
    private final String carType;

    public Mercedes(Product product, String carType) {
        super(product, carType);
        this.product = product;
        this.carType = carType;
    }

    @Override
    public void produceProduct() {
        product.produce();
        System.out.println("Modifying product " + product.productName() + " according to " + carType);
    }

    @Override
    public void assemble() {
        System.out.println("Assembling " + product.productName() + " for " + carType );
    }
}
