package cn.c2;

import java.util.Arrays;

public class D22 {
    public static void main(String[] args) {
        String str = "dawjoigjajihwpgjapojvopjap";
        char[] chars = str.toCharArray();
        Arrays.sort(chars);
        for (int i = chars.length - 1; i >= 0; i--) {
            System.out.println(chars[i]);
        }
    }
}
