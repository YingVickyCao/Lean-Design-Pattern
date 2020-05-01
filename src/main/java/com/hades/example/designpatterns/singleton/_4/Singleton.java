package com.hades.example.designpatterns.singleton._4;

/**
 * <pre>
 * 优点：线程安全。
 *      保证只有一个实例
 * 缺点：
 *      (1)急切实例化，而不是延迟实例化。
 *      依赖JVM在加载这个类类时马上创建此唯一的单件实例。JVM确保在任何线程访问mInstance之前，一定先创建此实例
 *      适合：程序总是创建并使用单例模式，或在创建和运行时的负担不太繁重。
 *</pre>
 */
public class Singleton {
    private static Singleton mInstance = new Singleton();
    private int mCount;

    public static Singleton getInstance() {
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
