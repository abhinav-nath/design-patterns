package com.codecafe.designprinciples.dip.example1.compliance;

public class Main {

  public static void main(String[] args) {
    Switchable bulb = new LightBulb();
    Switch bulbSwitch = new ElectricPowerSwitch(bulb);
    bulbSwitch.press();
    bulbSwitch.press();

    Switchable fan = new Fan();
    Switch fanSwitch = new ElectricPowerSwitch(fan);
    fanSwitch.press();
    fanSwitch.press();
  }

}