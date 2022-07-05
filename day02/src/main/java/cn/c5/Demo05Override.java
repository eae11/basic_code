package cn.c5;

/*
方法覆盖的注意事项：
1、必须保证父子类之间方法的名称相同，参数列表也相同。
@Override:写在方法前面，用来检测是不是有效的正确覆盖重写。不写也可以
2、子类方法的返回值必须小于等于父类方法的返回值范围。
java.lang.Object类是所有类的公共最高类（祖宗类），java.lang.String就是Object的子类
3、子类方法的权限必须大于等于父类方法的权限修饰符。
public > protected > (default)(空) > private
 */
public class Demo05Override {
}
