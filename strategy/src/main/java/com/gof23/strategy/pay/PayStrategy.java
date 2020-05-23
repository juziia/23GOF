package com.gof23.strategy.pay;

import java.util.HashMap;
import java.util.Map;

/**
 *  支付方式策略类
 */
public class PayStrategy {

    private static Map<PayKey,Payment> PAY_STRATEGY = new HashMap<PayKey, Payment>();



    static {
        Payment defaultPay = new AliPay();      //默认使用阿里
        PAY_STRATEGY.put(PayKey.ALIPAY,defaultPay);
        PAY_STRATEGY.put(PayKey.DEFAULT,defaultPay);
        PAY_STRATEGY.put(PayKey.WECHARPAY,new WechatPay());
        PAY_STRATEGY.put(PayKey.UNION,new UnionPay());
    }


    public Payment getPayment(PayKey payKey){
        if (! PAY_STRATEGY.containsKey(payKey)){
            return PAY_STRATEGY.get(PayKey.DEFAULT);
        }

        return PAY_STRATEGY.get(payKey);
    }


}
