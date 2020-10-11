package com.patternss.designpatterns.oberver;

public class main {
    public static void main(String[] args) {

        StockGrabber stockMarket = new StockGrabber();

        stockMarket.register(new StockObserver("OBS"));

        stockMarket.setAppl(1212.12);
        stockMarket.setGoog(12.12);
        stockMarket.setTsla(605.12);

        StockObserver stockObserver = new StockObserver("OBS");
        stockMarket.register(stockObserver);
        stockMarket.setTsla(65.12);

        stockMarket.unRegister(stockObserver);

        stockMarket.setTsla(9);

        StockObserver stockObserver3 = new StockObserver("EURO");
        stockMarket.register(stockObserver3);


    }
}
