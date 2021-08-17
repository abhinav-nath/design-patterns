package com.codecafe.designprinciples.dip.example1.compliance;

public class Fan implements Switchable {

    @Override
    public void turnOn() {
        System.out.println("Fan: Fan turned on...");
    }

    @Override
    public void turnOff() {
        System.out.println("Fan: Fan turned off...");
    }

}