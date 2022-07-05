package cn.c2;

public class D17 {
    public static void main(String[] args) {
        int length = "dadawdadagagagaj".length();
        System.out.println("字符串的长度是:" + length);
        String s = "so";
        String s1 = "me";
        String s2 = s.concat(s1);
        System.out.println("拼接的字符串是:" + s2);
        char c = s2.charAt(3);
        System.out.println("在3号索引位置的字符是:" + c);
        String original = "HelloWorld";
        int index = original.indexOf("Hello");
        System.out.println("第一次出现的索引值位置是:"+index);
    }
}
