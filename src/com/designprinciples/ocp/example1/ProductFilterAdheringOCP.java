package com.designprinciples.ocp.example1;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class ProductFilterAdheringOCP implements Filter<Product> {

    @Override
    public Stream<Product> filter(List<Product> items, Specification<Product> spec) {

        return items.stream().filter(p -> spec.isSatisfied(p));
    }

}

class ProductFilterAdheringOCPDemo {

    public static void main(String args[]) {
        Product apple = new Product("Apple", Color.GREEN, Size.SMALL);
        Product tree = new Product("Tree", Color.GREEN, Size.LARGE);
        Product house = new Product("House", Color.BLUE, Size.LARGE);

        List<Product> products = new ArrayList<>();
        products.add(apple);
        products.add(tree);
        products.add(house);

        ProductFilterAdheringOCP pf = new ProductFilterAdheringOCP();
        System.out.println("Green products : ");
        pf.filter(products, new ColorSpecification(Color.GREEN))
                .forEach(p -> System.out.println(" - " + p.name + " is green"));

        System.out.println("Blue products : ");
        pf.filter(products, new ColorSpecification(Color.BLUE))
                .forEach(p -> System.out.println(" - " + p.name + " is blue"));

        System.out.println("Large products : ");
        pf.filter(products, new SizeSpecification(Size.LARGE))
                .forEach(p -> System.out.println(" - " + p.name + " is large"));

        // Use combinator to filter using multiple specifications
        System.out.println("Green and Small products : ");
        pf.filter(products,
                new AndSpecification<>(new ColorSpecification(Color.GREEN), new SizeSpecification(Size.SMALL)))
                .forEach(p -> System.out.println(" - " + p.name + " is green and small"));

    }
}