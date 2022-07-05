package cn.c17;
/*
在多态的代码当中，成员方法的访问规则是：
  new的是谁，就优先用谁，没有则向上找。
  口诀：编译看左边，运行看右边。
  对比一下：
成员变量：编译看左边，运行还看左边。
成员方法：编译看左边，运行看右边。
 */

public class Demo17MultiField2 {
    public static void main(String[] args) {
        Fu obj = new Zi();//多态
        obj.method();//父子都有，优先用子
        obj.methodFu();//子类没有，向上找，找到父类
        //编译看左边，左边是Fu，Fu当中没有methodZi，所有编译报错。
//        obj.methodZi();//错误写法！
    }
}
