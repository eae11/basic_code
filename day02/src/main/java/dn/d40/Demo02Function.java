package dn.d40;

import java.util.function.Function;

/*
Function接口中的黑f认方法andThen:用来进行组合操作
需求:
把String类型的"123”,转换为Inteter类型,把转换后的结果加10
把增加之后的Integer类型的数据,转换为string类型
分析:
转换了两次
第一次是把string类型转换为了Integer类型
所以我们可以使用Function<string , Integer> fun1
Integer i = fun1.apply( "123")+10;
第二次是把Integer类型转换为string类型
所以我们可以使用Function<Integer, string> fun2
String s = fun2.apply(i);
我们可以使用andThen方法,把两次转换组合在一起使用
string s = fun1.andThen(fun2). apply( "123");
fun1先调用apply方法,把字符串转换为Integer
fun2再调用apply方法,把Integer转换为字符串

 */
public class Demo02Function {
    /*
    定义一个方法
参数串一个字符串类型的整数参数再传递两个Function接口
一个泛型使用Function<String, Integer>
一个泛型使用Function<Integer , string>

     */
    public static void change(String s, Function<String, Integer> fun1, Function<Integer, String> fun2) {
        String s1 = fun1.andThen(fun2).apply(s);
        System.out.println(s1);
    }

    public static void main(String[] args) {
        String s = "123";
        change(s, (String t) -> {
            Integer i = Integer.parseInt(t) + 10;
            return i;
        }, (Integer t) -> {
            String s1 = String.valueOf(t);
            return s1;
        });
    }

}
