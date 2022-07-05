package cn.c2;

import java.util.Scanner;

public class D3 {
    public static void main(String[] args) {
//        普通使用方式
//        Scanner sc = new Scanner(System.in);
//        int num = sc.nextInt();
//        匿名对象使用方式
//        int num = new Scanner(System.in).nextInt();
//        System.out.println(num);
//        一般写法传入参数
//        Scanner sc=new Scanner(System.in);
//        methodParam(sc);
//        使用匿名对象来进行传参
//        methodParam(new Scanner(System.in));
//    }
//    public static void methodParam (Scanner sc){
//        int num = sc.nextInt();
//        System.out.println("输入的是:"+num);
        Scanner sc = methodReturn();
        int num = sc.nextInt();
        System.out.println("输入的是"+num);
    }
    public static Scanner methodReturn(){
//        Scanner sc =new Scanner(System.in);
//        return  sc;
        return new Scanner(System.in);//匿名对象
    }
}
