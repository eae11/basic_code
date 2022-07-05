package dn.d18;

/*
主线程:执行主(main)方法的线程
单线程程序;java程序中只有一个线程
执行从main方法开始,从上到下依次执行
IV执行main方法，main方法会进入到机内存
JVM会找操作系统开辟一条main方法通向cpu的执行路径
cpu就可以通过这个路径来执行main方法
而这个路径有一一个名字叫main(主)线程

 */
public class Demo01Thread {
    public static void main(String[] args) {
        Person one = new Person("小强");
        one.run();
        System.out.println(0 / 0);
        Person two = new Person("小明");
        two.run();
    }
}
