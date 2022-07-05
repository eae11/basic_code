package dn.d29;

import java.io.File;

/*
练习:
递归打印多级目录
需求:
遍历c:\\abc文件夹,及abc文件夫的子文件央
D:\\abc
D:\\abc\\abc. txt
D:\\abc\\abc.java
D:\\abc\\a
D:\\abc\\a\\a.java
D:\\abc\\a\\a. txt
D:\\abc\\b
D:\\abc\\b\\b. java
D:\\abc\\b\lb. txt
 */
public class Demo04Recursion {
    public static void main(String[] args) {
        File file = new File("D:\\abc");
        getAllFile(file);
    }

    /*
        定义一个方法，参数传递File类型的目录
        方法中对目录进行遍历
     */
    private static void getAllFile(File dir) {
        System.out.println(dir);//直接打印被遍历的目录名称
        File[] files = dir.listFiles();
        for (File file : files) {
            //对遍历得到的File对象f进行判断，户断是否是文件夹
            if (file.isDirectory()) {
                //f是一个文件夹,则继续遍历这个文件夹
                //我们发现getAllFile方法就是传递文件失,遍历文件夹的方法
                //所以直接调用getAllFile方法即可:递归(自己调用白己)
                getAllFile(file);
            } else {
                //if是一个文件，直接打印脚可
                System.out.println(file);

            }
        }
    }
}


