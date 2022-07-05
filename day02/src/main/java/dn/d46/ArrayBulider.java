package dn.d46;

/*
    定义一个创建数组的函数式接口
 */
@FunctionalInterface
public interface ArrayBulider {
    //定义一个创建int类型数组的方法,参数传递数组的长度,返回创建好的int类型数组
    int[] buliderArray(int length);

}
