package c3;

import java.util.Random;

/*
Random类用来生成随机数字。使用起来也算三个步骤：
 1.导包
 import java.util.Random;
 2.创建
 Random r=new Random();
 3.使用
获取一个随机的int数字（范围是int所有范围是正负两种）int num=r.nextInt（）；
获取一个随机的int数字（参数代表了范围，左闭右开）int num=r.nextInt（3）
 [0,3),也就是0~2
 */
public class DemoRandom {
    public static void main(String[] args) {
        Random r = new Random();
        int num = r.nextInt();
        System.out.println("随机数是：" + num);
    }
}
