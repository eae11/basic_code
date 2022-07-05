package cn.c1;

public class Zi extends Fu {
    int numZi = 20;
    int num = 200;
    public void methodZi(){
        //因为本类当中有num，所以这里用本类的num，没有则往上找
        System.out.println(num);
    }
}
