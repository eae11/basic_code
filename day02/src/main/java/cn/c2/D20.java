package cn.c2;

public class D20 {
    public static void main(String[] args) {
        int[] a = {1, 2, 3};
        String s2 = pingJie(a);
        System.out.println(s2);
    }

    public static String pingJie(int[] a) {
        String s1 = "[";
        for (int i = 0; i < a.length; i++) {
            if (i == a.length - 1) {
                s1 += "word" + a[i] + "]";
            } else {
                s1 += "word" + a[i] + "#";
            }
        }
        return s1;
    }
}
