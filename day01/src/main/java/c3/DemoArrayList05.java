package c3;

import java.util.ArrayList;
import java.util.Random;

public class DemoArrayList05 {
    public static void main(String[] args) {
        Random r=new Random();
        ArrayList<Integer> list=new ArrayList();
        for (int i = 0; i < 6; i++) {
            int num=r.nextInt(33)+1;
            list.add(num);
        }
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}
