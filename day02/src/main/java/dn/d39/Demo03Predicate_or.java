package dn.d39;

import java.util.function.Predicate;

/*
需求:判断一个字符串,有两个判断的条件
1.判断字符串的长度是否大于5
2.判断字符串中是否包含α
满足一个条件即可,我们就可以使用||运算符连接两个条件
Predicate接口中有一个方法and,表示并且关系,也可以用于连接两个判断条件default Predicate<T> and( Predicate<? super T> other) {
objects.requireNonNull(other) ;
return (t) -> this.test(t) && other.test(t);
}
方法内部的两个判断条件,也是使用&&运算符连接起来的

 */
public class Demo03Predicate_or {
    /*
定义一个方法,方法的参数,传递一个字符串
传递两个Predicate接口
一个用于判断字符串的长度是否大于5
一个用于判断字符串中是否包含a
满足一个条件即可
 */
    public static boolean checkString(String s, Predicate<String> pre1, Predicate<String> pre2) {
//        return pre1.test(s) || pre2.test(s);
        return pre1.or(pre2).test(s);//等价于return  pre1.test(s)||pre2.test(s);
    }

    public static void main(String[] args) {
        String s = "bcd";
        boolean a = checkString(s, (t) -> {
            return t.length() > 5;
        }, (t) -> {
            return t.contains("a");
        });
        System.out.println(a);
    }
}
