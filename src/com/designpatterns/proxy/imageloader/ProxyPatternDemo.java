package com.designpatterns.proxy.imageloader;

public class ProxyPatternDemo {
    public static void main(String[] args) {
        Image proxyImage = new ProxyImage("ademmodel.jpg");

        // Image will be loaded from disk at first time
        proxyImage.display();

        System.out.println("🥥🥥");
        // But at the second time Image will be loaded from chached
        proxyImage.display();
    }
}
