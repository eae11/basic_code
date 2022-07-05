package cn.c1;

public class DemoString01 {
    public static void main(String[] args) {
        //使用空参构造
        String str1 = "";
        System.out.println("第一个字符串:" + str1);

        //根据字符数组创建字符串
        char[] charArray = {'A', 'B', 'C'};
        String str2 = new String(charArray);
        System.out.println("第二个字符串:" + str2);

        //根据字节数组创建字符串
        byte[] byteArray = {97, 98, 99};
        String str3 = new String(byteArray);
        System.out.println("第三个字符串:" + str3);
    }
}
