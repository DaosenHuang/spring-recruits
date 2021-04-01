package design_patterns.single;

/**
 * 饿汉模式
 * 直接初始化
 */
public class SingletonTwo {
    public static SingletonTwo instance = new SingletonTwo();
    private SingletonTwo() {};
    public static SingletonTwo getInstance() {
        return instance;
    }
}
