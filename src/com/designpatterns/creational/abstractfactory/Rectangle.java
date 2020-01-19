package com.designpatterns.creational.abstractfactory;

public class Rectangle implements IShape {

	@Override
	public void draw() {
		System.out.println("Inside Rectangle::draw() method.");
	}

}