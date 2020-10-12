package com.patternss.designpatterns.factory;

import com.sun.istack.internal.NotNull;

public class APIServiceFacotry {
    public static APIService getService(@NotNull String serviceName) {

        if (serviceName.equalsIgnoreCase("apigee"))
            return new ApigeeAPIService();
        else if (serviceName.equalsIgnoreCase("wso2"))
            return new WSO2APIService();
        else
            return new defaultAPIService();
    }
}
