package com.patternss.designpatterns.strategy;

public class main {
    public static void main(String[] args) {

        ShoppingCart shoppingCart = new ShoppingCart();
        CreditPaymentType creditPaymentType  = new CreditPaymentType();
        PayPalPaymentType payPalPaymentType = new PayPalPaymentType();

        shoppingCart.makePayment(creditPaymentType);
        shoppingCart.makePayment(payPalPaymentType);



    }
}
