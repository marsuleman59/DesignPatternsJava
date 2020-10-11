package com.patternss.designpatterns.strategy;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {

    List<Items> items = new ArrayList<>();

    public void makePayment(PaymentType paymentType){
    paymentType.makePayment();
    }
}
