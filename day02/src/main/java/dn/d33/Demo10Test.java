package dn.d33;

import java.io.*;
import java.nio.charset.StandardCharsets;

/*
练习:转换文件编码
将GBK编码的文本文件，转换为UTF-8编码的文本文件。分析:
1.创建InputStreamReader对象,构造方法中传递字节输入流和指定的编码表名称GBK
2.创建outputstreamwriter对象,构造方法中传递字节输出流和指定的编码表名称UTF-8
3.使用InputstreamReader对象中的方法read读取文件
4.使用outputStreamwriter对象中的方法vrite,把读取的数据写入到文件中
5.释放资源

 */
public class Demo10Test {
    public static void main(String[] args) throws IOException {
        InputStreamReader isr = new InputStreamReader(new FileInputStream("D:\\IdeaProjoct\\basic-code\\day02\\src\\dn\\d31\\11.txt"), "gbk");
        OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream("D:\\IdeaProjoct\\basic-code\\day02\\src\\dn\\d31\\12.txt"), StandardCharsets.UTF_8);
        int len = 0;
        while ((len = isr.read()) != -1) {
            osw.write(len);
        }
        isr.close();
        osw.close();
    }
}
