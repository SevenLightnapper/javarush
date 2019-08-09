package javarush.java_collections_4.level9.lecture9.task10;
/*
package com.javarush.task.task39.task3906;
*/
public class ElectricPowerSwitch {
    private Switchable securitySystem;

    public ElectricPowerSwitch(Switchable switchable) {
        this.securitySystem = switchable;
    }

    public void press() {
        System.out.println("Pressed the power switch.");
        if (securitySystem.isOn()) {
            securitySystem.turnOff();
        } else {
            securitySystem.turnOn();
        }
    }
}

