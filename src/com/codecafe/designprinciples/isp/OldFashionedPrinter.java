package com.codecafe.designprinciples.isp;

public class OldFashionedPrinter implements Printer {

    @Override
    public void print(Document d) {
        System.out.println("OldFashionedPrinter printing");
    }

}