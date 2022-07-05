package cn.c1;

/*
在父子类的继承关系中，如果当成员变量重名，则创建子类对象时，访问有两种方式：

直接通过子类对象访问成员变量：
  等号左边是谁，就优先用谁，没有则向上找。
间接通过成员方法访问成员变量：
  该方法属于是就优先用谁，没有则向上找。
 */
public class Demo02Extends {
    public static void main(String[] args) {
        Fu fu = new Fu();//创建父类对象
        System.out.println(fu.numFu);//只能使用父类的东西，没有任何子类内容

        Zi zi = new Zi();
        System.out.println(zi.numFu);
        System.out.println(zi.numZi);
        //等号左边是谁，就优先用谁
        System.out.println(zi.num);//Zi zi = new Zi();等号左边是Zi
//        System.out.println(zi.abc);都没有编译报错

        //这个方法是子类的，优先用子类的，没有则向上找
        zi.methodZi();//200
        //这个方法是父类当中定义的
        zi.methodFu();//100
    }
}
