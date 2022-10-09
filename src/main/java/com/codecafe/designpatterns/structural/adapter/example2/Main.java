package com.codecafe.designpatterns.structural.adapter.example2;

import com.codecafe.designpatterns.structural.adapter.example2.adapter.SquarePegAdapter;
import com.codecafe.designpatterns.structural.adapter.example2.round.RoundHole;
import com.codecafe.designpatterns.structural.adapter.example2.round.RoundPeg;
import com.codecafe.designpatterns.structural.adapter.example2.square.SquarePeg;

public class Main {

  public static void main(String[] args) {
    // Round fits round, no surprises
    RoundHole hole = new RoundHole(5);
    RoundPeg rpeg = new RoundPeg(5);

    if (hole.fits(rpeg)) {
      System.out.println("RoundPeg r" + rpeg.getRadius() + " fits into RoundHole r" + hole.getRadius());
    }

    SquarePeg smallSqPeg = new SquarePeg(2);
    SquarePeg largeSqPeg = new SquarePeg(20);
    // hole.fits(smallSqPeg); // Won't compile!

    // Adapter solves the problem
    SquarePegAdapter smallSqPegAdapter = new SquarePegAdapter(smallSqPeg);
    SquarePegAdapter largeSqPegAdapter = new SquarePegAdapter(largeSqPeg);

    if (hole.fits(smallSqPegAdapter)) {
      System.out.println("SquarePeg w" + smallSqPeg.getWidth() + " fits into RoundHole r" + hole.getRadius());
    }

    if (!hole.fits(largeSqPegAdapter)) {
      System.out.println("SquarePeg w" + largeSqPeg.getWidth() + " does not fit into RoundHole r" + hole.getRadius());
    }
  }

}