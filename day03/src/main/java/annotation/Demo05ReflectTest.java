package annotation;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/*
框架类
需求:写一个"框架"，不能改变该类的任何代码的前提下，可以帮我们创建任意类的对象，并且执行其中任意方法*实现︰
1．配置文件
2．反射
步骤∶
1．将需要创建的对象的全类名和需要执行的方法定义在配置文件中
2．在程序中加载读取配置文件
3．使用反射技术来加载类文件进内存
4．创建对象
5．执行方法

 */
@Pro(className = "dn.annotation.Demo1", methodName = "show")
public class Demo05ReflectTest {
    public static void main(String[] args) throws IOException, ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        /*
        前提:不能改变该类的任何代码。可以创建任意类的对象，可以执行任意方法
         */

        //解析注解
        //获取该类的字节码文件对象
        Class<Demo05ReflectTest> demo05ReflectTestClass = Demo05ReflectTest.class;
        //获取上边的注释对象
        //其实就是在内存中生成了一个该注解接口的子类实现对象
        /*
         public class ProImpl implements Pro{
            public String className(){
                return "dn.annotation.Demo1" ;
            }
            public String methodName(){
                return " show";
            }
        }
         */
        Pro an = demo05ReflectTestClass.getAnnotation(Pro.class);
        //调用注解对象中定义的抽象方法，获取返回值
        String className = an.className();
        String methodName = an.methodName();
        System.out.println(className);
        System.out.println(methodName);

        Class cla = Class.forName(className);
        Object o = cla.newInstance();
        Method method = cla.getMethod(methodName);
        method.invoke(o);

    }
}
