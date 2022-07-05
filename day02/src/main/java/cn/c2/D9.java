package cn.c2;

import java.util.ArrayList;

public class D9 {
    public static void main(String[] args) {
        ArrayList<String> list=new ArrayList<>();
        System.out.println(list);
        boolean truth=list.add("迪丽热巴");
        System.out.println(list);
        System.out.println("添加动作是否成功:"+truth);
        list.add("高圆圆");
        list.add("古力娜扎");
        list.add("赵又廷");
        list.add("李小璐");
        System.out.println(list);
        String name=list.get(0);
        System.out.println("0号位置索引:"+name);
        String whoRemoved=list.remove(4);
        System.out.println("被删除的人是:"+whoRemoved);
        int size=list.size();
        System.out.println("集合的长度是:"+size);
    }
}
