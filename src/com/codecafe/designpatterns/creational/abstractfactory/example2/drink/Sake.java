package com.codecafe.designpatterns.creational.abstractfactory.example2.drink;

public class Sake implements Drink {

    private String drinkName = null;

    @Override
    public void setDrinkName() {
        drinkName = "Sake";
    }

    @Override
    public String getDrinkName() {
        return drinkName;
    }
}