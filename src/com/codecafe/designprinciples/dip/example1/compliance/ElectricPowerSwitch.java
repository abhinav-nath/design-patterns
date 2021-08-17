package com.codecafe.designprinciples.dip.example1.compliance;

public class ElectricPowerSwitch implements Switch {

    private Switchable device;
    private boolean on;

    public ElectricPowerSwitch(Switchable device) {
        this.device = device;
        this.on = false;
    }

    public boolean isOn() {
        return this.on;
    }

    public void press() {
        boolean checkOn = isOn();

        if (checkOn) {
            device.turnOff();
            this.on = false;
        } else {
            device.turnOn();
            this.on = true;
        }
    }

}