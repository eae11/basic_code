package cn.c1;

/*
java.util.Math类是数学相关的工具类，里面提供了大量的静态方法，完成与数学运算相关的操作。

public static double abs（double num）：获取绝对值。有多种重载。
public static double ceil（double num）：向上取整。
public static double floor（double num）：向下取整。
public static Long round（double num）:四舍五入。
Math.PI代表近似圆周率常量。
 */
public class DemoMath {
    public static void main(String[] args) {
        System.out.println(Math.abs(-2.5));
        System.out.println(Math.ceil(4.1));
        System.out.println(Math.floor(3.9));
        System.out.println(Math.round(5.5));
    }
}
