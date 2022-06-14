package reflect;

import domain.Person;

import java.lang.reflect.Constructor;

/*
Class对象功能:
*获取功能:
1．获取成员变量们
*Field[] getFields()获取所有public修饰的成员变量
*Field getField(String name)获取指定名称的public修饰的成员变量

*Field getDeclaredFields()获取所有的成员变量不考虑修饰符
*Field getDeclaredField(String name)获取指定名称的成员变量

2．获取构造方法们
*Constructor<?>[]getConstructors()
*Constructor<T>getConstructor(类<?>... parameterTypes)

*Constructor<T>getDeclaredConstructor(类<?>... parameterTypes)
*Constructor<? >[]getDeclaredConstructors()
3．获取成员方法们:
*Method[] getMethods()
*Method getMethod(String name，类<?>... parameterTypes)
*Method[] getDeclaredMethods()
*Method getDeclaredMethod(String name，类<?>... parameterTypes)
4．荻取类名
* String getName()

*constructor:构造方法
*创建对象:
T newInstance(object. . . initargs)
*如果使用空参数构造方法创建对象，操作可以简化:class对象的newInstance方法

 */
public class Demo03Reflect {
    public static void main(String[] args) throws Exception {
        //获取Person的Class对象
        Class personClass = Person.class;
    /*
    2．获取构造方法们
        *Constructor<?>[]getConstructors()
        *Constructor<T>getConstructor(类<?>... parameterTypes)

        *Constructor<T>getDeclaredConstructor(类<?>... parameterTypes)
        *Constructor<? >[getDeclaredConstructors()
     */

        //Constructor<T>getConstructor(类<?>... parameterTypes)
        Constructor constructor = personClass.getConstructor(String.class, int.class);
        System.out.println(constructor);
        Object person = constructor.newInstance("张三", 23);
        System.out.println(person);
        System.out.println("--------------------");
        //Constructor<T>getConstructor()
        Constructor constructor2 = personClass.getConstructor();
        System.out.println(constructor2);
        Object person2 = constructor2.newInstance();
        System.out.println(person2);

        Object o = personClass.newInstance();
        System.out.println(o);

        constructor.setAccessible(true);//暴力反射
    }
}
