package cn.c28;

/*
    java.util.Date:表示日期和时间的类
    类Date表示特定的瞬间，精确到毫秒。
    毫秒：千分之一秒
    特定的一个瞬间：一个时间点，一刹那时间
    毫米值的作用：可以对时间和日期进行计算
    2099-01-03到2088-01-01中间一共有多少天
    可以日期转换为毫米计算，计算完毕后，把毫米转换为日期

    把日期转换为毫米:
     当前日期:2020-06-23
     时间原点(0毫秒）:1970 年 1月 1日  00：00:00(英国格林威治)
     就是计算当前日期到时间原点之间一共经历了多少毫秒
     把毫米转换为日期:
        1 天 = 24 × 60 × 60 = 86400 秒 =86400*1000=86400000毫秒
      注意：
        中国属于东八区，会增加8个小时
        1970 年 1月 1日  08：00:00
 */
public class DemoDate01 {
    public static void main(String[] args) {
        System.out.println(System.currentTimeMillis());
    }
}
