package dn.d28;

import java.io.File;

/*
File判断功能的方法
. public boolean exists() :此FEle表示的文件或目录是否实际存在。
. public boolean isDirectory() :此File表示的是否为目录。
.public boolean isFile() :此File表示的是否为文件。
 */
public class Demo04File {
    public static void main(String[] args) {
        show02();
    }

    /*
        public boolean isDirectory() :此File表示的是否为目录。
        用于判断构造方法中给定的路径是否以文件夫结尾
        是:true
        否:false
        public boolean isFile() :此File表示的是否为文件。
        用于判断构造方法中给定的路径是否以文件夹结尾
        是:true
        否:false
         注意:
            电脑的硬盘中只有文件/文件夹,两个方法是互斥的
            这两个方法使用前提，路径必须是存在的，否则都返回false
     */
    private static void show02() {
        File f1 = new File("D:\\ps3\\08.运动鞋.mp4");
        if (f1.exists()) {
            System.out.println(f1.isFile());
            System.out.println(f1.isDirectory());
        }
        File f2 = new File("D:\\ps3\\08.运动鞋案例.mp4");
        if (f2.exists()) {
            System.out.println(f2.isFile());
            System.out.println(f2.isDirectory());
        }
    }

    /*
        public boolean exists() :此File表示的文件或目录是否实际存在。
        用于判断构造方法中的路径是否存在
        存在:true
        不存在:false

     */
    private static void show01() {
        File f1 = new File("D:\\ps3\\08.运动鞋案例.mp4");
        boolean e1 = f1.exists();
        System.out.println(e1);

    }
}
