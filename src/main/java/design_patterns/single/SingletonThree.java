package design_patterns.single;

/**
 * 使用类的内部内
 * 线程安全
 */
public class SingletonThree {
    private SingletonThree() {};
    //实例持有者
    private static class InstanceHolder {
        private static SingletonThree instance = new SingletonThree();
    }
    public static SingletonThree getInstance() {
        return InstanceHolder.instance;
    }

}
