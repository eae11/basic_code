package dn.d11;

import java.util.HashMap;
import java.util.Map;

/*
java. util.Map<k, v>集合
Map集合的特点:
1.Map集合是一个双列集合, 一个元素包含两个值(一个key,一个value)
2.Map集合中的元素，key和value的数据类型可以相同，也可以不同
3.Mop集合中的元素，key是不允许重复的, value是可以重复的
4.Map集合中的元素, key和value是一一对应
java.util.HashMap<k,v>集合implements Map<k, v>接口
HashMap集合的特点:
1. HashMap集合底层是哈希表:查询的速度特别的快
JDK1.8之前:数组+单向链表
JDK1.8之后:数组+单向涟表/红黑树(链表的长度超过8):提高查询的速度
2. hashMap集合是一个无序的集合,存储元素和取出元素的顺序有可能不一致
java. util.L inkedHashMap<k,v>集合extends HashMap<k,v>集合
L inkedHashMap的特点:
1.LinkedHashMop集合底层是哈希表+{链表(保证迭代的顺序)
2.LinkedHashMap集合是一个有序的集合,存储元素和取出元素的顺序是一致的


 */
public class Demo01Map {
    public static void main(String[] args) {
        show03();
    }

    /*
       public V put(K key, V value):把指定的键 与指定的值添加到Map集合中。
    返回值:v
    存储键值对的时候，key不重复,返回值V是null
    存储键值对的时候，key重复，会使用新的value替换map中重复的value,近回被替换的value值

     */
    public static void show01() {
        Map<String, String> map = new HashMap<>();
        String v1 = map.put("李晨", "范冰冰1");
        System.out.println("v1:" + v1);
        String v2 = map.put("李晨", "范冰冰2");
        System.out.println("v2:" + v2);
        System.out.println(map);//{李晨=范冰冰2}
        map.put("杨过", "小龙女");
        map.put("哈哈哈", "小龙女");
        System.out.println(map);
    }

    /*
            public V remove(object key): 把指定的键所对应的键值对元素在Mop集合中删除，返回被删除元素的值。
            返回值:V
            key存在，v返回被删除的值
            key不存在, v返回null

             */
    public static void show02() {
        Map<String, Integer> map = new HashMap<>();
        map.put("赵丽颖", 168);
        map.put("高圆圆", 170);
        map.put("迪丽热巴", 169);
        System.out.println(map);
        Integer v1 = map.remove("高圆圆");
        System.out.println("v1:" + v1);
        Integer v2 = map.remove("林志颖");
//        int v2 = map.remove("林志颖");//自动拆箱空指针异常
        System.out.println("v2:" + v2);
    }

    /*
    返回值:
    key存在，返回对应的value值
    key不存在,近回null

     */
    public static void show03() {
        Map<String, Integer> map = new HashMap<>();
        map.put("赵丽颖", 168);
        map.put("高圆圆", 170);
        map.put("迪丽热巴", 169);
        Integer v1 = map.get("高圆圆");
        System.out.println("v1:" + v1);
        Integer v2 = map.get("哈哈哈");
        System.out.println("v2:" + v2);
    }

    /*
    boolean containsKey(object key) 判断集合中是否包含指定的键。
    包含返回true,不包含返回false
     */
    public static void show04() {
        Map<String, Integer> map = new HashMap<>();
        map.put("赵丽颖", 168);
        map.put("高圆圆", 170);
        map.put("迪丽热巴", 169);
        boolean v1 = map.containsKey("高圆圆");
        System.out.println(v1);
        boolean v2 = map.containsKey("哈哈哈");
        System.out.println(v2);
    }
}