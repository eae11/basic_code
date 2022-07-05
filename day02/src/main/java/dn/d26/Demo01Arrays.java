package dn.d26;

import java.util.Arrays;

/*
Lambda表达式有参数有返回值的练习
需求:
使用数组存储多个Person对象
对数组中的Person对象调用Arrays的sort方法通过年龄进行升序排序
 */
public class Demo01Arrays {
    public static void main(String[] args) {
        //使用数组存储多个Person对象
        Person[] a = new Person[]{new Person("高圆圆", 18), new Person("迪丽热巴", 20),
                new Person("古力娜扎", 20)};
        //对数组中的Person对象使用Arrays的sort方法通过年龄进行升序(前边-后边)排序
//        Arrays.sort(a, new Comparator<Person>() {
//            @Override
//            public int compare(Person o1, Person o2) {
//                return o1.getAge() - o2.getAge();
//            }
//        });
        //使用Lambda表达式,简化匿名内部类
        Arrays.sort(a, (Person o1, Person o2) -> {
            return o1.getAge() - o2.getAge();
        });
        Arrays.sort(a, (o1, o2) -> o1.getAge() - o2.getAge());
        for (Person p : a) {
            System.out.println(p);
        }
    }
}
