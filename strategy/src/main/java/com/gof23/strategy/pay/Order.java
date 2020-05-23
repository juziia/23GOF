package com.gof23.strategy.pay;

public class Order {

    private static final PayStrategy payStrategy = new PayStrategy();


    private String uid;
    private String orderid;
    private double price;

    public Order(String uid, String orderid, double price) {
        this.uid = uid;
        this.orderid = orderid;
        this.price = price;
    }


    public MessageResult pay(PayKey payKey){

        return payStrategy.getPayment(payKey).pay(this.orderid,uid,price);
    }

}
