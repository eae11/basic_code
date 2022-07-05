package dn.d41;

import java.util.ArrayList;
import java.util.Collections;
import java.util.stream.Stream;

/*
Stream流中的常用方法_count:用于统计stream流中元素的个数
Long count();
count方法是一个终结方法,返回值是一个Long类型的整数
所以不能再继续调用stream流中的其他方法了

 */
public class Demo06Stream_count {
    public static void main(String[] args) {
        //获取一个stream流
        ArrayList<Integer> list = new ArrayList<>();
        Collections.addAll(list, 1, 2, 3, 4, 5, 6);
        Stream<Integer> stream = list.stream();
        long count = stream.count();
        System.out.println(count);//6
    }
}
