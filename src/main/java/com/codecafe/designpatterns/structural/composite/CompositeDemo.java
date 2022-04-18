package com.codecafe.designpatterns.structural.composite;

public class CompositeDemo {

  public static void main(String[] args) {

    /*Create primary products for main catalog*/
    CatalogComponent mJeans = new Product("M: Jeans 32", 65.00);
    CatalogComponent mTShirt = new Product("M: T Shirt 38", 45.00);

    /*Create a composite product catalog and add female products to it*/
    CatalogComponent femaleCatalog = new ProductCatalog("Female Products");
    CatalogComponent fJeans = new Product("F: Jeans 32", 65.00);
    CatalogComponent fTShirt = new Product("F: T Shirt 38", 45.00);
    femaleCatalog.add(fJeans);
    femaleCatalog.add(fTShirt);

    /*Create a composite product catalog and add kid products to it*/
    CatalogComponent kidCatalog = new ProductCatalog("Kids Products");
    CatalogComponent kidShorts = new Product("Return Gift", 23.00);
    CatalogComponent kidPlayGears = new Product("Summer Play Gear", 65.00);
    kidCatalog.add(kidShorts);
    kidCatalog.add(kidPlayGears);

    /*Create primary catalog and add primary products and new catalogs to it*/
    CatalogComponent mainCatalog = new ProductCatalog("Primary Catalog");
    mainCatalog.add(mJeans);
    mainCatalog.add(mTShirt);
    mainCatalog.add(femaleCatalog);
    mainCatalog.add(kidCatalog);

    /*Print out product/catalog information*/
    mainCatalog.print();

  }

}