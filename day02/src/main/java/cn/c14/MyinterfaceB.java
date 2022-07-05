package cn.c14;

public interface MyinterfaceB {
    void methodB();

    void methodAbs();

    default void methodDefault() {
        System.out.println("BBB");
    }
}
