package com.gof23.strategy.pay;

public class PayStrategyTest {

    public static void main(String[] args) {
        PayStrategyFactory payStrategyFactory = new PayStrategyFactory(new PayStrategy());

        Payment payment = payStrategyFactory.getPayment(PayKey.ALIPAY);
        payment.pay("1001","1",2000);
    }
}
