package cn.c23;

/*
如果一个类是定义在一个方法内部的，那么这就是一个局部内部类。
"局部"：只有当前所属的方法才能使用它，出了这个方法就不能用了。
定义格式：
修饰符 class 外部类名称{
   修饰符 返回值类型 (参数列表){
   class 局部内部类{
        // ...
   }
   }
}
小节一下类的权限修饰符:
public >  protected > (default) >private
定义一个类的时候,权限修饰符规则:
1、外部类：public，default
2、成员内部类：都可以
3、局部内部类：什么都不能写
 */
public class Outer {
    public void methodOuter() {//局部内部类
        class Inner {
            final int num = 10;

            public void methodInner() {
                System.out.println(num);//10
            }
        }
        Inner inner = new Inner();
        inner.methodInner();
    }
}
