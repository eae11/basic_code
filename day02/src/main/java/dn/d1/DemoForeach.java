package dn.d1;

import java.util.ArrayList;

/*
增强for循环;底层使用的也是迭代器,使用for循环的格式,简化了迭代器的书写
是JDK1.5之后出现的新特性
Collection<E>extends Iterable<E>:所有的单列集合都可以使用增强for.
public interface Iterable<T>实现这个接口允许对象成为"foreach" 语句的目标。
增强for循环:用来遍历集合和数组
格式:
for(集合/数组的数据类型 交量名 : 集合名/数组名){
sout(变量名);
 */
public class DemoForeach {
    public static void main(String[] args) {
        method2();
    }

    public static void method1() {
        int[] arr = {1, 2, 3, 4, 5};
        for (int i : arr) {
            System.out.println(i);
        }
    }

    public static void method2() {
        ArrayList<String> list = new ArrayList<>();
        list.add("aaa");
        list.add("bbb");
        list.add("ccc");
        list.add("ddd");
        for (String i : list) {
            System.out.println(i);
        }
    }
}
