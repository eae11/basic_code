package c3;

import jdbc.c1.Student;

import java.util.ArrayList;

public class DemoArrayList06 {
    public static void main(String[] args) {
        Student one = new Student("迪丽热巴", 18);
        Student two = new Student("古力娜扎", 18);
        Student three = new Student("张馨予", 18);
        Student four = new Student("高圆圆", 18);
        ArrayList<Student> list = new ArrayList<>();
        list.add(one);
        list.add(two);
        list.add(three);
        list.add(four);
        for (int i = 0; i < list.size(); i++) {
            System.out.println("姓名:"+list.get(i).getName()+",年龄:"+list.get(i).getAge());
        }
    }
}
