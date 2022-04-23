package com.designpatterns.proxy.maskexample;

// Concrete Service Class
public class MaskOrder implements IOrderableMask {
    @Override
    public void createOrder(Person person) {

        // Orders will be processed in this field
        System.out.println("Order created to " + person.address);
    }
}
