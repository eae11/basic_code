package dn.d2;

/*
测试含有泛型的接口
 */
public class Demo03Main {
    public static void main(String[] args) {
        //创建创建GenericInterfaceImpl对象
        GenericInterfaceImpl1 gi1 = new GenericInterfaceImpl1();
        gi1.method1("哈哈哈");
        GenericInterfaceImpl2<Integer> gi2 = new GenericInterfaceImpl2<>();
        gi2.method1(10);
        GenericInterfaceImpl2<String> gi3 = new GenericInterfaceImpl2<>();
        gi3.method1("hhh");
    }
}
