package dn.d38;

import java.util.function.Supplier;

/*
练习:求数组元素最大值
使用supplier接口作为方法参数类型，通过Lambda表达式求出int数组中的最大值。
提示:接口的泛型请使用java.Lang.Integer类。

 */
public class Demo06Test {
    public static int getMax(Supplier<Integer> sup) {
        return sup.get();
    }

    public static void main(String[] args) {
        int[] arr = {100, 2, 3, 5, 8};
        int maxValue = getMax(() -> {
            int max;
            max = arr[0];
            for (int i : arr) {
                if (i > max) {
                    max = i;
                }
            }
            return max;
        });
        System.out.println("数组中最大元素值是" + maxValue);
    }
}
