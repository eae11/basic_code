package cn.c6;

public class Zi extends Fu {
    public Zi() {
//        super();//调用父类无参构造方法。不写自动赠送
        super(20);//调用父类重载构造
        System.out.println("子类构造方法");
    }
}
