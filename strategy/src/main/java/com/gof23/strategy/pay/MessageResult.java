package com.gof23.strategy.pay;

/**
 *  付款消息类
 */
public class MessageResult {

    private String orderId;
    private String uid;
    private double price;
    private String state;

    public MessageResult(String orderId, String uid, double price, String state) {
        this.orderId = orderId;
        this.uid = uid;
        this.price = price;
        this.state = state;
    }


    @Override
    public String toString() {
        return "MessageResult{" +
                " 用户id='" + uid + '\'' +
                ", 订单id='" + orderId + '\'' +
                ", 价格=" + price +
                ", 支付状态='" + state + '\'' +
                '}';
    }
}
