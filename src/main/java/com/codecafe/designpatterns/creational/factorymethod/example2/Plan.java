package com.codecafe.designpatterns.creational.factorymethod.example2;

public abstract class Plan {

  protected double rate;

  abstract void setRate();

  public void calculateBill(int units) {
    System.out.println(rate * units);
  }

}