package reflect;


import domain.Person;

import java.lang.reflect.Field;

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
*Constructor<? >[getDeclaredConstructors()
3．获取成员方法们:
*Method[] getMethods()
*Method getMethod(String name，类<?>... parameterTypes)
*Method[] getDeclaredMethods()
*Method getDeclaredMethod(String name，类<?>... parameterTypes)
4．荻取类名
* String getName()

Field:成员变量
*操作:
1．设置值
*void set(object obj,object value)
2．获取值
*get(object obj)
3．忽略访问权限修饰符的安全检查
*setAccessible(true):暴力反射

 */
public class Demo02Reflect {
    public static void main(String[] args) throws Exception {
        //获取Person的Class对象
        Class personClass = Person.class;
    /*
        获取成员变量们
        *Field[] getFields()
        *Field getField(String name)

        *Field getDeclaredFields()
        *Field getDeclaredField(String name)
     */
        //Field[] getFields()
        Field[] fields = personClass.getFields();
        for (Field field : fields) {
            System.out.println(field);
        }
        System.out.println("--------------");

        //Field getField(String name)
        Field a = personClass.getField("a");
        //获取成员变量的值
        Person p = new Person();
        Object value = a.get(p);
        System.out.println(value);
        a.set(p, "张三");
        System.out.println(p);
        System.out.println("==========");

        //Field getDeclaredFields():获取所有的成员变扯，不考虑修饰符
        Field[] declaredFields = personClass.getDeclaredFields();
        for (Field declaredField : declaredFields) {
            System.out.println(declaredField);
        }
        System.out.println("==========");
        //Field getDeclaredField(String name)
        Field d = personClass.getDeclaredField("d");
        d.setAccessible(true);//暴力反射
        Object value2 = d.get(p);
        System.out.println(value2);
    }
}
