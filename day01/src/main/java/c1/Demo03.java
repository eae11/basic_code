package c1;

public class Demo03 {
    public static void main(String[] args) {
        int[] result = calculate(10, 20, 30);
        System.out.println(result[0]);
        System.out.println(result[1]);
    }

    public static int[] calculate(int a, int b, int c) {
        int sum = a + b + c;
        int ave = sum / 3;
        int[] array = {sum, ave};
        return array;
    }
}
