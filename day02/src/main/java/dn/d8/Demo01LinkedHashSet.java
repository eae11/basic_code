package dn.d8;

import java.util.HashSet;
import java.util.LinkedHashSet;

/*
fava. util.linkedHashSet集合extends HashSet集合
LinkedHashSet集合特点:
底层是一个哈希表(数组+涟表/红黑树)+i链表:多了一 条链表(记录元素的存储顺序),保证元素有序

 */
public class Demo01LinkedHashSet {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>();
        set.add("www");
        set.add("abc");
        set.add("abc");
        set.add("itcast");
        System.out.println(set);//无序，不允许重复

        LinkedHashSet<String> linked = new LinkedHashSet<>();
        linked.add("www");
        linked.add("abc");
        linked.add("abc");
        linked.add("itcast");
        System.out.println(linked);//有序，不允许重复
    }
}
