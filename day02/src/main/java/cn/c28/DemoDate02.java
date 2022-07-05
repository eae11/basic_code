package cn.c28;

import java.util.Date;

public class DemoDate02 {
    public static void main(String[] args) {
        method();
        method2();
        method3();
    }

    /*
    Long getTime()把日期转换为毫秒值(相当于System.currentTimeMillis()方法)
    返回自 1970 年 1 月 1 日 00:00:00 GMT 以来此 Date 对象表示的毫秒数。
     */
    public static void method3() {
        Date date = new Date();
        long time = date.getTime();
        System.out.println(time);
    }

    /*
    Date类带参数的构造方法
    Date(Long date):传递毫米值，把毫秒值转换为date日期
     */
    public static void method2() {
        Date date = new Date(0L);
        System.out.println(date);
    }

    /*
    Date类的空参数构造方法
    Date()获取当前系统的日期和时间
     */
    public static void method() {
        Date date = new Date();
        System.out.println(date);
    }
}
