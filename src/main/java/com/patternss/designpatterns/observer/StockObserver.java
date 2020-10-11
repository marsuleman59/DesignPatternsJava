package com.patternss.designpatterns.observer;


public class StockObserver implements Observer {

    public String getMyName() {
        return myName;
    }

    private String myName;
    private double appl;
    private double goog;
    private double tsla;

    StockObserver(String myName){
    this.myName = myName + (StockGrabber.OBSERVER_COUNT+1);
    }

    @Override
    public void update(double appl, double goog, double tsla){
    this.appl = appl;
    this.goog = goog;
    this.tsla = tsla;
    printPrices();
    }

    @Override
    public void printPrices() {
        System.out.println("Stock change alert: ");
        System.out.println(toString());
    }

    @Override
    public String toString() {
        return myName+"{" +
                "appl=" + appl +
                ", goog=" + goog +
                ", tsla=" + tsla +
                "}";
    }
}
