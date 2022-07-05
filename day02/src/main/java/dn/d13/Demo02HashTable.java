package dn.d13;

import java.util.HashMap;
import java.util.Hashtable;

/*
java. util.Hashtable<K, V>集合implements Map<K, V>接口
Hashtable:底层也是一个哈希表，是一个线程安全的集合,是单线程集合,速度慢
HashMap:底层是-一个哈希表,是一一个线程不安全的集合,是多线程的集合,速度快
HashMap集合(之前学的所有的集合):可以存储null值, null键
Hashtable集合,不能存储null值, null键
Hashtable和vector集合- -样 ,在jdk1.2版本之后被更先进的集合(HashMap, ArrayList)取代了
Hashtable的子类Properties依然活跃在历史舞台
Properties集合是一个唯一和i0流相结合的集合

 */
public class Demo02HashTable {
    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<>();
        map.put(null, "a");
        map.put("b", null);
        map.put(null, null);
        System.out.println(map);
        Hashtable<String, String> map1 = new Hashtable<>();
//        map1.put(null, "a");//NullPointerException
//        map1.put("b", null);//NullPointerException
//        map1.put(null, null);//NullPointerException
    }
}
