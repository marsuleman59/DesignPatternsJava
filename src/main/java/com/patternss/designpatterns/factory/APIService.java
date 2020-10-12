package com.patternss.designpatterns.factory;

public interface APIService {

    default Integer increment(Integer count){
        return new Integer(count + 1);
    }
    void postCall();
    void putCall();
    void getCall();
    void deleteCall();

    void getHitCountInteger();
}
