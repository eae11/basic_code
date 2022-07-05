package cn.c1;

import java.util.Arrays;

public class DemoArrays {
    public static void main(String[] args) {
        int[] array = new int[]{10, 11, 12};
        String str = Arrays.toString(array);
        System.out.println(str);
        int[] array1 = {2, 4, 1, 6, 5};
        Arrays.sort(array1);
        System.out.println(Arrays.toString(array1));
        String[] array2 = {"ccc", "bbb", "aaa"};
        Arrays.sort(array2);
        System.out.println(Arrays.toString(array2));
    }
}
