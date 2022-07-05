package dn.d21;

/*
    模拟卖票案例
    创建3个线程,同时开启,对共享的票进行出售

 */
public class Demo01Ticket {
    public static void main(String[] args) {
        //创建Runnable接口的实现类对象
        RunnableImpl r = new RunnableImpl();
        //创建Thread类对象，, 构造方法中传递Runnable接口的实现类对象
        Thread t0 = new Thread(r);
        Thread t1 = new Thread(r);
        Thread t2 = new Thread(r);
        t0.start();
        t1.start();
        t2.start();
    }
}
