package com.designprinciples.isp;

public class ISPdemo {

	public static void main(String args[]) {
		OldFashionedPrinter o = new OldFashionedPrinter();
		
		o.print(null);
		
		Photocopier p = new Photocopier();
		p.print(null);
		p.scan(null);
	}
}
