package cn.c1;

public class DemoStaticField {
    public static void main(String[] args) {
        Student one=new Student("郭靖",19);
        Student.room ="101教室";
        System.out.println("姓名:"+one.getName()+",年龄:"+one.getAge()+",教室"+ Student.room +",学号："+one.getId());
        Student two=new Student("黄蓉",16);
        System.out.println("姓名:"+two.getName()+",年龄:"+two.getAge()+",教室:"+ Student.room +",学号:"+two.getId());


    }
}
