package com.patternss.designpatterns.abstractfactory;

import com.patternss.designpatterns.abstractfactory.beans.Service;

public class ServiceFactory {

    public static Service createService(ServiceAbstractFactory factory){
    return factory.createService();
    }
}
