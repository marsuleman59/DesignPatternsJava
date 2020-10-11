package com.patternss.designpatterns.comander;

import com.patternss.designpatterns.comander.actions.Command;

public class DeviceButton  {

    Command command;

    public DeviceButton(Command command){
        this.command = command;
    }

    public void press(){
        command.execute();
    }

}
