package dn.d1;

import java.util.ArrayList;
import java.util.Collection;

/*
    java . util.Collection接口
    所有单列集合的最顶层的接口, 里边定义了所有单列集合共性的方法
    任意的单列集合都可以使用Collection接口中的方法
    public boolean add(E e): 把给定的对象添加到当前集合中。
    public void clear() :清空集合中所有的元素。
    public boolean remove(E e) :把给定的对象在当前集合中删除。
    public boolean contains(E e) :判断当前集合中是否包含给定的对象。
    public boolean isEmpty() :判断当前集台是否为空。
    public int size() :返回集合中元素的个数。
    public object[] toArray() :把集合中的元素,存储到数组中。
 */
public class Demo01collection {
    public static void main(String[] args) {
        Collection<String> coll = new ArrayList<>();//使用多态
        System.out.println(coll);//重写了toString方法  []
        boolean b1 = coll.add("高圆圆");
        System.out.println("b1:" + b1);
        coll.add("迪丽热巴");
        coll.add("古力娜扎");
        coll.add("李小璐");
        boolean b2 = coll.remove("李小璐");
        System.out.println("b2" + b2);
        boolean b3 = coll.contains("高圆圆");
        System.out.println("b3:" + b3);
        int size = coll.size();
        System.out.println("集合的长度为:" + size);
        boolean b4 = coll.isEmpty();
        System.out.println("b4:" + b4);
        Object[] obj = coll.toArray();
        for (int i = 0; i < obj.length; i++) {
            System.out.println(obj[i]);
        }
        coll.clear();
        System.out.println(coll);
    }
}
