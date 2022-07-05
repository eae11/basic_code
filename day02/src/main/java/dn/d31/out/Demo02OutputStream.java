package dn.d31.out;
/*
        一次写多个字节的方法:
        - public void write(byte[] b):将b.Length字节从指定的字节数组写入此输出流。
        - public void write(byte[ ] b， int off, int len):从指定的字节数组写入len字节，从偏移量off开始输出到此输出流。
        */

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;

//根路径D:\IdeaProjoct\basic-code
public class Demo02OutputStream {
    public static void main(String[] args) throws IOException {
        //创建FiLeoutputstream对象，构造方法中绑定要写入数据的目的地
        FileOutputStream fos = new FileOutputStream(new File("day02\\src\\dn\\d31\\2.txt"));
        //调用Fileoutputstream对象中的方法write,把数据写入到文件中在文件中
        //文件中显示100,写个字节
        fos.write(49);
        fos.write(48);
        fos.write(48);
        /*
        public void write(byte[ ] b):将 b.Length字节从指定的字节数组写入此输出流。一次写多个字节:
        如果写的第一个字节是正数(0-127),那么显示的时候会查询ASCII表
        如果写的第一个字节是负数,那第一个字节会和第二个字节,两个字节组成一个中文显示,查询系统默认码表(GBK)
         */
//        byte[] b = {65, 66, 67,68,69};
//        byte[] b = {-65, -66, -67,68,69};
        /*
        public void write(byte[] b, int off, int len):把字节数组的一部分写入到文件中
        int off:数组的开始索引
        int len:写几个字节
         */
//        byte[] b = {-65, -66, -67, 68, 69};
//        fos.write(b, 1, 3);
        byte[] bytes = "你好".getBytes();
        System.out.println(Arrays.toString(bytes));//[-28, -67, -96, -27, -91, -67]
        fos.write(bytes);
        //释放资源
        fos.close();
    }
}
