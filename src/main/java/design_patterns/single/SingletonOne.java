package design_patterns.single;

/**
 * 懒汉模式
 * 线程不安全
 */
public class SingletonOne {
    public static SingletonOne instance;
    private SingletonOne() {};
    public static synchronized SingletonOne  getInstance() { // 加锁不加锁
        if (null != instance) return instance;

        instance = new SingletonOne();
        return instance;
    }

}
