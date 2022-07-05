package cn.c2;

import java.util.ArrayList;

public class D14 {
    public static void main(String[] args) {
        ArrayList<String> list=new ArrayList<>();
        list.add("迪丽热巴");
        list.add("古力娜扎");
        list.add("马尔扎哈");
        list.add("赵丽颖");
        System.out.println(list);
        arrayListPrint(list);
    }
    public static void arrayListPrint(ArrayList<String> list){
        System.out.print("{");
        for (int i = 0; i < list.size(); i++) {
            String name=list.get(i);
            if(i==list.size()-1){
                System.out.println(name+"}");
            }
            else {
                System.out.print(name+"@");
            }
        }
    }
}
