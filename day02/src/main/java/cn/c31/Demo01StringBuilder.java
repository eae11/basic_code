package cn.c31;

/*
java.lang.StringBuilder类：字符串缓冲区，可以提供字符串的效率
构造方法：
        StringBuilder()构造一个不带任何字符的字符生成器，其初始容量为16个字符。
        StringBuilder(String str)构造一个字符串生成器，并初始化为指定的字符串内容。
 */
public class Demo01StringBuilder {

    public static void main(String[] args) {
        StringBuilder s1 = new StringBuilder();
        System.out.println("s1:" + s1);
        StringBuilder s2 = new StringBuilder("abc");
        System.out.println("s2:" + s2);
    }
}
