package c3;

import java.util.ArrayList;
import java.util.Random;

public class DemoArrayList08 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        Random r = new Random();
        for (int i = 0; i < 20; i++) {
            int num=r.nextInt(100)+1;
            list.add(num);
        }
        ArrayList list1=printArrayList(list);
        for (int i = 0; i < list1.size(); i++) {
            System.out.println(list1.get(i));
        }
    }

    public static ArrayList<Integer> printArrayList(ArrayList<Integer> list) {
        ArrayList<Integer> list1 = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            int num=list.get(i);
            if(num%2==0){
                list1.add(num);
            }
        }
        return list1;
    }
}
