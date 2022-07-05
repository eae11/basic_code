package cn.c20;

/*
final关键字代表最终的，不可改变的。

常见四种写法：
1、可以用来修饰一个类
2、可以用来修饰一个方法
3、还可以用来修饰一个局部变量
4、还可以用来修饰一个成员变量
 */
public class Demo20Final {
    public static void main(String[] args) {
        //一旦使用final用来修饰局部变量，那么这个变量就不能进行更改。
        //一次赋值，终生不变
        final int num = 200;
        //正确写法！只要保证有唯一一次赋值即可
        final int num1;
        num1 = 30;
        //对于基本类型来说，不可改变说的是变量当中的数据不可改变
        //对于引用类型来说，不可改变说的是变量当中的地址值不可改变
        Student stu1 = new Student("赵丽颖");
        System.out.println(stu1);
        System.out.println(stu1.getName());//赵丽颖
        stu1 = new Student("高圆圆");
        System.out.println(stu1);
        System.out.println(stu1.getName());//高圆圆
        System.out.println("=============");
        final Student stu2 = new Student("迪丽热巴");
        //错误写法，final的引用类型变量，地址值不可改变
//        stu2 = new Student("赵又廷")
        stu2.setName("高圆圆圆圆圆");
        System.out.println(stu2.getName());
    }
}
