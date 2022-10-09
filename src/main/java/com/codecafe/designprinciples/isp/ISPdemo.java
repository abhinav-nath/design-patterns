package com.codecafe.designprinciples.isp;

/*
 * The Interface Segregation Principle
 * ===================================
 * Many client specific interfaces are
 * better than one general purpose interface.
 *
 * YAGNI - You Ain't Going to Need It.
 */

public class ISPdemo {

  public static void main(String[] args) {
    OldFashionedPrinter oldFashionedPrinter = new OldFashionedPrinter();

    oldFashionedPrinter.print(null);

    Photocopier photocopier = new Photocopier();
    photocopier.print(null);
    photocopier.scan(null);
  }

}