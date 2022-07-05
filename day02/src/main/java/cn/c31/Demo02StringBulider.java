package cn.c31;

/*
StringBuilder的常用方法：
     public   StringBuilder  append()添加任意类型数据的字符串形式，并返回当前对象本身。
 */
public class Demo02StringBulider {
    public static void main(String[] args) {
        StringBuilder s1 = new StringBuilder();
        //append方法返回的是this
//        StringBuilder s2 = s1.append("abc");//把s1的地址赋给了s2
//        System.out.println(s1);
//        System.out.println(s2);
//        System.out.println(s1 == s2);
        //使用append方法无需接收返回值
//        s1.append("abc");
//        s1.append(1);
//        s1.append(true);
//        s1.append(1.5);
//        s1.append('字');
//        System.out.println(s1);
        /*
        链式编程：方法返回值是一个对象，可以继续调用方法
         */
        System.out.println("abc".toUpperCase().toLowerCase().toUpperCase().toLowerCase());
        s1.append("abc").append(1).append(true).append(1.5).append("字");
        System.out.println(s1);
    }
}
