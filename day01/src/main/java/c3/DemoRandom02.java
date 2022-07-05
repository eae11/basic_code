package c3;

import java.util.Random;
//题目要求根据int变量n的值，来获取随机数字，范围[1,n]

public class DemoRandom02 {
    public static void main(String[] args) {
        int n=5;
        Random r=new Random();
        int num=r.nextInt(n)+1;
    }
}
