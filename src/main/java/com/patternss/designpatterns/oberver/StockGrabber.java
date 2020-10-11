package com.patternss.designpatterns.oberver;

import java.util.ArrayList;
import java.util.List;

public class StockGrabber implements Subject {

    public static int OBSERVER_COUNT = 0;

    private double appl;
    private double goog;
    private double tsla;

    private List<Observer> observers;

    StockGrabber() {
        observers = new ArrayList<>();
    }

    @Override
    public void register(Observer observer) {
        observers.add(observer);
        System.out.println("Stock Observer created, Current count: "+(++OBSERVER_COUNT));
        System.out.println("Current observers: "+observers);
//        observers.stream().forEach(obs -> obs.printPrices());
    }

    @Override
    public void unRegister(Observer observer) {
        String myName = ((StockObserver) observer).getMyName();
        System.out.println("Observer removed successfully: "+myName);
    }

    @Override
    public void notifyObserver() {
    observers.forEach(observer -> observer.update(appl, goog, tsla));
    }

    public void setAppl(double appl) {
        this.appl = appl;
        notifyObserver();
    }

    public void setGoog(double goog) {
        this.goog = goog;
        notifyObserver();
    }

    public void setTsla(double tsla) {
        this.tsla = tsla;
        notifyObserver();
    }

}
