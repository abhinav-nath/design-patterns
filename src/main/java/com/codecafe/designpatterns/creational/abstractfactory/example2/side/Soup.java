package com.codecafe.designpatterns.creational.abstractfactory.example2.side;

public class Soup implements Side {

  private String sideName = null;

  @Override
  public void setSideName() {
    sideName = "Soup";
  }

  @Override
  public String getSideName() {
    return sideName;
  }

}