package cn.c13;
/*
1、接口的默认方法，可以通过接口实现类对象直接调用。
2、接口的默认方法，也可以被接口实现类进行覆盖。
 */
public class Demo13Interface02 {
    public static void main(String[] args) {
        //创建了实现类对象
        MyinterfaceDefaultA a = new MyinterfaceDefaultA();
        a.method();
        //调用了默认方法，如果实现类当中没有，会向上找接口
        a.methodDefault();
        System.out.println("===========");
        MyinterfaceDefaultB b = new MyinterfaceDefaultB();
        b.method();
        b.methodDefault();
    }
}
