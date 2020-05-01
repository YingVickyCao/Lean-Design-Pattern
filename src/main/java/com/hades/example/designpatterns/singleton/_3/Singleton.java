package com.hades.example.designpatterns.singleton._3;

/**
 * <pre>
 * 优点：线程安全
 *      延迟实例化
 *      保证只有一个实例
 *      双重检查加锁，在getInstance()中减少使用同步，从而减少getInstance()的时间消耗。Java >=5,否则旧版中JVM对于volatile的实现会导致双重检查加锁的失效。
 * </pre>
 */
public class Singleton {
    private volatile static Singleton mInstance;
    private int mCount;

    public static Singleton getInstance() {
        if (null == mInstance) {
            synchronized (Singleton.class) {
                if (null == mInstance) {
                    mInstance = new Singleton();
                }
            }
        }
        return mInstance;
    }

    public void increment() {
        System.out.println("increment START");
        mCount++;
        System.out.println(mCount);
        System.out.println("increment END");
    }

    public int getCount() {
        return mCount;
    }
}
