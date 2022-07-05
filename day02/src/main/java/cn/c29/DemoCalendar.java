package cn.c29;

import java.util.Calendar;

/*
java.util.Calendar类：日历类
Calendar类是一个抽象类，里面提供了很多操作日历字段的方法
Calendar类无法直接创建对象使用，里面有一个静态方法getInstance(),该方法返回了Calendar类的子类对象

 */
public class DemoCalendar {
    public static void main(String[] args) {
        Calendar c=Calendar.getInstance();//返回子类对象，多态
        System.out.println(c);
    }
}
