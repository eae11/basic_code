package dn.d29;

import java.io.File;

/*
练习:
递归打印多级目录
需求:
只要.java结尾的文件

 */
public class Demo05Recursion {
    public static void main(String[] args) {
        File file = new File("D:\\abc");
        getAllFile(file);
    }

    /*
        定义一个方法，参数传递File类型的目录
        方法中对目录进行遍历
     */
    private static void getAllFile(File dir) {
//        System.out.println(dir);//直接打印被遍历的目录名称
        File[] files = dir.listFiles();
        for (File file : files) {
            //对遍历得到的File对象f进行判断，户断是否是文件夹
            if (file.isDirectory()) {
                //f是一个文件夹,则继续遍历这个文件夹
                //我们发现getAllFile方法就是传递文件失,遍历文件夹的方法
                //所以直接调用getAllFile方法即可:递归(自己调用白己)
                getAllFile(file);
            } else {
                //if是一个文件，直接打印即可
                /*
                    只要.java结尾的文件
                    1、把File对象转换为字符串对象
                 */
                //String fileName = file.getName();
                //String filepath = file.getPath();
//                String s = file.toString();
//                //把字符串，转换为小写
//                s = s.toLowerCase();
//                if (s.endsWith(".java")) /*2.调用String类中的方法endsWith判断字符串是否是以，java结尾*/ {
//                    System.out.println(s);//3.如果是以。java结尾的文件,则输出
//                }
                if (file.getName().toLowerCase().endsWith(".java")) {
                    System.out.println(file);
                }
            }
        }
    }
}


