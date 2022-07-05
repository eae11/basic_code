package dn.d41;

import java.util.stream.Stream;

/*
如果需要将流中的元素映射到另一个流中，可以使用map方法.
<R>Stream<R> map ( Function<? super T, ? extends R> mapper);
该接口需要一个Function函数式接口参数，可以将当前流中的类型数据转换为另一种R类型的流。
Function中的抽象方法:
R apply (T t);

 */
public class Demo05Stream_Map {
    public static void main(String[] args) {
        //获取一个string类型的stream流
        Stream<String> stream = Stream.of("1", "2", "3", "4");
        //使用map方法,把字符串类型的整数,转换(映射)为Integer类型的整数
        Stream<Integer> stream2 = stream.map((String s) -> {
            return Integer.parseInt(s);
        });
        //遍历stream2流
        stream2.forEach(i -> System.out.println(i));
    }
}
