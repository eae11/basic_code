package cn.c17;

/*
1、直接通过对象名称访问成员变量：看等号左边是谁，优先用谁，没有则向上找。
2、间接通过成员方法访问成员变量：看该方法属于谁，优先用谁，没有则向上找。
在父子类的继承关系当中，创建子类对象，访问[成员方法]的规则：
   new的是谁，就优先用谁，如果没有则向上找。
 */
public class Demo17MultiField {
    public static void main(String[] args) {
        Fu obj = new Zi();
        System.out.println(obj.num);
//        System.out.println(obj.age);//错误写法
        System.out.println("===========");
        obj.showNum();//子类没有覆盖，就是父：10,覆盖了就是子：20
    }
}
