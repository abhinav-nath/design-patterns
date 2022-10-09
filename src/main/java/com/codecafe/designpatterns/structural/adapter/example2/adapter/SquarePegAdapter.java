package com.codecafe.designpatterns.structural.adapter.example2.adapter;

import com.codecafe.designpatterns.structural.adapter.example2.round.RoundPeg;
import com.codecafe.designpatterns.structural.adapter.example2.square.SquarePeg;

public class SquarePegAdapter extends RoundPeg {

  private final SquarePeg peg;

  public SquarePegAdapter(SquarePeg peg) {
    this.peg = peg;
  }

  @Override
  public double getRadius() {
    // Calculate a minimum circle radius which can fit this peg
    return Math.sqrt(Math.pow(peg.getWidth() / 2, 2) * 2);
  }

}