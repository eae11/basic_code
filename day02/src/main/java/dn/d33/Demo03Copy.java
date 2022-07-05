package dn.d33;

import java.io.*;

/*
文件复制练习:一读一写明确:
数据源:c:\\1.jpg
数据的目的地:d: \\1.jpg文件复制的步骤:
1.创建字节缓冲输入流对象,构造方法中传递字节输入流
2.创建字节缓冲输出流对象,构造方法中传递字节输出流
3.使用字节缓冲输入流对象中的方法read,读取文件
4.使用字节缓冲输出流中的方法write,把读取的数据写入到内部缓冲区中
5.释放资源(会先把缓冲区中的数据,刷新到文件中)

 */
public class Demo03Copy {
    public static void main(String[] args) throws IOException {
        long s1 = System.currentTimeMillis();
        FileInputStream fis = new FileInputStream("d:\\1.jpg");
        FileOutputStream fos = new FileOutputStream("e:\\1.jpg");
        BufferedInputStream bis = new BufferedInputStream(fis);
        BufferedOutputStream bos = new BufferedOutputStream(fos);
//        int len = 0;
//        while ((len = bis.read()) != -1) {
//            bos.write(len);
//        }
        byte[] bytes = new byte[1024];
        int len = 0;
        while ((len = bis.read(bytes)) != -1) {
            bos.write(bytes, 0, len);
        }
        bis.close();
        bos.close();
        long s2 = System.currentTimeMillis();
        System.out.println(s2 - s1);
    }
}
