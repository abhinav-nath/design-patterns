package com.designprinciples.ocp.example1;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

// Violates OCP because each time a new Filter has to be added, code has to be changed
// Code should not be changed as this may result in providing a new jar to the client
// if a new attribute "Price" gets added in the Product class then Filter has to be added as well
public class ProductFilterViolatesOCP {

    public Stream<Product> filterByColor(List<Product> products, Color color) {
        return products.stream().filter(p -> p.color == color);
    }

    public Stream<Product> filterBySize(List<Product> products, Size size) {
        return products.stream().filter(p -> p.size == size);
    }

    public Stream<Product> filterByColorAndSize(List<Product> products, Color color, Size size) {
        return products.stream().filter(p -> p.size == size && p.color == color);
    }
}

class ProductFilterViolatesOCPDemo {

    public static void main(String args[]) {
        Product apple = new Product("Apple", Color.GREEN, Size.SMALL);
        Product tree = new Product("Tree", Color.GREEN, Size.LARGE);
        Product house = new Product("House", Color.BLUE, Size.LARGE);

        List<Product> products = new ArrayList<>();
        products.add(apple);
        products.add(tree);
        products.add(house);

        ProductFilterViolatesOCP pf = new ProductFilterViolatesOCP();
        System.out.println("Green products (old) : ");
        pf.filterByColor(products, Color.GREEN).forEach(p -> System.out.println(" - " + p.name + " is green"));

    }
}