package com.patternss.designpatterns.abstractfactory.beans;

public class ApigeeService implements Service {

    public ApigeeService(){
        System.out.println("Apigee service created");
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
        return "ApigeeService{}";
    }
}
