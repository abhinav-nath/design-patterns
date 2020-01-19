package com.designpatterns.creational.abstractfactory;

public class Square implements IShape {

	@Override
	public void draw() {
		System.out.println("Inside Square::draw() method.");
	}

}