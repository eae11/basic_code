package cn.c2;

import java.util.ArrayList;
import java.util.Random;

public class D15 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        Random r = new Random();
        for (int i = 0; i < 20; i++) {
            list.add(r.nextInt(30));
        }
        ArrayList<Integer> list1=chooseArrayList(list);
        for (int i = 0; i < list1.size(); i++) {
            System.out.println(list1.get(i));
        }
    }

    public static ArrayList<Integer> chooseArrayList(ArrayList<Integer> list) {
        ArrayList<Integer> list1 = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            int num = list.get(i);
            if (num % 2 == 0) {
                list1.add(num);
            }
        }
        return list1;
    }
}
