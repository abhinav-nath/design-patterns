package com.codecafe.designprinciples.srp.cohesion;

/*
 * To increase the level of cohesion,
 * we should segregate the code based on the responsibilities
 */
public class Square2 {

  int side = 5;

  public int calculateArea() {
    return side * side;
  }

  public int calculatePerimeter() {
    return side * 4;
  }

}

class SquareUI {

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