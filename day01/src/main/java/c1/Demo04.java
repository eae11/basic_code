package c1;

import java.util.Scanner;

public class Demo04 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("请输入第一个正整数");
        int num1 = input.nextInt();
        System.out.println("请输入第二个正整数");
        int num2 = input.nextInt();
        int i, j,temp;
        String s ="";
        if(num1>num2){
            temp=num1;
            num1=num2;
            num2=temp;
        }
        for (i = num1; i <= num2; i++) {
            for (j = 2; j < i; j++) {
                if (i % j == 0) {
                    break;
                }
            }
            if (i == j) {
                s+=i+",";
                }
            }
        System.out.println(s.substring(0, s.length()-1));
        }
    }
