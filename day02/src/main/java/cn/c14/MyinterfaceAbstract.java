package cn.c14;

public abstract class MyinterfaceAbstract implements MyinterfaceA, MyinterfaceB {

    @Override
    public void methodA() {
        System.out.println("aaa");
    }

    @Override
    public void methodAbs() {

    }

    @Override
    public void methodDefault() {
        System.out.println("对多个接口当中冲突的默认方法进行了覆盖");
    }
}
