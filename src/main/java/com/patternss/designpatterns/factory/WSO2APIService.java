package com.patternss.designpatterns.factory;

public class WSO2APIService implements APIService {

    int hitCountInteger =0;
    private String WSO2APIService = "WSO2";

    @Override
    public void postCall() {
        System.out.println("Post call made from : "+WSO2APIService);
        hitCountInteger++;
    }

    @Override
    public void putCall() {
        System.out.println("put call made from : "+WSO2APIService);
        hitCountInteger++;
    }

    @Override
    public void getCall() {
        System.out.println("get call made from : "+WSO2APIService);
        hitCountInteger++;
    }

    @Override
    public void deleteCall() {
        System.out.println("delete call made from : "+WSO2APIService);
        hitCountInteger++;
    }

    public void getHitCountInteger() {
        System.out.println("Hits count is : "+hitCountInteger);
    }
}
