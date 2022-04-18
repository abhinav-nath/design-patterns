package com.codecafe.designprinciples.dip.example1.violation;

public class ElectricPowerSwitch {

  private LightBulb lightBulb;
  private boolean on;

  public ElectricPowerSwitch(LightBulb lightBulb) {
    this.lightBulb = lightBulb;
    this.on = false;
  }

  public boolean isOn() {
    return this.on;
  }

  public void press() {
    boolean checkOn = isOn();

    if (checkOn) {
      lightBulb.turnOff();
      this.on = false;
    } else {
      lightBulb.turnOn();
      this.on = true;
    }
  }

}