package dn.d2;

/*
测试含有泛型的方法
 */
public class Demo02Main {
    public static void main(String[] args) {
        //创建GenericMethod对象
        GenericMethod gm = new GenericMethod();
        /*
        调用含有泛型的方法method01
        传递什么类型，泛型就是什么类型
        */
        gm.method1(10);
        gm.method1("abc");
        gm.method1(1.5);
        gm.method1(true);

        GenericMethod.method2("静态方法");
        GenericMethod.method2(1);
    }
}
