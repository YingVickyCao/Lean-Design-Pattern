package com.hades.example.designpatterns.command._1_restaurant;

public class Customer {
    private Waitress mWaitress;

    public Customer(Waitress waitress) {
        mWaitress = waitress;
    }

    public void createOrder(Order order){
        mWaitress.takeOrder(order);
    }
}
