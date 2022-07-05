package dn.d31.input;

import java.io.FileInputStream;
import java.io.IOException;

/*
使用字节流读取中文文件
1个中文GBK:占用两个字节
UTF-8:占用3个字节

 */
public class Demo03InputStream {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("D:\\IdeaProjoct\\basic-code\\day02\\src\\dn\\d31\\3.txt");
        int len = 0;
        while ((len = fis.read()) != -1) {
            System.out.println(len);
        }
        fis.close();
    }
}
