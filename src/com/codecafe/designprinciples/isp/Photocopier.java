package com.codecafe.designprinciples.isp;

public class Photocopier implements Printer, Scanner {

    @Override
    public void scan(Document document) {
        System.out.println("Photocopier scanning " + document);
    }

    @Override
    public void print(Document document) {
        System.out.println("Photocopier printing " + document);
    }

}