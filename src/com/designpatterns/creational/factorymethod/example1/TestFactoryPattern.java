package com.designpatterns.creational.factorymethod.example1;

public class TestFactoryPattern {
	
    public static void main(String[] args) {
    	
        System.out.println(CarFactory.buildCar(CarType.SMALL));
        System.out.println(CarFactory.buildCar(CarType.SEDAN));
        System.out.println(CarFactory.buildCar(CarType.LUXURY));
        
    }
}