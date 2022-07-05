package c1;

import java.util.Scanner;

public class Demo05 {
    public static void main(String[] args) {
        int temp,min,max;
        int minindex=0, maxindex=0;
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int[] a = new int[num];
        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
        }
        min = a[0];
        for (int i = 1; i < a.length; i++) {
            if (a[i] < min) {
                min = a[i];
                minindex = i;
            }
        }
        max = a[0];
        for (int i = 1; i < a.length; i++) {
            if (a[i] > max) {
                max = a[i];
                maxindex = i;
            }
        }
        temp = a[minindex];
        a[minindex] = a[maxindex];
        a[maxindex] = temp;
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i]);
            System.out.print(" ");
        }
    }
}
