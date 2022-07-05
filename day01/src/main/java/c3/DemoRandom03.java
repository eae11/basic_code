package c3;

import java.util.Random;
import java.util.Scanner;

public class DemoRandom03 {
    public static void main(String[] args) {
        //题目:用代码模拟猜数字小游戏
        Random r=new Random();
        int randomNum=r.nextInt(100)+1;//[1,100]
        Scanner sc= new Scanner(System.in);
        while(true){
            System.out.println("请输入你猜的数字：");
            int guessNum=sc.nextInt();
            if(guessNum>randomNum){
                System.out.println("猜大了");
            }
            else if(guessNum<randomNum){
                System.out.println("猜小了");
            }
            else{
                System.out.println("恭喜你,猜中了");
                break;
            }
        }
        System.out.println("游戏结束");
    }
}
