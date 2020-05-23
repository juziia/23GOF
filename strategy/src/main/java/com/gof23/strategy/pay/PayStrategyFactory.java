package com.gof23.strategy.pay;

public class PayStrategyFactory {

    private PayStrategy payStrategy;

    public PayStrategyFactory(PayStrategy payStrategy) {
        this.payStrategy = payStrategy;
    }

    public Payment getPayment(PayKey payKey){
        return payStrategy.getPayment(payKey);
    }
}
