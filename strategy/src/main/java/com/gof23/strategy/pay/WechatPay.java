package com.gof23.strategy.pay;

public class WechatPay extends Payment {
    /**
     *  查询微信余额
     * @param uid
     * @return
     */
    public double findBalance(String uid) {
        return 2000;
    }
}
