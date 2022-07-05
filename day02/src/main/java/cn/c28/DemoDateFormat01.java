package cn.c28;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/*
java.text.DateFormat:是日期/时间格式化子类的抽象类
作用：
    格式化(也就是日期->文本) 、解析(文本->日期)
    成员方法:
    String format(Date date)按照指定的模式，把Date日期格式化为符合模式的字符串
    Date parse(String source)  把符合模式的字符串，解析为Date日期
    [DateFormat类是一个抽象类，无法直接创建对象使用，可以使用DateFormat类的子类]
    java.text.SimpleDateFormat extends DateFormat
    构造方法:
    SimpleDateFormat(String pattern)
        用给定的模式和默认的语音环境的日期格式符合构造 SimpleDateFormat。
        参数：
            String patter：传递指定的模式
            模式：区分大小写的
            y年M月d日H时m分s秒
            写对应的模式，会把模式替换为对应的日期和时间
            "yyyy-MM-dd HH:mm:ss"
            注意:
            模式中的字母不能更改，连接模式的符号可以改变
            "yyyy年MM月dd日 HH时mm分ss秒"
 */
public class DemoDateFormat01 {
    public static void main(String[] args) throws ParseException {
        method1();
    }

    /*
    使用DateFormat类当中的format方法，把日期格式化为文本
    使用步骤：
    1、创建SimpleDateFormat对象，构造方法中传递指定模式
    2、调用SimpleDateFormat对象中的format方法，按照构造方法中指定的模式，把date日期格式化为符合模式的字符串(文本)
     */
    public static void method1() {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日 HH时mm分ss秒");
        Date date = new Date();
        String d = sdf.format(date);
        System.out.println(date);
        System.out.println(d);
    }

    /*
    使用DateFormat类当中的parse方法，把文本解析为日期
    使用步骤：
    1、创建SimpleDateFormat对象，构造方法中传递指定模式
    2、调用SimpleDateFormat对象中的parse方法，按照构造方法中指定的模式，解析为Date日期
    注意事项：public Date parse(String source) throws ParseException
            parse方法声明了一个异常叫ParseException
            如果字符串和构造方法的模式不一样，那么程序就会抛出异常
            调用一个抛出异常的方法，就必须处理这个异常，要么throws继续抛出这个异常，要么try catch自己处理
     */
    public static void method2() throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日 HH时mm分ss秒");
        Date date = sdf.parse("2020年06月23日 16时25分59秒");
        System.out.println(date);
    }
}
