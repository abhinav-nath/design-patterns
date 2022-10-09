package com.codecafe.designpatterns.structural.adapter.example2.round;

import lombok.Getter;

@Getter
public class RoundPeg {

  private double radius;

  public RoundPeg() {
  }

  public RoundPeg(double radius) {
    this.radius = radius;
  }

}