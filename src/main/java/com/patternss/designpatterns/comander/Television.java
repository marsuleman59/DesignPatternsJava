package com.patternss.designpatterns.comander;

public class Television implements ElectronicDevice {

    int volume = 0;
    @Override
    public void turnOn() {
        System.out.println("Television turned on");
    }

    @Override
    public void turnOff() {
        System.out.println("Television turned off");

    }

    @Override
    public void volumeUp() {
        System.out.println("Television Volume up to"+(++volume));

    }

    @Override
    public void volumeDown() {
        System.out.println("Television Volume down to"+(--volume));

    }
}
