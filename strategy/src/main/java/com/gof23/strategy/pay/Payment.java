package com.gof23.strategy.pay;

/**
 *  付款类
 */
public abstract class Payment {

    // 根据id查询余额
    protected abstract double findBalance(String uid);


    public MessageResult pay(String orderId,String uid,double price){
        // 查询余额
        double balance = this.findBalance(uid);
        if(balance < price){
            return new MessageResult(orderId,uid,price,"500 支付失败");
        }

        return new MessageResult(orderId,uid,price,"支付成功");
    }

}
