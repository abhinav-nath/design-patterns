package com.codecafe.designprinciples.dip.example1.violation;

public class Main {

    public static void main(String[] args) {
        LightBulb bulb = new LightBulb();

        ElectricPowerSwitch powerSwitch = new ElectricPowerSwitch(bulb);
        powerSwitch.press();
        powerSwitch.press();
    }

}