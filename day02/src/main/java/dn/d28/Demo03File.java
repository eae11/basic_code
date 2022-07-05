package dn.d28;

import java.io.File;

/*
File类获职功能的方法
. public String getAbsolutePath() :返回此File的绝对路径名字符串。
. public string getPath() :将此File转换为路径名字符串。
. public String getName():返回由此File表示的文件或目录的名称。
. public long length() :返回由此File表示的文件的长度。

 */
public class Demo03File {
    public static void main(String[] args) {
        show03();
    }

    /*
        public long length() : 返回由此File表示的文件的长度。
        获取的是构造方法指定的文件的大小，以字节为单位
        注意:
        文件央是没有大小概念的,不能获取文件夹的大小
        如果构造方法中给出的路径不存在,那么length方法返回0

     */
    private static void show04() {
        File f1 = new File("D:\\ps3\\08.运动鞋案例.mp4");
        long l1 = f1.length();
        System.out.println(l1);//94598965字节
        File f2 = new File("D:\\ps3\\08.运动鞋案.mp4");
        long l2 = f2.length();
        System.out.println(l2);//0
        File f3 = new File("D:\\BluestacksCN");
        System.out.println(f3.length());//0 文件夹没有大小概念
    }

    /*
        public string getName() : 返回由此File表示的文件或目录的名称。
        获取的就是构造方法传递路径的{结尾}部分(文件/文件央)
     */
    private static void show03() {
        File f1 = new File("C:\\Users\\itcast\\IdeaProjects\\shungyuan\\a.txt");
        String name1 = f1.getName();
        System.out.println(name1);//a.txt
        File f2 = new File("C:\\Users\\itcast\\IdeaProjects\\shungyuan");
        String name2 = f2.getName();
        System.out.println(name2);
    }

    /*
    public string getPath() :将此File转换为路径名字符串。
    获取的构造方法中传递的路径
    toString方法调用的就是getPath方法
     */
    private static void show02() {
        File f1 = new File("C:\\Users\\itcast\\IdeaProjects\\shungyuan\\a.txt");
        File f2 = new File("a.txt");
        String path1 = f1.getPath();
        String path2 = f2.getPath();
        System.out.println(path1);//C:\Users\itcast\IdeaProjects\shungyuan\a.txt
        System.out.println(path2);//a.txt
        System.out.println(f1);//C:\Users\itcast\IdeaProjects\shungyuan\a.txt
        System.out.println(f1);//C:\Users\itcast\IdeaProjects\shungyuan\a.txt
    }

    /*
    public string getAbsolutePath() :返回此File的绝对路径名字符串。
    获取的构造方法中传递的路径
    无论路径是绝对的还是相对的，getAbsolutePath方法近回的都是绝对路径

     */
    private static void show01() {
        File f1 = new File("C:\\Users\\itcast\\IdeaProjects\\shungyuan\\a.txt");
        String absolutePath1 = f1.getAbsolutePath();//C:\Users\itcast\IdeaProjects\shungyuan\a.txt
        System.out.println(absolutePath1);
        File f2 = new File("a.txt");
        String absolutePath2 = f2.getAbsolutePath();
        System.out.println(absolutePath2);//D:\IdeaProjoct\basic-code\a.txt
    }
}
