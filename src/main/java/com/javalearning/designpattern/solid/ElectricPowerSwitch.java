package com.javalearning.designpattern.solid;

public class ElectricPowerSwitch {

    private Switchable switchable;

    public ElectricPowerSwitch(Switchable switchable) {
        this.switchable = switchable;
    }

    public void press() {
        // Toggle bulb on/off
    }

    public static void main(String[] args) {
        LightBlub lightBlub = new LightBlub();
        SmartBlub smartBlub = new SmartBlub();
        ElectricPowerSwitch powerSwitch = new ElectricPowerSwitch(smartBlub);


    }
}
