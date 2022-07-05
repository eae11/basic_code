package dn.d33;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

/*
java.io.Bufferedwriter extends writer
Bufferedwriter :字符缓冲输出流
继承自父类的共性成员方法:
- void write(int c)写入单个字符。
- void write(char[] cbuf)写入字符数组。
- abstractvoid write(char[] cbuf， int off，int len)写入字符数组的某一部分, off数组的开始索引, Len写的字符个数。
- void write( String str)写入字符串。
- void write( String str,int off， int len)写入字符串的某一部分, off字符串的开始索引,Len写的字符个数。
- void flush()刷新该流的缓冲。
- void close( 关团此流，但要先刷新它。

构造方法:
Bufferedwriter(writer out）创建一个使用黑认大小输出缓冲区的缓冲字符输出流。
Bufferedwriter(writer out， int sz）创建一个使用给定大小输出缓冲区的新缓冲字符输出流。参数:
writer out:字符输出流
我们可以传递FiLewriter ,缓冲流会给FiLewriter增加一个缓冲区,提高FiLewriter的写入效率
int sz:指定缓冲区的大小,不写默认大小
特有的成员方法:
void newLine()写入一个行分隔符。会根据不同的操作系统,获取不同的行分隔符
换行:换行符号
windows : \r\n
linux : / n
mac:/r
使用步骤:
1.创建字符缓冲输出流对象,构造方法中传递字符输出流
2.调用字符缓冲输出流中的方法rite,把数据写入到内存缓冲区中
3.调用字符缓冲输出流中的方法fLush,把内存缓冲区中的数据,刷新到文件中
4.释放资源


 */
public class Demo04BufferedWriter {
    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new FileWriter("D:\\IdeaProjoct\\basic-code\\day02\\src\\dn\\d31\\8.txt"));
        bw.write("哈哈哈哈");
//        bw.write("\r\n");
        bw.newLine();
        bw.write("哈哈哈哈");
        bw.flush();
        bw.close();
    }
}
