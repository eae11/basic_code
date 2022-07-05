package a1;

public class chengfabiao {
    public static void main(String[] args) {
        System.out.println("-------------------------------原表----------------------------------------");
        for (int i = 1; i <= 9; i++) {
            for (int j = 1; j <= 9; j++) {
                String text = i + "*" + j + "=";
                System.out.print(text + i * j + "\t");
            }
            System.out.println();
        }
        System.out.println("-----------------------------------------------------------------------------");
        System.out.println("-------------------------------左下三角-------------------------------------------");
        for (int i = 1; i <= 9; i++) {
            for (int j = 1; j <= 9; j++) {
                String text = i + "*" + j + "=";
                if (j > i) {
                    System.out.print("\t");
                } else {
                    System.out.print(text + i * j + "\t");
                }
            }
            System.out.println();
        }
        System.out.println("-----------------------------------------------------------------------------");
        System.out.println("-------------------------------右上三角------------------------------------------");
        for (int i = 1; i <= 9; i++) {
            for (int j = 1; j <= 9; j++) {
                String text = i + "*" + j + "=";
                if (i > j) {
                    System.out.print("\t\t");
                } else {
                    System.out.print(text + i * j + "\t");
                }
            }
            System.out.println();
        }
        System.out.println("-----------------------------------------------------------------------------");
        System.out.println("-------------------------------左上三角----------------------------------------");
        for (int i = 1; i <= 9; i++) {
            for (int j = 1; j <= 9; j++) {
                String text = i + "*" + j + "=";
                if (i + j > 10) {
                    System.out.print("\t\t");
                } else {
                    System.out.print(text + i * j + "\t");
                }
            }
            System.out.println();
        }
        System.out.println("-----------------------------------------------------------------------------");
        System.out.println("-------------------------------右下三角----------------------------------------");
        for (int i = 1; i <= 9; i++) {
            for (int j = 1; j <= 9; j++) {
                String text = i + "*" + j + "=";
                if (i + j < 10) {
                    System.out.print("\t\t");
                } else {
                    System.out.print(text + i * j + "\t");
                }
            }
            System.out.println();
        }
        System.out.println("-----------------------------------------------------------------------------");
        for (int i = 1; i <= 9; i++) {
            int space = 4 * (9 - i);
            for (int j = 0; j < space; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= 9; j++) {
                String text = i + "*" + j + "=";
                if (j > i) {
                    System.out.print("");
                } else {
                    System.out.print(text + i * j + "\t");
                }
            }
            System.out.println();
        }
        System.out.println("-----------------------------------------------------------------------------");
        for (int i = 1; i <= 9; i++) {
            for (int j = 1; j <= 9; j++) {
                String text = i + "*" + j + "=";
                if (i + j < 10) {
                    System.out.print("\t");
                } else {
                    System.out.print(text + i * j + "\t");
                }
            }
            System.out.println();
        }
        System.out.println("-----------------------------------------------------------------------------");
        for (int i = 1; i <= 9; i++) {
            for (int j = 1; j <= 9; j++) {
                String text = i + "*" + j + "=";
                if (i > j) {
                    System.out.print("\t");
                } else {
                    System.out.print(text + i * j + "\t");
                }
            }
            System.out.println();
        }
        System.out.println("-----------------------------------------------------------------------------");
        for (int i = 1; i <= 9; i++) {
            int space = 4 * (i - 1);
            for (int j = 0; j < space; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= 9; j++) {
                String text = i + "*" + j + "=";
                if (i + j > 10) {
                    System.out.print("\t\t");
                } else {
                    System.out.print(text + i * j + "\t");
                }
            }
            System.out.println();
        }
        System.out.println("-----------------------------------------------------------------------------");
        for (int i = 9; i >= 1; i--) {
            for (int j = 1; j <= 9; j++) {
                String text = i + "*" + j + "=";
                if (i + j < 10) {
                    System.out.print("\t");
                } else {
                    System.out.print(text + i * j + "\t");
                }
            }
            System.out.println();
        }
        System.out.println("-----------------------------------------------------------------------------");
        for (int i = 9; i >= 1; i--) {
            int space = 4 * (9-i);
            for (int j = 0; j < space; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= 9; j++) {
                String text = i + "*" + j + "=";
                if (j>i) {
                    System.out.print("\t");
                }else  {
                    System.out.print(text + i * j + "\t");
                }
            }
            System.out.println();
        }
    }
}
