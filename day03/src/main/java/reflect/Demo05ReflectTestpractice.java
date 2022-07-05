package reflect;

import java.io.InputStream;
import java.lang.reflect.Method;
import java.util.Properties;

public class Demo05ReflectTestpractice {
    public void sleep() {
        System.out.println("sleep");
    }

    public static void main(String[] args) throws Exception {
        Properties pro = new Properties();
        Class cla1 = Demo05ReflectTestpractice.class;
        ClassLoader classLoader = cla1.getClassLoader();
        InputStream is = classLoader.getResourceAsStream("pro.properties");
        pro.load(is);
        String className = pro.getProperty("className");
        String methodName = pro.getProperty("methodName");
        Class cla = Class.forName(className);
        Object o = cla.newInstance();
        Method method = cla.getMethod(methodName);
        method.invoke(o);
    }
}
