package dn.d7;

import java.util.HashSet;

/*
HashSet存储白定义类型元素
set集合报错元素唯一:
存储的元素(String, Integer, ...student, Person...).必须重写hashCode方法和equals方法(不重写不行)
要求:
同名同年龄的人，视为同一个人，只能存储一次
 */
public class Demo01HashCodeSavePerson {
    public static void main(String[] args) {
        HashSet<Person> set = new HashSet<>();
        Person p1 = new Person("高圆圆", 18);
        Person p2 = new Person("高圆圆", 18);
        Person p3 = new Person("高圆圆", 19);
        System.out.println(p1.hashCode());//460141958
        System.out.println(p2.hashCode());//1163157884
        System.out.println(p1 == p2);//false
        System.out.println(p1.equals(p2));//false
        set.add(p1);
        set.add(p2);
        set.add(p3);
        System.out.println(set);
    }
}
