package cn.c10;

public class Zi extends Fu {
    public Zi(){
        //赠送的super();
        System.out.println("子类构造方法执行");
    }
    @Override
    public void eat() {
        System.out.println("吃饭饭");
    }
}
