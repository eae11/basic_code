package dn.d34;

import java.io.FileNotFoundException;
import java.io.PrintStream;

/*
可以改变输出语句的目的地(打印流的流向)
输出语句,默认在控制台输出
使用system.setout方法改变输出语句的目的地改为参数中传递的打印流的目的地
static void setout ( Printstream out)
重新分配“标准”输出流。

 */
public class Demo05PrintStream {
    public static void main(String[] args) throws FileNotFoundException {
        System.out.println("我是在控制台输出的");
        PrintStream ps = new PrintStream("D:\\IdeaProjoct\\basic-code\\day02\\src\\dn\\d34\\3.txt");
        System.setOut(ps);//把输出语句的自的地改变为打印流的自的地
        System.out.println("我在打印流的目的地中输出");
        ps.close();
    }
}
