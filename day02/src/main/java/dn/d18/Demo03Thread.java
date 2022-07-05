package dn.d18;

public class Demo03Thread {
    public static void main(String[] args) {
        //创建Thread类的子类对象
        MyThread02 mt = new MyThread02();
        //调用start方法,开启新线程,执行run方法
        mt.start();

        new MyThread02().start();
        new MyThread02().start();
        //链式编程
        System.out.println(Thread.currentThread().getName());
    }
}
