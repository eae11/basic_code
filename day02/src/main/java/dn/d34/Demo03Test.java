package dn.d34;

import java.io.*;
import java.util.ArrayList;

/*
练习:序列化集合
当我们想在文件中保存多个对象的时候
可以把多个对象存储到一个集合中
对集合进序列化和反序列化

1.定义一个存储Person对象的ArrayList集合
2.往ArrayList集合中存储Person对象
3.创建一个序列化流objectoutputstream对象
4.使用objectoutputstream对象中的方法writeobject,对集合进行序列化
5.创建一个反序列化objectInputstream对象
6.使用objectInputstream对象中的方法readobject读取文件中保存的集合
7.把object类型的集合转换为Arraylist类型
8.遍历Arraylist集合
9.释放资源
 */
public class Demo03Test {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        //1.定义一个存储Person对象的ArrayList集合
        ArrayList<Person> list = new ArrayList<>();
        //2.往ArrayList集合中存储Person对象
        list.add(new Person("高圆圆1", 18));
        list.add(new Person("高圆圆2", 20));
        list.add(new Person("高圆圆3", 25));
        //3.创建一个序列化流objectoutputstream对象
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("D:\\IdeaProjoct\\basic-code\\day02\\src\\dn\\d34\\2.txt"));
        //4.使用objectoutputstream对象中的方法writeobject,对集合进行序列化
        oos.writeObject(list);
        //5.创建一个反序列化objectInputstream对象
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("D:\\IdeaProjoct\\basic-code\\day02\\src\\dn\\d34\\1.txt"));
        //6.使用objectInputstream对象中的方法readobject读取文件中保存的集合
        Object o = ois.readObject();
        //7.把object类型的集合转换为Arraylist类型
        ArrayList<Person> list2 = (ArrayList<Person>) o;
        //8.遍历Arraylist集合
        for (Person s : list2) {
            System.out.println(s);
        }
        ois.close();
        oos.close();
    }
}
