package cn.c14;

public class MyinterfaceImpl /*extends Object*/ implements MyinterfaceA, MyinterfaceB {
    @Override
    public void methodA() {
        System.out.println("覆盖了A方法");
    }

    @Override
    public void methodB() {
        System.out.println("覆盖了B方法");
    }

    @Override
    public void methodAbs() {
        System.out.println("覆盖了AB接口都有的抽象方法");
    }

    @Override
    public void methodDefault() {
        System.out.println("对多个接口当中冲突的默认方法进行了覆盖");
    }
}
