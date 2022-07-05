package cn.c29;

import java.util.Calendar;
import java.util.Date;

/*
Calendar类的常用成员方法：
public abstract  void add(int field, int amount):根据日历的规则，为给定的日历字段添加或减去指定的时间量。
public int get(int field):返回给定日历字段的值。
public Date getTime():返回一个表示此 Calendar 时间值（从历元至现在的毫秒偏移量）的 Date 对象。
public void set(int field, int value):将给定的日历字段设置为给定值
 成员方法的参数：
 int field：日历类的字段，可以使用Calendar类的静态成员变量获取
    public static final int YEAR = 1; 年
    public static final int MONTH = 2;月
    public static final int DATE = 5;日
    public static final int DAY_OF_MONTH = 5;月中的某一天
    public static final int HOUR = 10;时
    public static final int MINUTE = 12;分
    public static final int SECOND = 13;秒
 */
public class Demo02Calendar {
    public static void main(String[] args) {
        method3();
    }

    /*
    public int get(int field):返回给定日历字段的值。
    参数:传递指定的日历字段(YEAR,MOUTH...)
    返回值：日历字段代表具体的值。
     */
    public static void method1() {
        Calendar c = Calendar.getInstance();
        int year = c.get(Calendar.YEAR);
        System.out.println(year);
        int mouth = c.get(Calendar.MONTH);
        System.out.println(mouth);//西方月份0-11，东方1-12
        int day = c.get(Calendar.DAY_OF_MONTH);
        System.out.println(day);
    }

    /*
    public void set(int field, int value):将给定的日历字段设置为给定值
    参数 ：
    int field：传递指定的日历字段(YEAR,MONTH...)
    int value:给指定字段设置值
     */
    public static void method2() {
        Calendar c = Calendar.getInstance();
        c.set(Calendar.YEAR, 9999);//设置年
        c.set(Calendar.MONTH, 9);//设置月
        c.set(Calendar.DATE, 9);//设置日
        //同时设置年月日
        c.set(8888, 6, 5);
        int year = c.get(Calendar.YEAR);
        System.out.println(year);
        int mouth = c.get(Calendar.MONTH);
        System.out.println(mouth);//西方月份0-11，东方1-12
        int day = c.get(Calendar.DAY_OF_MONTH);
        System.out.println(day);
    }

    /*
    public abstract  void add(int field, int amount):根据日历的规则，为给定的日历字段添加或减去指定的时间量。
    把指定的字段增加/减少指定的值
    参数:
        int field:传递指定的日历字段(YEAR,MONTH...)
        int amount：增加/减少指定的值
          正数：增加
          负数：减少
     */
    public static void method3() {
        Calendar c = Calendar.getInstance();
        c.add(Calendar.YEAR, 2);
        c.add(Calendar.MONTH, 2);
        c.add(Calendar.DATE, 2);
        int year = c.get(Calendar.YEAR);
        System.out.println(year);
        int mouth = c.get(Calendar.MONTH);
        System.out.println(mouth);//西方月份0-11，东方1-12
        int day = c.get(Calendar.DAY_OF_MONTH);
        System.out.println(day);
    }

    /*
    public Date getTime():返回一个表示此 Calendar 时间值（从历元至现在的毫秒偏移量）的 Date 对象。
    把日历对象，转换为日期对象。
     */
    public static void method4() {
        Calendar c = Calendar.getInstance();
        Date date = c.getTime();
        System.out.println(date);

    }
}
