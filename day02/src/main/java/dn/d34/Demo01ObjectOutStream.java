package dn.d34;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

/*
java.io.0bjectoutputstream extends outputstream
objectoutputstream:对象的序列化流
作用:把对象以流的方式写入到文件中保存
构造方法:
objectoutputStream(OutputStream out）创建写入指定OutputStream的 objectOutputStream。
参数:
outputstream out:字节输出流
特有的成员方法:
void write0bject(0bject obj）将指定的对象写入objectoutputstream
使用步骤:
1.创建objectoutputstream对象,构造方法中传递字节输出流
2.使用objectoutputstream对象中的方法writeobject,把对象写入到文件中
3.释放资源

 */
public class Demo01ObjectOutStream {
    public static void main(String[] args) throws IOException {
        //1.创建objectoutputstream对象,构造方法中传递字节输出流
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("D:\\IdeaProjoct\\basic-code\\day02\\src\\dn\\d34\\1.txt"));
        //2.使用objectoutputStream对象中的方法writebject,把对象写入到文件中
        oos.writeObject(new Person("小美女", 18));
        //3.释放资源
        oos.close();
    }
}
