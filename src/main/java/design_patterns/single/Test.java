package design_patterns.single;

public class Test {
    public static void main(String[] args) {
        SingletonEnum me = SingletonEnum.INSTANCE;
        System.out.println(me.name);

    }
}
