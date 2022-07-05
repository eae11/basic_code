package dn.d6;

import java.util.HashSet;

/*
Set集合不允许重复重复元素的原理

 */
public class Demo02HashCodeSaveString {
    public static void main(String[] args) {
        //创建HashSet集合对象
        HashSet<String> set = new HashSet<>();
        String s1 = "abc";
        String s2 = "abc";
        set.add(s1);
        set.add(s2);
        set.add("重地");
        set.add("通话");
        set.add("abc");
        System.out.println(set);//[重地, 通话, abc]
    }
}
