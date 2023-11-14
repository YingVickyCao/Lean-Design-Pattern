package com.hades.example.designpatterns.command._1_restaurant;

public class Waitress {
    private Order mOrder;

    public Waitress() {
    }

    public void takeOrder(Order order){
        this.mOrder = order;
        order.orderUp();
    }
}