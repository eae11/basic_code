package dn.d35;
/*
文件上传案例服务器端:读取客户端上传的文件,保存到服务器的硬盘,给客户端回写"上传成功”
明确:
数据源:客户端上传的文件
目的地:服务器的硬盘d :\\upload\\1.jpg
实现步骤:
1.创建一个服务器serverSocket对象,和系统要指定的端口号
2.使用ServerSocket对象中的方法accept,获取到请求的客户端socket对象
3.使用socket对象中的方法getInputStream,获取到网络字节输入流InputStream对象
4.判断d:\\upload文件夹是否存在,不存在则创建
5.创建一个本地字节输出流Fileoutputstream对象，构造方法中绑定要输出的目的地
6.使用网络字节输入流Inputstream对象中的方法read,读取客户端上传的文件
7.使用本地字节输出流FiLeOutputStream对象中的方法write,把读取到的文件保存到服务器的硬盘上
8.使用Socket对象中的方法getoutputstream,获取到网络字节输出流outputStream对象
9.使用网络字节输出流Outputstream对象中的方法write,给客户端回写"上传成功”
10.释放资源(Fileoutputstream, socket , serversocket)
 */

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Random;

public class FileUploadTCPServer {
    public static void main(String[] args) throws IOException {
        //1.创建一个服务器serverSocket对象,和系统要指定的端口号
        ServerSocket ss = new ServerSocket(8888);
        //2.使用ServerSocket对象中的方法accept,获取到请求的客户端socket对象
        /*
        让服务器一直处于监听状态(死循环accept方法)
        有一个客户端上传文件,就保存一个文件
         */
        while (true) {
            Socket socket = ss.accept();
            /*
            使用多线程技术,提高程序的效率
            有一个客户端上传文件,就开启一个线程,完成文件的上传
             */
            new Thread(new Runnable() {
                //完成文件的上传
                @Override
                public void run() {
                    FileOutputStream fos = null;
                    try {
                        //3.使用socket对象中的方法getInputStream,获取到网络字节输入流InputStream对象
                        InputStream is = socket.getInputStream();
                        //4.判断d:\\upload文件夹是否存在,不存在则创建
                        File file = new File("D:\\UpLoad");
                        if (!file.exists()) {
                            file.mkdirs();
                        }
                        String filename = "itcast" + System.currentTimeMillis() + new Random().nextInt(99999) + ".txt";
                        //5.创建一个本地字节输出流Fileoutputstream对象，构造方法中绑定5要输出的目的地
//        FileOutputStream fos = new FileOutputStream(file + "\\3.txt");
                        fos = new FileOutputStream(file + "\\" + filename);
                        //6.使用网络字节输入流Inputstream对象中的方法read,读取客户端上传的文件
                        System.out.println("2222222222222");
                        byte[] bytes = new byte[1024];
                        int len = 0;
                        while ((len = is.read(bytes)) != -1) {
                            //7.使用本地字节输出流FiLeOutputStream对象中的方法write,把读取到的文件保存到服务器的硬盘上
                            fos.write(bytes);
                        }
                        System.out.println("死循环打印不到");
                        //8.使用Socket对象中的方法getoutputstream,获取到网络字节输出流outputStream对象
                        OutputStream os = socket.getOutputStream();
                        //9.使用网络字节输出流Outputstream对象中的方法write,给客户端回写"上传成功”
                        os.write("上传成功".getBytes());
                        //10.释放资源(Fileoutputstream, socket , serversocket)

                    } catch (IOException e) {
                        e.printStackTrace();
                    } finally {
                        try {
                            socket.close();
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                        try {
                            fos.close();
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    }
                }
            }).start();

        }
//        ss.close();服务器不用关闭
    }
}
