package cn.c1;

public class Myclass {
    int num;
    static int numStatic;

    //成员方法
    public void method() {
        System.out.println("这是一个普通的成员方法。");
        //成员方法可以访问成员变量
        System.out.println(num);
        //成员方法可以访问静态变量
        System.out.println(numStatic);
    }

    //静态方法
    public static void methodStatic() {
        System.out.println("这是一个静态方法。");
        //静态方法可以访问静态变量
        System.out.println(numStatic);
        /*静态方法不能直接访问非静态
        System.out.println(num);*/
        /*静态方法中不能使用this关键字。
        System.out.println(this);*/
    }
}
