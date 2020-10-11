package com.patternss.designpatterns.strategy;

public class CreditPaymentType implements PaymentType {

    @Override
    public void makePayment() {
        System.out.println("Payment made through credit card");
    }
}
