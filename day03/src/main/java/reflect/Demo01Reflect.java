package reflect;

import domain.Person;
import domain.Student;

/*
获取class对象的方式:
1. Class.forName("全类名"):将字节码文件加载进内存，返回class对象
2．类名.class:通过类名的属性class获取
3．对象.getclass(): getclass()方法在object类中定义着。

 */
public class Demo01Reflect {
    public static void main(String[] args) throws Exception {
        //1.Class.forName("全类名")
        Class cla = Class.forName("dn.domain.Person");
        System.out.println(cla);
        //2.类名.class
        Class cla2 = Person.class;
        System.out.println(cla2);
        //3.对象.getClass()
        Person p = new Person();
        Class cla3 = p.getClass();
        System.out.println(cla3);

        //== 比较三个对象
        System.out.println(cla == cla2);
        System.out.println(cla == cla3);
        Class c = Student.class;
        System.out.println(c == cla);
    }
}
