package com.codecafe.designpatterns.structural.adapter.example2.square;

import lombok.Getter;

/**
 * SquarePegs are not compatible with RoundHoles (they were implemented by
 * previous development team). But we have to integrate them into our program.
 */

@Getter
public class SquarePeg {

  private final double width;

  public SquarePeg(double width) {
    this.width = width;
  }

  public double getSquare() {
    return Math.pow(this.width, 2);
  }

}
