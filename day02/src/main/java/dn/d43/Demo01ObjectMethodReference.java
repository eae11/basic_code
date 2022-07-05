package dn.d43;

/*
通过对象名引用成员方法
使用前提是对象名是已经存在的,成员方法也是已经存在
就可以使用对象名来引用成员方法

 */
public class Demo01ObjectMethodReference {
    //定义一个方法,方法的参数传递Printable接口
    public static void printString(Printable p) {
        p.print("hello");
    }

    public static void main(String[] args) {
        //调用printstring方法，方法的参数Printable是一个函数式接口,所以可以传递Lambda表达式
        printString((s) -> {
            //创建MethodRerobject对象
            MethodRerObject obj = new MethodRerObject();
            //调用MethodRerobject对象中的成员方法printupperCaseString,把字符串按照大写输出
            obj.printUpperCaseString(s);
        });
        /*使用方法引用来优化lambda
        对象是已经存在的MethodRerObject
        成员方法也是已经存在的printUppercasestring
         所以我们可以使用对象名引用成员方法*/

        //创建MethodRerobject对象
        printString(new MethodRerObject()::printUpperCaseString);
    }
}
