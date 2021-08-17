package com.codecafe.designprinciples.isp;

public class Photocopier implements Printer, Scanner {

    @Override
    public void scan(Document d) {
        System.out.println("Photocopier scanning");

    }

    @Override
    public void print(Document d) {
        System.out.println("Photocopier printing");

    }

}