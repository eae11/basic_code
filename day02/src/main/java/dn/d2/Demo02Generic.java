package dn.d2;

import java.util.ArrayList;
import java.util.Iterator;

/*
泛型的通配符:
?:代表任意的数据类型
使用方式:
不能创建对象使用
只能作为方法的参数使用

 */
public class Demo02Generic {
    public static void main(String[] args) {
        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(1);
        list1.add(2);
        ArrayList<String> list2 = new ArrayList<>();
        list2.add("a");
        list2.add("b");
        PrintArrayList(list1);
        PrintArrayList(list2);
    }

    /*
    定义一个方法，能遍历所有类型的ArrayList集合
    这时候我们不知道ArrayList集合使用什么数据类型,可以泛型的通配符?来接收数据类型
    注意:
    泛型没有继承概念的

     */
    public static void PrintArrayList(ArrayList<?> list) {
        Iterator<?> it = list.iterator();
        while (it.hasNext()) {
            Object o = it.next();
            System.out.println(o);
        }
//        for (Object i : list) {
//            System.out.println(i);
//        }

    }
}
