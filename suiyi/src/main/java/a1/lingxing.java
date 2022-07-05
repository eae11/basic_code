package a1;

public class lingxing {
    public static void main(String[] args) {
        int row=4;
        for (int i = 1; i <= 4; i++) {
            int time=4-i;
            int times=2*i-1;
            for (int i1 = 0; i1 < time; i1++) {
                System.out.print(" ");
            }
            for (int i1 = 0; i1 < times; i1++) {
                System.out.print("*");
            }
            for (int i1 = 0; i1 < time; i1++) {
                System.out.print(" ");
            }
            System.out.println();
        }
        for (int i = 4; i >=1; i--) {
            int time=4-i;
            int times=2*i-1;
            for (int i1 = 0; i1 < time; i1++) {
                System.out.print(" ");
            }
            for (int i1 = 0; i1 < times; i1++) {
                System.out.print("*");
            }
            for (int i1 = 0; i1 < time; i1++) {
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}
