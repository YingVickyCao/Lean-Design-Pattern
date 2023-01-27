package com.hades.example.designpatterns.singleton._6;

/**
 * <pre>
 * 优点：线程安全
 *      延迟实例化
 *      保证只有一个实例
 *      双重检查加锁，在getInstance()中减少使用同步，从而减少getInstance()的时间消耗。
 * </pre>
 */
public class Singleton {
    private static Singleton mInstance;
    private int mCount;

    public static Singleton getInstance() {
        Singleton local = mInstance;
        if (null == local) {
            synchronized (Singleton.class) {
                if (null == mInstance) {
                    mInstance = local = new Singleton();
                }
            }
        }
        return local;
    }

    public void increment() {
        System.out.println("increment START:" + Thread.currentThread().getName());
        System.out.println("before count:" + mCount + "," + Thread.currentThread().getName());
        mCount++;
        System.out.println("==>after count:" + mCount + "," + Thread.currentThread().getName());
        System.out.println("increment END:" + Thread.currentThread().getName());
    }

    public int getCount() {
        return mCount;
    }
}
