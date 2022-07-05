package dn.d35;
/*
文件上传案例的客户端:读取本地文件,上传到服务器,读取服务器回写的数据
明确:
数据源:c:\\1.jpg
目的地:服务器
实现步骤:
1.创建一个本地字节输入流FileInputStream对象,构造方法中绑定要读取的数据源
2.创建一个客户端Socket对象,构造方法中绑定服务器的IP地址和端口号
3.使用socket中的方法getoutputstream,获取网络字节输出流outputStream对象
4.使用本地字节输入流FiLeInputstream对象中的方法read,读取本地文件
5.使用网络字节输出流outputStream对象中的方法write,把读取到的文件上传到服务器
6.使用socket中的方法getInputStream,获取网络字节输入流InputStream对象
7.使用网络字节输入流Inputstream对象中的方法read读取服务回写的数据
8.释放资源(FileInputstream, socket)

 */

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

public class FileUploadTCPClient {
    public static void main(String[] args) throws IOException {
        //1.创建一个本地字节输入流FileInputStream对象,构造方法中绑定要读取的数据源
        FileInputStream fis = new FileInputStream("D:\\IdeaProjoct\\basic-code\\day02\\src\\dn\\d34\\3.txt");
        //2.创建一个客户端socket对象,构造方法中绑定服务器的IP地址和端口号
        Socket socket = new Socket("127.0.0.1", 8888);
        //3.使用Socket中的方法getoutputStream,获取网络字节输出流outputStream对象
        OutputStream os = socket.getOutputStream();
        //4.使用本地字节输入流FileInputstream对象中的方法read,读取本地文件
        int len = 0;
        byte[] bytes = new byte[1024];
        while ((len = fis.read(bytes)) != -1) {
            //5.使用网络字节输出流outputstream对象中的方法write,把读取到的文件上传到服
            os.write(bytes, 0, len);
        }
        System.out.println("1111111111");
        /*
        解决:上传完文件,给服务器写一个结束标记
        void shutdownOutput()禁用此套接字的输出流。
        对于TCP套接字，任何以前写入的数据都将被发送，并且后跟TCP的正常连接终止序列。
         */
        socket.shutdownOutput();
        //6.使用socket中的方法getInputStream,获取网络字节输入流InputStream对象
        InputStream is = socket.getInputStream();
        //7.使用网络字节输入流Inputstream对象中的方法read读取服务回写的数据
        while ((len = is.read(bytes)) != -1) {
            System.out.println(new String(bytes, 0, len));
        }
        System.out.println("死循环打印不到");
        //8.释放资源(FileInputstream, socket)
        fis.close();
        socket.close();
    }
}
