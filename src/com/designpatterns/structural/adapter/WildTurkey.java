package com.designpatterns.structural.adapter;

public class WildTurkey implements Turkey {

    @Override
    public void gobble() {
        System.out.println("Gobble Gobble");
    }

    @Override
    public void fly() {
        System.out.println("I am flying a short distance");
    }

}