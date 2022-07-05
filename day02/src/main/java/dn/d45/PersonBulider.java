package dn.d45;

/*
    定义一个创建Person对象的函数式接口
 */
@FunctionalInterface
public interface PersonBulider {
    //定义一个方法，根据传递的姓名，创建Person对象返回
    Person buliderPerson(String name);
}
