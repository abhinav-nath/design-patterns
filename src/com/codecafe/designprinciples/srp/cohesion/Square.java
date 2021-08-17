package com.codecafe.designprinciples.srp.cohesion;

/*
 * The overall degree of cohesion of Square class is low
 * because there are unrelated methods inside the same class
 */
public class Square {

    int side = 5;

    /*
     * calculateArea() and calculatePerimeter() are cohesive (closely related)
     * because they deal with the measurements of a square 
     */
    public int calculateArea() {
        return side * side;
    }

    public int calculatePerimeter() {
        return side * 4;
    }

    /*
     * draw() and rotate() are cohesive because
     * they deal with rendering of the image
     */

    public void draw(boolean isHighResolutionMonitor) {
        if (isHighResolutionMonitor) {
            // Render a high resolution image of a square
        } else {
            // Render a normal image of a square
        }
    }

    public void rotate(int degree) {
        // Rotate the image of the square to the input degree
    }

}