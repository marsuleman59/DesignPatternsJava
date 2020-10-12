package com.patternss.designpatterns.abstractfactory;

import com.patternss.designpatterns.abstractfactory.beans.ApigeeService;
import com.patternss.designpatterns.abstractfactory.beans.Service;
import com.patternss.designpatterns.abstractfactory.beans.WSO2Service;

public class Main {
    public static void main(String[] args) {

        ApigeeService service = (ApigeeService) ServiceFactory.createService(new ApigeeFactory());

        WSO2Service wso2 = (WSO2Service) ServiceFactory.createService(new WSO2Factory());

        System.out.println(service);
        System.out.println(wso2);

    }
}
