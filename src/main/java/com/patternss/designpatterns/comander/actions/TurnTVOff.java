package com.patternss.designpatterns.comander.actions;

import com.patternss.designpatterns.comander.ElectronicDevice;

public class TurnTVOff implements Command {
    ElectronicDevice device;

    public TurnTVOff (ElectronicDevice device){
        this.device = device;
    }

    @Override
    public void execute() {
        device.turnOff();
    }
}