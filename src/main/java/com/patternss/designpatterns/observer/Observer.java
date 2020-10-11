package com.patternss.designpatterns.observer;

public interface Observer {
    boolean observer = false;
    void update(double appl, double goog, double tsla);

    void printPrices();
}
