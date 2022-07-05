package dn.d41;

import java.util.stream.Stream;

/*
Streamr流中的常用方法_skip:用于跳过元素
如果希望跳过前几个元素，可以使用skip方法获取一个截取之后的新流:
stream<T> skip(long n);
如果流的当前长度大于n，则跳过前n个;否则将会得到一个长度为0的空流。

 */
public class Demo08Stream_skip {
    public static void main(String[] args) {
        //获取一个stream流
        String[] arr = {"喜洋洋", "懒洋洋", "美羊羊", "沸羊羊", "灰太狼"};
        Stream<String> stream = Stream.of(arr);
        Stream<String> stream1 = stream.skip(2);
        stream1.forEach(name -> System.out.println(name));
    }
}
