package com.patternss.designpatterns.abstractfactory;

import com.patternss.designpatterns.abstractfactory.beans.ApigeeService;
import com.patternss.designpatterns.abstractfactory.beans.Service;

public class ApigeeFactory implements ServiceAbstractFactory {
    @Override
    public Service createService() {
        return new ApigeeService();
    }
}
