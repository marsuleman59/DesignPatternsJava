package com.patternss.designpatterns.strategy;

public class PayPalPaymentType implements PaymentType {

    @Override
    public void makePayment() {
        System.out.println("Payment made through paypal");
    }
}
