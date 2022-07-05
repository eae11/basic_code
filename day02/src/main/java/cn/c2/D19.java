package cn.c2;

public class D19 {
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

        String[] d = s3.split("\\.");
        for (int i = 0; i < d.length; i++) {
            System.out.println(d[i]);
        }
        System.out.println(d.length);
    }
}
