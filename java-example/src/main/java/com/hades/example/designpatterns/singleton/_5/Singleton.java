package com.hades.example.designpatterns.singleton._5;

/**
 * <pre>
 * 优点：线程安全
 *      延迟实例化
 *      保证只有一个实例
 *      自由序列化
 * </pre>
 */
public enum  Singleton {
    INSTANCE;
    private int mCount;

    public static Singleton getInstance() {
        return INSTANCE;
    }

    public void increment() {
        System.out.println("increment START");
        mCount++;
        System.out.println(mCount);
        System.out.println("increment END");
    }
}
