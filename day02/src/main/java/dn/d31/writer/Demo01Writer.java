package dn.d31.writer;

import java.io.FileWriter;
import java.io.IOException;

/*
java.io.writer:字符输出流,是所有字符输出流的最顶层的父类,是一个抽象类共性的成员方法:
- void write(int c)写入单个字符。
- void write(char[] cbuf)写入字符数组。
- abstract void write(char[ ] cbuf，int off， int len )写入字符数组的某一部分, off数组的开始索引,Len写的字符个数。- void write( String str)写入字符串。
- void iwrite(String str，int off，int len)写入字符串的某一部分, off字符串的开始索引, Len写的字符个数。- void flush()刷新该流的缓冲。
- void close(）关闭此流，但要先刷新它。
java.io. Filewriter extends outputStreamWriter extends writerFiLewriter:文件字符输出流
作用:把内存中字符数据写入到文件中
构造方法:
FiLewriter(File file)根据给定的File 对象构造一个FiLewriter 对象。
FiLewriter(String fileName）根据给定的文件名构造一个Filewriter对象。
参数:写入数据的目的地
string fileName:文件的路径
File file:是一个文件
构造方法的作用:
1.会创建一个Filewriter对象
2.会根据构造方法中传递的文件/文件的路径,创建文件
3.会把FiLewriter对象指向创建好的文件

字符输出流的使用步骤(重点):
1.创建FiLewriter对象,构造方法中绑定要写入数据的目的地
2.使用Filewriter中的方法vrite,把数据写入到内存缓冲区中(字符转换为字节的过程)
3.使用Filewriter中的方法flush,把内存缓冲区中的数据,刷新到文件中
4.释放资源(会先把内存缓冲区中的数据刷新到文件中)

 */
public class Demo01Writer {
    public static void main(String[] args) throws IOException {
        //1 .创建FiLewriter对象,构造方法中绑定要写入数据的目的地
        FileWriter fw = new FileWriter("D:\\IdeaProjoct\\basic-code\\day02\\src\\dn\\d31\\6.txt");
        //2.使用Filelriter中的方法vrite,把数据写入到内存缓冲区中(字符转换为字节的过程)
        //void write(int c)写入单个字符。
        fw.write(97);
        //3. 使用FiLewriter中的方法fLush, 把内存缓冲区中的数据, 刷新到文件中
        fw.flush();
        //4 .释放资源(会先把内存缓冲区中的数据刷新到文件中)
        fw.close();
    }
}
