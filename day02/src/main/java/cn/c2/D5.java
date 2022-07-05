package cn.c2;

import java.util.Random;

public class D5 {
    public static void main(String[] args) {
        Random r = new Random();
        for (int i = 0; i < 100; i++) {
            int num = r.nextInt(5) + 1;
            System.out.println(num);
        }
    }
}
