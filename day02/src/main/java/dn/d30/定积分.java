package dn.d30;

import java.util.Scanner;

public class 定积分 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        int n = 1000;
        double sum = 0;
        for (int i = 0; i < 1000; i++) {
            sum += f1(a + (b - a) / n * i) * (b - a) / n;
        }
        System.out.println(sum);
    }

    public static double f1(double x) {
        return x * x;
    }
}
