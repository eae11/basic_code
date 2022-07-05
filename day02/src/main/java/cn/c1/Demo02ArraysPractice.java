package cn.c1;

import java.util.Arrays;

public class Demo02ArraysPractice {
    public static void main(String[] args) {
        String str = "dwaggongagonoawngonaonge46";
        char[] chars = str.toCharArray();
        Arrays.sort(chars);
        for (int i = chars.length - 1; i >= 0; i--) {
            System.out.println(chars[i]);
        }
    }
}
