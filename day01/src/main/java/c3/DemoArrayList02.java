package c3;

import java.util.ArrayList;

/*
ArrayList当中的常用方法有：
public boolean add(E e):向集合中添加元素，参数的类型和泛型保持一致。
public E get(int index):从集合当中获取元素，参数是索引编号，返回值就是对应位置的元素。
public E remove(int index):从集合当中删除元素，参数是索引编号，返回值就是被删除的元素。
public int size():获取集合的尺寸长度，返回值是集合中包含的个数。
 */
public class DemoArrayList02 {
    public static void main(String[] args) {
        ArrayList<String> list=new ArrayList<>();
        System.out.println(list);
        //向集合中添加元素
        boolean success=list.add("佟丽娅");
        System.out.println(list);
        System.out.println("添加动作是否成功:"+success);
        list.add("高圆圆");
        list.add("张馨予");
        list.add("李小璐");
        System.out.println(list);
        //从集合中获取元素:get。索引值从0开始
        String name=list.get(1);
        System.out.println("第1索引位置:"+name);
        //从集合中删除元素:remove。索引值从0开始。
        String whoRemoved=list.remove(3);
        System.out.println("被删除的人是:"+whoRemoved);
        System.out.println(list);
        //获取集合的长度尺寸,也就是其中元素个数
        int size =list.size();
        System.out.println("集合的长度是"+size);
    }
}
