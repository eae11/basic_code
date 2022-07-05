package cn.c2;

import java.util.ArrayList;
import java.util.Random;

public class D12 {
    public static void main(String[] args) {
        Random r=new Random();
        ArrayList<Integer> list=new ArrayList<>();
        for (int i = 0; i < 6; i++) {
            list.add(r.nextInt(33)+1);
        }
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}
