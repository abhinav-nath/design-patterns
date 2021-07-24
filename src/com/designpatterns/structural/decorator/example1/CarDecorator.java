package com.designpatterns.structural.decorator.example1;

public class CarDecorator implements Car {

    private Car car;

    public CarDecorator(Car car) {
        this.car = car;
    }

    @Override
    public void assemble() {
        this.car.assemble();
    }

}