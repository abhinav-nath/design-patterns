package com.codecafe.designpatterns.structural.adapter.example2.round;

import lombok.Getter;

/**
 * RoundHoles are compatible with RoundPegs
 */

@Getter
public class RoundHole {

  private final double radius;

  public RoundHole(double radius) {
    this.radius = radius;
  }

  public boolean fits(RoundPeg peg) {
    return this.getRadius() >= peg.getRadius();
  }

}