package cn.c4;

/*
在父子类的继承关系当中，创建子类对象，访问成员方法的规则：
   创建的对象是谁，就优先用谁，如果没有则向上找。
注意事项:
无论是成员方法还是成员变量，如果没有都是向上找父类，绝对不会向下找子类的。

重写（也叫覆盖）（override）
概念：在继承关系当中，方法的名称，参数列表也一样。

重写（override）：方法的名称一样，方法的参数列表也一样。
重载（overload）：方法的名称一样，方法的参数列表不一样。
方法的重写特点：创建的是子类对象，则优先用子类方法。
 */
public class Demo04Extends {
    public static void main(String[] args) {
        Zi zi = new Zi();
        zi.methodFu();
        zi.methodZi();

        //创建的是new了子类对象，所有优先用子类方法
        zi.method();
    }
}
