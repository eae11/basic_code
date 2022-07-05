package cn.c6;

/*
继承关系中，父子类构造方法的访问特点：
1、子类构造方法当中有一个默认隐含的"super();"调用，所有一定是先调用父类构造，后执行子类构造。
2、可以通过super关键字来子类构造调用父类重载构造。
3、super的父类构造调用，必须是子类构造方法的第一个语句。不能一个子类构造调用多次super构造。
4、子类必须调用父类构造，不写则赠送super();写了则用指定的super调用，super只能有一个，而且必须写在语句的第一行。
 */
public class Demo06Constructor {
    public static void main(String[] args) {
        Zi zi = new Zi();

    }
}
