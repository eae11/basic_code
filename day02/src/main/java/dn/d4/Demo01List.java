package dn.d4;

import java.util.ArrayList;
import java.util.List;

/*
java. util.list接口extends Collection接口
List接口的特点:
1.有序的集合,存储元素和取出元素的顺序是一致的(存储123 取出123)
2.有索引,包含了一些带索引的方法
3.允许存储重复的元素
List接口中带索引的方法(特有)
- public void add(int index, E element):将指定的元素，添加到该集合中的指定位置上。
- public ε get(int index):返回集合中指定位置的元素。
- public E remove(int index): 移除列表中指定位置的元素，返回的是被移除的元素。
- public E set(int index, E element):用指定元素替换集合中指定位置的元素,返回值的更新前的元素。
注意:
操作索引的时候，-定要防止索引越界异常
IndexOutOfBoundsException:索引越界异常，集合会报
ArrayIndexOutBoundsException:数组索引越界异常
StringIndexOutBoundsException:字符串索引越界异常
 */
public class Demo01List {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();//多态
        list.add("a");
        list.add("b");
        list.add("c");
        list.add("d");
        list.add("a");
        System.out.println(list);//重写了toString
        list.add(3, "hhh");
        System.out.println(list);
        String remove = list.remove(2);
        System.out.println("被移除的元素" + remove);
        System.out.println(list);
        String set = list.set(0, "A");
        System.out.println("被替换的元素" + set);
        System.out.println(list);
        //List集合遍历有 3种方式
        //使用普通的for循环
//        for (int i = 0; i < list.size(); i++) {
//            System.out.println(list.get(i));
//        }
//        Iterator<String> it = list.iterator();
//        while (it.hasNext()) {
//            String next = it.next();
//            System.out.println(next);
        for (String s : list) {
            System.out.println(s);
        }
//        System.out.println(list.get(5));
    }
}
