package com.codecool.uml.overriding;

public class Webshop {

    public static void main(String[] args) {
	Order order1 = new Order("new");
	Order order2 = new Order("processing");
	Order order3 = new Order("payed");
	Order order4 = new Order("checkout");

        System.out.println(order1);
        System.out.println(order2);
        System.out.println(order3);
        System.out.println(order4);

        CheckoutProcess checkoutProcess = new CheckoutProcess();
        checkoutProcess.action(order1);
        PaymentProcess paymentProcess = new PaymentProcess();
        paymentProcess.action(order3);

    }
}
