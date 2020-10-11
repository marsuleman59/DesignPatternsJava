package com.patternss.designpatterns.patterns.singleton;

import org.springframework.stereotype.Component;

@Component
public class SingletonPattern {

    private static int count;

    private static SingletonPattern singletonPattern;

    private SingletonPattern(){}

    public static SingletonPattern getInstance(int count1){

        count = count1;
        if (singletonPattern == null) {
            synchronized (SingletonPattern.class) {
                if (singletonPattern == null)
                singletonPattern = new SingletonPattern();
            }
        }

        return singletonPattern;

    }

}
