package dn.d33;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;

/*
java.io.BufferedInputStream extends Inputstream
BufferedInputstream:字节缓冲输入流

继承自父类的成员方法:
int read()从输入流中读取数据的下一个字节。
int read(byte[] b）从输入流中读取一定数量的字节，并将其存储在缓冲区数组b中。
void close()关闭此输入流并释放与该流关联的所有系统资源。

构造方法:
BufferedInputStream(InputStream in）创建一个BufferedInputStream 并保存其参数，即输入流in，以便将来使用。
BufferedInputStream(Inputstream in, int size)
创建具有指定缓冲区大小的BufferedInputStream 并保存其参数，即输入流in，以便将来使用。
参数:
Inputstream in:字节输入流
我们可以传递FileInputStream ,缓冲流会给FiLeInputStream增加一个缓冲区,提高FiLeInputStream的读取效率
int size:指定缓冲流内部缓冲区的大小,不指定默认

 */
public class Demo02BufferedInputStream {
    public static void main(String[] args) throws IOException {
        //1.创建FileInputstream对象,构造方法中绑定要读取的数据源
        FileInputStream fis = new FileInputStream("D:\\IdeaProjoct\\basic-code\\day02\\src\\dn\\d31\\8.txt");
        //2.创建BufferedInputStream对象,构造方法中传递FileInputStream对象,提高FiLeInputStream对象的读取效率
        BufferedInputStream bis = new BufferedInputStream(fis);
        //3.使用BufferedInputStream对象中的方法read,读取文件
//        int len = 0;
//        while ((len = bis.read()) != -1) {
//            System.out.println(len);
//        }
        byte[] bytes = new byte[1024];
        int len = 0;
        while ((len = bis.read(bytes)) != -1) {
            System.out.println(new String(bytes));
        }
        //4.释放资源
        bis.close();
    }
}
