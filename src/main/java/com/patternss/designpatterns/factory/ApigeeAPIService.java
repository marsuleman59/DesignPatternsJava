package com.patternss.designpatterns.factory;

public class ApigeeAPIService implements APIService {

    int hitCountInteger =0;

    private String ApigeeAPIService = "apigee";

    @Override
    public void postCall() {
        System.out.println("Post call made from : "+ApigeeAPIService);
        hitCountInteger++;
    }

    @Override
    public void putCall() {
        System.out.println("Put call made from : "+ApigeeAPIService);
        hitCountInteger++;
    }

    @Override
    public void getCall() {
        System.out.println("get call made from : "+ApigeeAPIService);
        hitCountInteger++;
    }

    @Override
    public void deleteCall() {
        System.out.println("delete call made from : "+ApigeeAPIService);
        hitCountInteger++;
    }

    @Override
    public void  getHitCountInteger() {
        System.out.println("Hits count is : "+hitCountInteger);
    }
}
