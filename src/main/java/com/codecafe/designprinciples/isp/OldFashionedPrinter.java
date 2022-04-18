package com.codecafe.designprinciples.isp;

public class OldFashionedPrinter implements Printer {

  @Override
  public void print(Document document) {
    System.out.println("OldFashionedPrinter printing " + document);
  }

}