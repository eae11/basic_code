package dn.d13;

import java.util.HashMap;
import java.util.LinkedHashMap;

/*
java. util. L inkedHashMap<K, V> extends HashMap<K, V>
Map接口的哈希表和谁接列表实现，具有可预知的迭代顺序。
底层原理:
哈希表+链表(记录元素的顺序)

 */
public class Demo01LinkedHashMap {
    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<>();
        map.put("a", "a");
        map.put("b", "b");
        map.put("c", "c");
        map.put("a", "d");
        System.out.println(map);//{a=d, b=b, c=c}key不允许重复,无序
        LinkedHashMap<String, String> map1 = new LinkedHashMap<>();
        map1.put("a", "a");
        map1.put("b", "b");
        map1.put("c", "c");
        map1.put("a", "d");
        System.out.println(map1);//{a=d, b=b, c=c}key不允许重复，有序
    }
}
