package dn.d34;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

/*
java.io.0bjectInputstream extends Inputstream
objectInputstream:对象的反序列化流
作用:把文件中保存的对象,以流的方式读取出来使用
构造方法:
objectInputStream(InputStream in）创建从指定InputStream 读取的objectInputStream。
参数:
Inputstream in:字节输入流
特有的成员方法:
object read0bject() 从objectInputstream 读取对象。
使用步骤:
1.创建objectInputStream对象,构造方法中传递字节输入流
2.使用objectInputstream对象中的方法readobject读取保存对象的文件
3.释放资源
4.使用读取出来的对象(打印)

read0bject方法声明抛出了cLassNotFoundException(class文件找不到异常)
当不存在对象的cLass文件时抛出此异常
反序列化的前提:
1.类必须实现serializable
2.必须存在类对应的cLass文件

 */
public class Demo02ObjectInputStream {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        //1.创建objectInputStream对象,构造方法中传递字节输入流
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("D:\\IdeaProjoct\\basic-code\\day02\\src\\dn\\d34\\1.txt"));
        //2.使用objectInputstream对象中的方法readobject读取保存对象的文件
        Object o = ois.readObject();
        //3.释放资源
        ois.close();
        //4.使用读取出来的对象(打印)
        System.out.println(o);
    }
}
