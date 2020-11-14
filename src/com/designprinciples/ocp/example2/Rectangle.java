package com.designprinciples.ocp.example2;

public class Rectangle implements Shape {

    double length;
    double width;

    public Rectangle(double length, double width) {
        super();
        this.length = length;
        this.width = width;
    }

    @Override
    public double calculateArea() {
        return length * width;
    }

}