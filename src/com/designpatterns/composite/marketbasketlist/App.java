package com.designpatterns.composite.marketbasketlist;

public class App {
    public static void main(String[] args) {
        ProductCatalog items = new ProductCatalog("Products");

        ProductCatalog phones = new ProductCatalog("Phones");

        ProductCatalog iPhones = new ProductCatalog("Apple Phones");
        ProductCatalog androidPhones = new ProductCatalog("Android Phones");

        ProductCatalog samsungPhones = new ProductCatalog("Samsung Phones");
        ProductCatalog xiaomiPhones = new ProductCatalog("XIAOMI Phones");

        Product iPhone12 = new Product("Iphone 12");
        Product iPhone13 = new Product("Iphone 13");

        Product samsungA52Phone = new Product("Samsung A52");
        Product samsungA72Phone = new Product("Samsung A72");

        Product xiaomiNote8Pro = new Product("XIAOMI Note 8 Pro");

        items.add(phones);

        phones.add(iPhones);
        phones.add(androidPhones);

        iPhones.add(iPhone12);
        iPhones.add(iPhone13);

        androidPhones.add(samsungPhones);
        androidPhones.add(xiaomiPhones);

        samsungPhones.add(samsungA52Phone);
        samsungPhones.add(samsungA72Phone);

        xiaomiPhones.add(xiaomiNote8Pro);

        items.drawHierarchy();

    }
}
