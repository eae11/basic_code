package dn.d33;

import java.io.FileReader;
import java.io.IOException;

/*
FiLeReader可以读取IDE黑犬认编码格式(UTF-8)的文件
FiLeReader读取系统默认编码(中文GBK)会产生乱码���

 */
public class Demo07FileReader {
    public static void main(String[] args) throws IOException {
        FileReader fr = new FileReader("D:\\IdeaProjoct\\basic-code\\day02\\src\\dn\\d33\\我是GBK编码格式的文本.txt");
        int len = 0;
        while ((len = fr.read()) != -1) {
            System.out.print((char) len);
        }
        fr.close();
    }
}
