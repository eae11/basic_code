package dn.d18;

public class Demo04Thread {
    public static void main(String[] args) {
        //开启多线程
        MyThread03 mt = new MyThread03();
        mt.setName("新的线程1");
        mt.start();
        //开启多线程
        new MyThread03("新的线程2").start();
    }
}
