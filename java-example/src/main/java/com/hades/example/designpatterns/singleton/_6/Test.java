package com.hades.example.designpatterns.singleton._6;

public class Test {
    public static void main(String[] args) {
        Test test = new Test();
//        test.singleThread();
        test.multipleThread();
    }

    /**
     * 1,1
     */
    private void singleThread() {
        Singleton singleton = Singleton.getInstance();//  1
        singleton.increment();

        Singleton singleton2 = Singleton.getInstance();// 2
        singleton2.increment();
    }

    /**
     * 1,2
     */
    private void multipleThread() {
        new Thread(new Runnable() {
            @Override
            public void run() {
                Singleton singleton = Singleton.getInstance();
                singleton.increment();
            }
        }).start();

        new Thread(new Runnable() {
            @Override
            public void run() {
                Singleton singleton2 = Singleton.getInstance();
                singleton2.increment();
            }
        }).start();
    }
}