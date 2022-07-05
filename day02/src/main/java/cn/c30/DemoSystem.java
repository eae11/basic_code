package cn.c30;

import java.util.Arrays;

/*
public static long currentTimeMillis()返回以毫秒为单位的当前时间。
public static void arrayCopy(Object src,int srcPos,Object dest,int destPos,int length)从指定源数组中复制一个数组
src-源数组
srcPos-源数组中的起始位置(起始索引)
dest-目标数组
dest-目标数据中的起始位置
Length-要复制的数组元素的数量
 */
public class DemoSystem {
    public static void main(String[] args) {
        method2();
    }

    public static void method1() {
        long s = System.currentTimeMillis();
        int num = 0;
        for (int i = 1; i <= 9999; i++) {
            num += i;
        }
        long e = System.currentTimeMillis();
        System.out.println("共耗时:" + (e - s) + "毫秒");
    }

    public static void method2() {
        int[] a = {1, 2, 3, 4, 5};
        int[] b = {5, 8, 9, 10, 11};
        System.arraycopy(a, 1, b, 0, 3);
        System.out.println(Arrays.toString(b));
    }
}
