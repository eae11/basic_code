package dn.d40;

import java.util.function.Function;

/*
练习:自定义丞|数模型拼接题目
请使用Function进行函数模型的拼接，按照顺序需要执行的多个函数操作为;
string str =“赵丽颖,20";
分析:
1．将字符串截取数字年龄部分,得到字符串;
Function<string,string> “赵丽颖,20"->"20”
2．将上一步的字符串转换成为int类型的数字;
Function<string , Integer> "20"->20
3．将上一步的int数字累加100，得到结果int数字。
Function<Integer, Integer> 20->120

 */
public class Demo03Function {
    public static int change(String s, Function<String, String> fun1, Function<String, Integer> fun2,
                             Function<Integer, Integer> fun3) {

        return fun1.andThen(fun2).andThen(fun3).apply(s);
    }

    public static void main(String[] args) {
        int i = change("赵丽颖,20", (String t) -> {
            String s = t.split(",")[1];
            return s;
        }, (String t) -> {
            Integer i1 = Integer.parseInt(t);
            return i1;
        }, (Integer t) -> {
            return t + 100;
        });
        System.out.println(i);
    }
}
