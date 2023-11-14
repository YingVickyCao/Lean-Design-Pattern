package com.hades.example.designpatterns.singleton._2;

/**
 * <pre>
 * 优点：线程安全，
 *      延迟实例化
 *      保证只有一个实例
 * 缺点：
 *      (1)每次getInstance()都同步。实际上只有第一次调用时才需要同步。
 *      同步一个方法可能造成程序执行效率下降100倍。
 * </pre>
 */
public class Singleton {
    private static Singleton mInstance;
    private int mCount;

    public static synchronized Singleton getInstance() {
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
