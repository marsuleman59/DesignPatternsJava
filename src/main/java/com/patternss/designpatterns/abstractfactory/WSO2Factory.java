package com.patternss.designpatterns.abstractfactory;

import com.patternss.designpatterns.abstractfactory.beans.Service;
import com.patternss.designpatterns.abstractfactory.beans.WSO2Service;

public class WSO2Factory implements ServiceAbstractFactory{


    @Override
    public Service createService() {
        return new WSO2Service();
    }
}
