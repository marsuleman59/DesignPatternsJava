package com.patternss.designpatterns.oberver;

public interface Observer {
    boolean observer = false;
    void update(double appl, double goog, double tsla);

    void printPrices();
}
