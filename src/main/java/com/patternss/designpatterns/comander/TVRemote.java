package com.patternss.designpatterns.comander;

public class TVRemote {

    public static ElectronicDevice getDevice(){
        return new Television();
    }
}
