package com.designprinciples.ocp.example2;

public class Circle implements Shape {

    double radius;

    public Circle(double radius) {
        super();
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return (22 / 7) * radius * radius;
    }

}