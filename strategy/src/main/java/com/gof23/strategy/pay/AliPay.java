package com.gof23.strategy.pay;

public class AliPay extends Payment {


    public double findBalance(String uid) {
        System.out.println("支付方式: 支付宝");
        return 200;
    }
}
