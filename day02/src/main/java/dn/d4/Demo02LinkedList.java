package dn.d4;

import java.util.LinkedList;

/*
java.util.l inkedList集合implements List接口
LinkedList集合的特点:
1.底层是一个链表结构:查询慢,增删快
2.里边包含了大量操作首尾元素的方法
注意:使用LinkedList集合特有的方法,不能使用多态(多态不能使用子类特有的方法)
.public void addFirst(E e):将指定元素插入此列表的开头。
.public void addLast(E e):将指定元素添加到此列表的结尾。
. public void push(E e):将元素推入此列表所表示的堆栈。此方法等效于 addFirst(E)。

. public E getFirst():返回此列表的第一个元素。
. public E getLast():近回此列表的最后-一个元素。

.public E remove First():移除并近回此列表的第一 个元素。
. public E removeLast():移除并近回此列来的最后一个元素。
. public E pop():从此列表所表示的堆栈处弹出一个元素。此方法相当于removeFirst

. public boolean isEmpty():如果列表不包含元素，则近回true.

 */
public class Demo02LinkedList {
    public static void main(String[] args) {
        show03();
    }

    public static void show01() {
        LinkedList<String> list = new LinkedList<>();
        list.add("a");
        list.add("b");
        list.add("c");
        System.out.println(list);//[a, b, c]
//        list.addFirst("www");
        list.push("www");
        System.out.println(list);//[www, a, b, c]
        list.addLast("com");
        System.out.println(list);//[www, a, b, c, com]
    }

    public static void show02() {
        LinkedList<String> list = new LinkedList<>();
        list.add("a");
        list.add("b");
        list.add("c");

//        list.clear();//清空集合中的元素在获取集合中的元素会抛出NoSuchElementException

        //public boolean isEmpty(): 如果列表不包含元素，则近回true
        if (!list.isEmpty()) {
            String first = list.getFirst();
            System.out.println(first);
            String last = list.getLast();
            System.out.println(last);
        }
    }

    public static void show03() {
        LinkedList<String> list = new LinkedList<>();
        list.add("a");
        list.add("b");
        list.add("c");
        System.out.println(list);
//        String first = list.removeFirst();
        String first = list.pop();
        System.out.println("被移除的第一个元素:" + first);
        String last = list.removeLast();
        System.out.println("被移除的最后一个元素:" + last);
        System.out.println(list);
    }
}
