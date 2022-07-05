package cn.c14;

public interface Myinterface {
    default void method() {
        System.out.println("接口的默认方法");
    }
}
