package cn.c2;

import java.util.Scanner;

public class D1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        int temp=a>b?a:b;
        int max=temp>c?temp:c;
        System.out.println("最大值是:"+max);
    }
}
