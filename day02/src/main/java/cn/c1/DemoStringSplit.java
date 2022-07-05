package cn.c1;

/*
分割字符串的方法：
public String[] split （String regex）：按照参数的规则，将字符串切分成为若干部分。
注意事项：
split方法的参数其实是一个“正则表达式”，今后学习。
今天要注意：如果按英文句点“.”进行切分，必须写“\\.”。
 */
public class DemoStringSplit {
    public static void main(String[] args) {
        String s1 = "aaa,bbb,ccc";
        String[] a = s1.split(",");
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
        String s2 = "aaa bbb ccc";
        String[] b = s2.split(" ");
        for (int i = 0; i < b.length; i++) {
            System.out.println(b[i]);
        }
        String s3 = "XXX.YYY.ZZZ";
        String[] c = s3.split(".");
        for (int i = 0; i < c.length; i++) {
            System.out.println(c[i]);
        }
        System.out.println(c.length);
    }
}
