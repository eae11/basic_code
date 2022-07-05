package dn.d41;

import java.util.stream.Stream;

/*
    Stream流中的常用方法_Limit:用于截取流中的元素
    limit方法可以对流进行截取,只取用前n个。方法签名:
    stream<T> Limit(Long maxsize);
参数是一个Long型，如果集合当前长度大于参数则进行截取;否则不进行操作
limit方法是一个延迟方法,只是对流中的元素进行截取,返回的是一个新的流,所以可以继续调用Sstream流中的其他方法

 */
public class Demo07Stream_limit {
    public static void main(String[] args) {
        //获取一个Stream流
        String[] arr = {"喜洋洋", "懒洋洋", "美羊羊", "沸羊羊", "灰太狼"};
        Stream<String> stream = Stream.of(arr);
        Stream<String> stream1 = stream.limit(3);
        stream1.forEach(name -> System.out.println(name));
    }
}
