package cn.c2;

import java.util.ArrayList;

public class D13 {
    public static void main(String[] args) {
        ArrayList<Person> list=new ArrayList<>();
        Person one=new Person("迪丽热巴",18);
        Person two=new Person("古力娜扎",20);
        Person three=new Person("刘亦菲",20);
        Person four=new Person("赵丽颖",20);
        list.add(one);
        list.add(two);
        list.add(three);
        list.add(four);
        for (int i = 0; i < list.size(); i++) {
            Person s=list.get(i);
            System.out.println("姓名:"+s.getName()+",年龄:"+list.get(i).getAge());
        }
    }
}
