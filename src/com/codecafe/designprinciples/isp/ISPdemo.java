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

    public static void main(String args[]) {
        OldFashionedPrinter o = new OldFashionedPrinter();

        o.print(null);

        Photocopier p = new Photocopier();
        p.print(null);
        p.scan(null);
    }
}
