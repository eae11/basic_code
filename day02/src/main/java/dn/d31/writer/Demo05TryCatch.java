package dn.d31.writer;

import java.io.FileWriter;
import java.io.IOException;

/*
在jdk1.7之前使用try catch finally处理流中的异常格式:
try{
可能会产出异常的代码
}catch(异常类变量变量名){
异常的处理逻辑
}finally{
一定会指定的代码资源释放
}

 */
public class Demo05TryCatch {
    public static void main(String[] args) {
        //提高变量fiv的作用域,让finally可以使用
        //变量在定义的时候,可以没有值,但是使用的时候必须有值
        //fw = new Filewriter("09_IOAndPropertiesllg.txt" ,true);执行失败, fw没有值,fw.cLose会报错
        FileWriter fw = null;
        try {
            //可能出现异常的代码
            fw = new FileWriter("w:\\IdeaProjoct\\basic-code\\day02\\src\\dn\\d31\\8.txt", true);
            for (int i = 0; i < 10; i++) {
                fw.write("HelloWorld" + i + "\r\n");
            }
        } catch (IOException e) {
            //处理异常的逻辑
            e.printStackTrace();
        } finally {
            //一定会指定的代码
            //创建对象失败了, fw的黑认值就是nuLl, nuLL是不能调用方法的,会抛出NuLLPointerException,需要增加一个判断,不是nuLl在把资源释放
            if (fw != null) {
                try {
                    //fw.close方法声明抛出了IOException异常对象,所以我们就的处理这个异常对象,要么throws,要么try catch
                    fw.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
