package com.patternss.designpatterns.factory;

public class defaultAPIService implements APIService {

    private static final String DEFAULT_SERVICE = "default";
    private Integer hitCountInteger = 0;

    @Override
    public void postCall() {
        System.out.println("default post call from "+DEFAULT_SERVICE);
        hitCountInteger =  increment(hitCountInteger);
    }

    @Override
    public void putCall() {
        System.out.println("default post call from "+DEFAULT_SERVICE);
        hitCountInteger =  increment(hitCountInteger);
    }

    @Override
    public void getCall() {
        System.out.println("default post call from "+DEFAULT_SERVICE);
        hitCountInteger =  increment(hitCountInteger);
    }

    @Override
    public void deleteCall() {
        System.out.println("default post call from "+DEFAULT_SERVICE);
        hitCountInteger =  increment(hitCountInteger);
    }

    @Override
    public void getHitCountInteger() {
        System.out.println("Hits count is : " + hitCountInteger);
        System.out.println("################################");
    }
}
