package com.designprinciples.ocp.example2;

public class Square implements Shape {

	double length;
	
	public Square(double length) {
		super();
		this.length = length;
	}

	@Override
	public double calculateArea() {
		return length*length;
	}

}
