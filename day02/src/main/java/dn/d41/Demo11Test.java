package dn.d41;

import java.util.ArrayList;
import java.util.Collections;
import java.util.stream.Stream;

/*
练习:集合元素处理〈流的方式)
现在有两个ArrayList集合存储队伍当中的多个成员姓名，要求使用传统的for循环〈或增强for循环）依次进行以下若干操作步骤:
1．第一个队伍只要名字为3个字的成员姓名;存储到一个新集合中。
2．第一个队伍筛选之后只要前3个人;存储到一个新集合中。
3．第二个队伍只要姓张的成员姓名;存储到一个新集合中。
4．第二个队伍筛选之后不要前2个人;存储到一个新集合中。
5．将两个队伍合并为一个队伍;存储到一个新集合中。
6．根据姓名创建Person对象;存储到一个新集合中。
7．打印整个队伍的Person对象信息。
 */
public class Demo11Test {
    public static void main(String[] args) {
        ArrayList<String> one = new ArrayList<>();
        Collections.addAll(one, "张三", "李四", "王五", "赵六", "田七");
        Collections.addAll(one, "喜洋洋", "懒洋洋", "美羊羊", "沸羊羊", "灰太狼");
        //1
        Stream<String> stream1 = one.stream().filter(name -> name.length() == 3).limit(3);

        ArrayList<String> two = new ArrayList<>();
        two.add("古力娜扎");
        two.add("张无忌");
        two.add("赵丽颖");
        two.add("张三丰");
        two.add("尼古拉斯赵四");
        two.add("张天爱");
        two.add("张二狗");
        Stream<String> stream2 = two.stream().filter(name -> name.startsWith("张")).skip(2);
//        Stream.concat(stream1,stream2).map((String name)->{
//            return new Person(name);
//        });
        Stream.concat(stream1,stream2).map((name)->new Person(name)).forEach(name-> System.out.println(name));

    }
}
