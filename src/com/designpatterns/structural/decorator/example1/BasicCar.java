package com.designpatterns.structural.decorator.example1;

public class BasicCar implements Car {

    @Override
    public void assemble() {
        System.out.print("Basic Car.");
    }

}