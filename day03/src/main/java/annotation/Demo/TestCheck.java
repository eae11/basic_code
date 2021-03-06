package annotation.Demo;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.Method;

/*
简单的测试框架
当主方法执行后，会自动检测所有方法（加了check注解的方法）,判断方法是否异常，记录到文件中
 */
public class TestCheck {
    public static void main(String[] args) throws IOException {
        //1.创建计算器对象
        Calculator c = new Calculator();
        //2.获取字节码文件对象
        Class cla = c.getClass();
        //3.获取所有方法
        Method[] methods = cla.getMethods();
        int number = 0;//出现异常的次数
        BufferedWriter bw = new BufferedWriter(new FileWriter("day03\\src\\dn\\bug.txt"));
        //4.判断方法上是否有check注解
        for (Method method : methods) {
            //5.有，执行
            if (method.isAnnotationPresent(Check.class)) {
                try {
                    method.invoke(c);
                    // 6.捕获异常
                } catch (Exception e) {
                    //记录到文件中
                    number++;
                    bw.write(method.getName() + "方法出异常了");
                    bw.newLine();
                    bw.write("异常的名称：" + e.getCause().getClass().getSimpleName());
                    bw.newLine();
                    bw.write("异常的原因" + e.getCause().getMessage());
                    bw.newLine();
                    bw.write("------------------------");
                    bw.newLine();
                }
            }
        }
        bw.write("本次测试共出现" + number + "次异常");
        bw.close();
    }
}


