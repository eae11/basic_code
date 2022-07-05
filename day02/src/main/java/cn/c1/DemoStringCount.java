package cn.c1;

import java.util.Scanner;

/*题目:键盘输入一个字符串,并统计各种字符出现的次数。
种类有:大写字母,小写字母、数字、其他
* */
public class DemoStringCount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个字符串");
        String input = sc.next();
        int countUpper = 0;
        int countLower = 0;
        int countNumber = 0;
        int countOther = 0;

        char[] charArray=input.toCharArray();
        for (int i = 0; i < charArray.length; i++) {
            if(charArray[i]>='A'&&charArray[i]<='Z'){
                countUpper++;
            }else if(charArray[i]>='a'&&charArray[i]<='z'){
                countLower++;
            }else if(charArray[i]>='0'&&charArray[i]<='9'){
                countNumber++;
            }else{
                countOther++;
            }
        }
        System.out.println(countUpper);
        System.out.println(countLower);
        System.out.println(countNumber);
        System.out.println(countOther);
    }
}
