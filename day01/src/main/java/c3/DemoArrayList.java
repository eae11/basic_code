package c3;

import java.util.ArrayList;

/*
 * 数组的长度不可以发生改变。
 * 但是ArrayList集合的长度可以随意变化
 * 对于ArrayList来说，有一个尖括号<E>代表泛型
 * 泛型:也就是装在集合当中的所有元素,全部都是统一的类型
 * 注意:泛型只能是引用类型
 * 注意事项：对于ArrayList集合来说,直接打印得到的不是地址值，而是内容。
 * 如果内容是空,得到的是空括号:[]
 */
public class DemoArrayList {
    public static void main(String[] args) {
        //创建了一个ArrayList集合，集合的名称是List，里面装的全都是String字符串类型的数据
        ArrayList<String> list=new ArrayList<>();
        System.out.println(list);
        list.add("赵丽颖");
        list.add("迪丽热巴");
        list.add("古力娜扎");
        list.add("马尔扎哈");
        System.out.println(list);
    }
}
