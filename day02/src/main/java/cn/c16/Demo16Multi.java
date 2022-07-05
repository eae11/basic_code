package cn.c16;

/*
代码当中体现多态性，其实就是一句话：父类引用指向子类对象。
格式：
父类名称 对象名 =new 子类名称();
或者：
接口名称 对象名 =new 实现类名称();
在父子类的继承关系当中，创建子类对象，访问成员方法的规则：
   创建的对象是谁，就优先用谁，如果没有则向上找。
 */
public class Demo16Multi {
    public static void main(String[] args) {
        //使用多态的写法
        //左侧父类的引用，指向子类的对象
        Fu obj = new Zi();
        obj.method();
        obj.methodFu();
    }
}
