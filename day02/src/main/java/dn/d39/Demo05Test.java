package dn.d39;

import java.util.ArrayList;
import java.util.function.Predicate;

/*
练习:集合信息筛选
数组当中有多条"姓名+性别"的信息如下，
String[ ] array = {“迪丽热巴,女"，“古力挪扎,女"，“马尔扎哈,男"，“赵丽颖,女”};
请通过Predicate接口的拼装将符合要求的字符串筛选到集合ArrayList中，
需要同时满足两个条件:
1．必须为女生;
2．姓名为4个字。
分析:
1.有两个判断条件,所以需要使用两个Predicate接口,对条件进行判断
2.必须同时满足两个条件,所以可以使用and方法连接两个判断条件

 */
public class Demo05Test {
    public static ArrayList<String> check(String[] arr, Predicate<String> pre1, Predicate<String> pre2) {
        ArrayList<String> list = new ArrayList<>();
        for (String s : arr) {
            if (pre1.and(pre2).test(s)) {
                list.add(s);
            }
        }
        return list;
    }

    public static void main(String[] args) {
        String[] array = {"迪丽热巴,女", "古力挪扎,女", "马尔扎哈,男", "赵丽颖,女"};
        ArrayList<String> list1 = check(array, (String s) -> {
            String split = s.split(",")[0];
            return split.length() == 4;
        }, (String s) -> {
            String split = s.split(",")[1];
            return split.equals("女");
        });
        System.out.println(list1);
    }
}
