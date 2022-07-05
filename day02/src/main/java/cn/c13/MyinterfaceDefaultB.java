package cn.c13;

public class MyinterfaceDefaultB implements MyinterfaceDefault {
    @Override
    public void method() {
        System.out.println("实现了抽象方法,BBB");
    }

    @Override
    public void methodDefault() {
        System.out.println("实现类B覆盖了接口的默认方法");
    }
}
