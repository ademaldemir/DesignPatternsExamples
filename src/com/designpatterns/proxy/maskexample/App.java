package com.designpatterns.proxy.maskexample;

public class App {
    public static void main(String[] args) {
        Person adem = new Person("Nicosia Cyprus", "12345678911");

        IOrderableMask order = new AuthenticatableMaskOrderProxy();
        order.createOrder(adem);
    }
}
