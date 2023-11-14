package com.hades.example.designpatterns.singleton._1;

/**
 * 优点：延迟实例化
 * 缺点：线程不安全。
 *      不能保证只有一个实例
 */
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
        System.out.println("increment START");
        mCount++;
        System.out.println(mCount);
        System.out.println("increment END");
    }
}
