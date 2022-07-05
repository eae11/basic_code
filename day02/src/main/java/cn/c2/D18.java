package cn.c2;

public class D18 {
    public static void main(String[] args) {
        String s1 = "Hello";
        char[] chars = s1.toCharArray();
        System.out.println(chars[0]);
        System.out.println(chars.length);
        byte[] bytes = "abc".getBytes();
        for (int i = 0; i < bytes.length; i++) {
            System.out.println(bytes[i]);
        }
        String s2 = "How do you do";
        String s3 = s2.replace("o", "*");
        System.out.println(s3);
    }
}
