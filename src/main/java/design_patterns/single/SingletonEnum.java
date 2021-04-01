package design_patterns.single;

public enum SingletonEnum {
    INSTANCE("黄雨");
    public String name;
    private SingletonEnum(String name){
        this.name = name;
    };
}
