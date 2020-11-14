package com.designpatterns.structural.composite;

public abstract class CatalogComponent {

    public void add(CatalogComponent catalogComponent) {
        throw new UnsupportedOperationException("Cannot add item to the catalogue");
    }

    public void remove(CatalogComponent catalogComponent) {
        throw new UnsupportedOperationException("Cannot remove item from the catalogue");
    }

    public String getName() {
        throw new UnsupportedOperationException("Cannot return name");
    }

    public double getPrice() {
        throw new UnsupportedOperationException("Cannot return price");
    }

    public void print() {
        throw new UnsupportedOperationException("Cannot print");
    }

    public void print(String categoryName) {
        throw new UnsupportedOperationException("Cannot print");
    }

}