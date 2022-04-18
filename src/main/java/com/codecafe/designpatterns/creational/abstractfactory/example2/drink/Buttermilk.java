package com.codecafe.designpatterns.creational.abstractfactory.example2.drink;

public class Buttermilk implements Drink {

  private String drinkName = null;

  @Override
  public void setDrinkName() {
    drinkName = "Buttermilk";
  }

  @Override
  public String getDrinkName() {
    return drinkName;
  }

}