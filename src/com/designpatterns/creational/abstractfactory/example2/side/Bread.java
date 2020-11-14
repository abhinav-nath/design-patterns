package com.designpatterns.creational.abstractfactory.example2.side;

public class Bread implements Side {

    private String sideName = null;

    @Override
    public void setSideName() {
        sideName = "Bread";
    }

    @Override
    public String getSideName() {
        return sideName;
    }

}