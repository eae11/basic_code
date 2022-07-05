package dn.d11;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/*
Map集合的第一种遍历方式:通过键找值的方式
Map集合中的方法:
Set<K> keySet()返回此映射中包含的键的Set视图。
实现步骤:
1.使用Mop集合中的方法keySet(),把Nap集合所有的key取出来,存储到一个Set集合中
2.遍历set集合,获职Map集合中的每一个key,
3.通过Map集合中的方法get(key),通过key找到value

 */
public class Demo02KeySet {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("赵丽颖", 168);
        map.put("高圆圆", 170);
        map.put("迪丽热巴", 169);

        Set<String> set = map.keySet();

        Iterator<String> it = set.iterator();
        while (it.hasNext()) {
            String key = it.next();
            Integer value = map.get(key);
            System.out.println(key + "=" + value);
        }
        System.out.println("================");
        for (String key : set) {
            Integer value = map.get(key);
            System.out.println(key + "=" + value);

        }
    }
}
