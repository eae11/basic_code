package dn.d41;

import java.util.stream.Stream;

/*
Stream流中的常用方法_concat:用于把流组合到一起
如果有两个流，希望合并成为一个流，那么可以使用stream接口的静态方法concat
static <T> Stream<T> concat(Stream<? extends T> a，Stream<? extends T> b)

 */
public class Demo09Stream_concat {
    public static void main(String[] args) {
        Stream<String> stream1 = Stream.of("张三", "李四", "王五", "赵六", "田七");
        Stream<String> stream2 = Stream.of("喜洋洋", "懒洋洋", "美羊羊", "沸羊羊", "灰太狼");
        Stream<String> concat = Stream.concat(stream1, stream2);
        concat.forEach(name -> System.out.println(name));
    }
}
