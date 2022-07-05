package cn.c32;

/*
    自动装箱与自动拆箱：基本类型的数据和包装类之间可以自动的相互转换
    JDK1.5之后出现的新特性
 */
public class Demo02Integer {
    public static void main(String[] args) {
        /*
        自动装箱:直接把int类型的整数赋值包装类
        相当于Integer in= new Integer(1);
         */
        Integer in = 1;
        /*
        自动拆箱:in是包装类，无法直接参与运算，可以自动的转换为基本数据类型，在进行计算
        in+2:就相当于in.intValue+2=3
         */
        in = in + 2;
    }
}
