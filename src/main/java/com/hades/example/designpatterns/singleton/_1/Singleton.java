package com.hades.example.designpatterns.singleton._1;

public class Singleton {
    private static Singleton mInstance;
    private int mCount;

    public static Singleton getInstance() {
        if (null == mInstance) {
            mInstance = new Singleton();
        }
        return mInstance;
    }

    private Singleton() {
    }

    public void increment() {
        mCount++;
        System.out.println(mCount);
    }
}
