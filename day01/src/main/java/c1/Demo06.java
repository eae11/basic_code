package c1;

import java.util.Scanner;

public class Demo06 {
    public static void main(String[] args) {
        int max,nextMax;
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int[] a = new int[num];
        for (int i = 0; i < a.length; i++) {
            a[i]=sc.nextInt();
        }
        max=a[0];
        for (int i = 1; i < a.length; i++) {
            if(a[i]>max){
                max=a[i];
            }
        }
        nextMax=a[0];
        for (int i = 1; i < a.length; i++) {
            if(a[i]>nextMax&&a[i]<max){
                nextMax=a[i];
            }
        }
        System.out.print(max);
        System.out.print(" ");
        System.out.print(nextMax);
    }
}
