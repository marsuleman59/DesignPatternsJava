package com.patternss.designpatterns.comander.actions;

import com.patternss.designpatterns.comander.ElectronicDevice;

public class TurnTVVolumeDown implements Command {
    ElectronicDevice device;

    public TurnTVVolumeDown(ElectronicDevice device){
        this.device = device;
    }

    @Override
    public void execute() {
        device.volumeDown();
    }
}
