package com.codecool.uml.overriding;

public class PaymentProcess extends AbstractProcess {
    @Override
    protected void action(Orderable item) {
        System.out.println("PaymentProcess action " +item);
    }
}
