package com.gof23.strategy.pay;

public class UnionPay extends Payment {


    public double findBalance(String uid) {
        System.out.println("支付方式: 银联");

        return 100;
    }
}
