package cn.c1;

public class DemoStringConvert {
    public static void main(String[] args) {
        //转换为字符数组
        char[] chars="Hello".toCharArray();
        System.out.println(chars[0]);
        System.out.println(chars.length);
        //转换为字节数组
        byte[] bytes="Hello".getBytes();
        for (int i = 0; i < bytes.length; i++) {
            System.out.println(bytes[i]);
        }
        String str1="hhhhhiiiiillll";
        String str2=str1.replace('h','p');
        System.out.println(str2);
    }
}
