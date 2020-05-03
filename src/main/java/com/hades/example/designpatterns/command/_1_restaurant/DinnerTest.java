package com.hades.example.designpatterns.command._1_restaurant;

public class DinnerTest {
    public static void main(String[] args) {
        DinnerTest test = new DinnerTest();
        test.test();
    }

    /**
     * 炒米饭
     * 炒西红柿炒鸡蛋
     */
    private void test() {
        Cook cook = new Cook();
        Order order = new Order() {
            @Override
            public void orderUp() {
                cook.makeRice();
                cook.makeStirFriedTomatoes();
            }
        };
        Waitress waitress = new Waitress();
        Customer customer = new Customer(waitress);
        customer.createOrder(order);
    }
}