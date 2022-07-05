package c1;

public class Demo {
    public static void main(String[] args) {
        int[] a = new int[]{1, 2, 3, 5, 9, 7};
        int max = a[0];
        for (int i = 1; i < a.length; i++) {
            if (a[i] > max) {
                max = a[i];
            }
        }
        System.out.println(max);
    }
}