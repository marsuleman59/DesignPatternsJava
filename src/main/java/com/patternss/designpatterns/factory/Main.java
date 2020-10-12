package com.patternss.designpatterns.factory;

public class Main {
    public static void main(String[] args) {

        APIService apigeeService = APIServiceFacotry.getService("apigee");
        hitAPIS(apigeeService);
        APIService WSO2Service = APIServiceFacotry.getService("wso2");
        hitAPIS(WSO2Service);
        APIService defaultFree = APIServiceFacotry.getService("freeCall");
        hitAPIS(defaultFree);


    }

    private static void hitAPIS(APIService service) {
        if (null != service){
            service.deleteCall();
            service.getCall();
            service.postCall();
            service.putCall();
            service.getHitCountInteger();
        }
    }
}
