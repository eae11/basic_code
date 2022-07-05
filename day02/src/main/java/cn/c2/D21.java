package cn.c2;

import java.util.Scanner;

public class D21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int countLower = 0;
        int countUpper = 0;
        int countNum = 0;
        int countOther = 0;
        String s = sc.next();
        char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] > '0' && chars[i] < '9') {
                countNum++;
            } else if (chars[i] >= 65 && chars[i] < 97) {
                countUpper++;
            } else if (chars[i] >= 97 && chars[i] <= 122) {
                countLower++;
            } else {
                countOther++;
            }
        }
        System.out.println(countLower);
        System.out.println(countUpper);
        System.out.println(countNum);
        System.out.println(countOther);
    }
}
