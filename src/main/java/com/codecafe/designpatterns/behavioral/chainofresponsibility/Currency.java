package com.codecafe.designpatterns.behavioral.chainofresponsibility;

public class Currency {

  private final int amount;

  public Currency(int amount) {
    this.amount = amount;
  }

  public int getAmount() {
    return this.amount;
  }

}