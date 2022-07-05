package annotation;
/*
##注解︰
*概念:说明程序的。给计算机看的
*注释:用文字描述程序的。给程序员看的
定义:注解(Annotation)，也叫元数据。一种代码级别的说明。它是JOK1.5及以后版本引入的一个特性，与类、接口、枚举是在同一个层次。它可以声明在包、类、字段、方法、局部变量、方法参数等的前面，用来对这些元素进行说明，注释。
*概念描述∶
*JDK1.5之后的新特性
*说明程序的
*使用注解︰@注解名称
*作用分类:
编写文档:通过代码里标识的注解生成文档【生成文档doc文档】
代码分析:通过代码里标识的注解对代码进行分析【使用反射】
编译检查:通过代码里标识的注解让编译器能够实现基本的编译检查【override]
* JDK中预定义的一些注解
*@override :检测被该注解标注的方法是否是继承自父类(接口)的
*@Deprecated :该注解标注的内容，表示已过时
*Suppresswarnings :压制警告
*一般传递参数all  @SuppressWarnings("all")

 */

/**
 * 注解javadoc演示
 *
 * @author itcat
 * @version 1.0
 * @since 1.5
 */
public class Demo01Annotation {
    /**
     * 计算两数的和
     *
     * @param a 整数
     * @param b 整数
     * @return 两数的和
     */
    public int add(int a, int b) {
        return a + b;
    }
}
