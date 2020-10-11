package com.patternss.designpatterns.comander.actions;

import com.patternss.designpatterns.comander.ElectronicDevice;

public class TurnTVVolumeUp implements Command {
    ElectronicDevice device;

    public TurnTVVolumeUp(ElectronicDevice device){
        this.device = device;
    }

    @Override
    public void execute() {
        device.volumeUp();
    }
}
