package com.codecafe.designpatterns.structural.composite;

import java.util.ArrayList;

public class ProductCatalog extends CatalogComponent {

    private ArrayList<CatalogComponent> items = new ArrayList<>();

    private String name;

    public ProductCatalog(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void print() {

        for(CatalogComponent component : items) {
            if(component.getClass().getSimpleName().equals("ProductCatalog"))
                component.print();
            else
                component.print(name);
        }
    }

    @Override
    public void print(String categoryName) {
        // Do nothing
    }

    @Override
    public void add(CatalogComponent catalogComponent) {
        items.add(catalogComponent);
    }

    @Override
    public void remove(CatalogComponent catalogComponent) {
        items.remove(catalogComponent);
    }
}