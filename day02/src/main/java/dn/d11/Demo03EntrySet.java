package dn.d11;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/*
Map集合遍历的第二种方式:使用Entry对象遍历
Map集合中的方法:
Set<Map. Entry<K,V>> entrySet() 返回此映射中包含的映射关系的Set视图。
实现步骤:
1.使用Map集合中的方法entrySet(),把Nap集合中多个Entry对象取出来,存储到一个Set集合中
2.遍历Set集合,获取每一个Entry对象
3.使用Entry对象中的方法getKey( )和getValue()获取键与值

 */
public class Demo03EntrySet {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        map.put("杨过", "小龙女");
        map.put("赵又廷", "高圆圆");
        map.put("黄晓明", "杨颖");
        //1.使用Map集合中的方法entrySet(),把Map集合中多个Entry对象取出来,存储到一个Set集合中
        Set<Map.Entry<String, String>> set = map.entrySet();
        //变量Set集合，获取每一个Entry对象
        for (Map.Entry<String, String> Entry : set) {
            String key = Entry.getKey();
            String value = Entry.getValue();
            System.out.println(key + "=" + value);
        }
//        Iterator<Map.Entry<String, String>> it = set.iterator();
//        while (it.hasNext()) {
//            Map.Entry<String, String> entry = it.next();
//            String key = entry.getKey();
//            String value = entry.getValue();
//            System.out.println(key + "=" + value);
//        }
    }
}
