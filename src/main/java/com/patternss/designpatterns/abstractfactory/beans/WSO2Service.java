package com.patternss.designpatterns.abstractfactory.beans;

public class WSO2Service implements Service {

    public WSO2Service(){
        System.out.println("WSO2 service created");
    }

    @Override
    public void postCall() {
        System.out.println("post");
    }

    @Override
    public void putCall() {
        System.out.println("put");
    }

    @Override
    public void getCall() {
        System.out.println("get");
    }

    @Override
    public void deleteCall() {
        System.out.println("delete");
    }

    @Override
    public String toString() {
        return "WSO2Service{}";
    }
}
