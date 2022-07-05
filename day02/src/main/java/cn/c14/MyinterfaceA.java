package cn.c14;

public interface MyinterfaceA {
    //错误写法！接口不能有静态代码块
    /*static {

    }*/
    //错误写法！接口不能有构造方法
    /*public MyinterfaceA{

    }*/
    void methodA();

    void methodAbs();

    default void methodDefault() {
        System.out.println("AAA");
    }
}
