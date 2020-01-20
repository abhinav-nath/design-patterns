package com.designpatterns.creational.abstractfactory.example1;

public class RoundedSquare implements IShape {

	@Override
	public void draw() {
		System.out.println("Inside RoundedSquare::draw() method.");
	}

}