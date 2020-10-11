package com.patternss.designpatterns.comander.actions;

import com.patternss.designpatterns.comander.ElectronicDevice;

public class TurnTVOn implements Command {


    ElectronicDevice device;

    public TurnTVOn (ElectronicDevice device){
        this.device = device;
    }

    @Override
    public void execute() {
    device.turnOn();
    }
}
