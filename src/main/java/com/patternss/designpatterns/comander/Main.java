package com.patternss.designpatterns.comander;

import com.patternss.designpatterns.comander.actions.TurnTVOff;
import com.patternss.designpatterns.comander.actions.TurnTVOn;
import com.patternss.designpatterns.comander.actions.TurnTVVolumeUp;

public class Main {
    public static void main(String[] args) {

        ElectronicDevice device = TVRemote.getDevice();

        TurnTVOn tvOn = new TurnTVOn(device);
//        TurnTVOff tvOff = new TurnTVOff(device);

        DeviceButton deviceButton = new DeviceButton(tvOn);
        deviceButton.press();


//        ##################################

        DeviceButton deviceButton1 = new DeviceButton(() -> new TurnTVOff(device));
        deviceButton1.press();

        DeviceButton deviceButton3 = new DeviceButton(() ->  new TurnTVVolumeUp((device)));
        deviceButton3.press();

        DeviceButton deviceButton2 = new DeviceButton(() ->new TurnTVVolumeUp(device));
        deviceButton2.press();




    }
}
