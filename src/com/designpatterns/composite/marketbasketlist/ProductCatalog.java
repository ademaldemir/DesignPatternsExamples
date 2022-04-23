package com.designpatterns.composite.marketbasketlist;

import java.util.ArrayList;
import java.util.List;

// UML diyagramındaki Composite kısmına denk gelmektedir.
// Component (CatalogComponent) listesi tutmaktadır.
public class ProductCatalog implements CatalogComponent {
    private String name;
    private List<CatalogComponent> components;

    public ProductCatalog(String name) {
        this.name = name;
        this.components = new ArrayList<CatalogComponent>();
    }

    public void add(CatalogComponent catalogComponent) {
        components.add(catalogComponent);
    }

    public void remove(CatalogComponent catalogComponent) {
        components.remove(catalogComponent);
    }

    @Override
    public void drawHierarchy() {
        System.out.println(name);

        for (CatalogComponent component :
                components) {
            component.drawHierarchy();
        }
    }
}
