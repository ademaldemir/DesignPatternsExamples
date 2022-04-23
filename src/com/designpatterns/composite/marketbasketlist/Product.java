package com.designpatterns.composite.marketbasketlist;

// UML diyagramındaki Leaf kısmına denk gelmektedir.
// Hiyerarşinin en alt tabakasını temsil etmektedir.
public class Product implements CatalogComponent {
    private String name;

    public Product(String name) {
        this.name = name;
    }

    @Override
    public void drawHierarchy() {
        System.out.println("---> " +name);
    }
}
