package dn.d38;

import java.util.function.Consumer;

/*
练习:
字符串数组当中存有多条信息，请按照格式“姓名:XX。性别:Xx。”的格式将信息打印出来。
要求将打印姓名的动作作为第一个Consumer接口的Lambda实例，
将打印性别的动作作为第二个Consumer接口的Lambda实例，
将两个consumer接口按照顺序“拼接”到一起。

 */
public class Demo09ConsumerTest {
    //定义一个方法,参数传递string类型的数组和两个Consumer接口,泛型使用string
        public static void show(String[] arr, Consumer<String> con1, Consumer<String> con2) {
            for (String s : arr) {
                con1.andThen(con2).accept(s);
            }
    }

    public static void main(String[] args) {
        String[] arr = {"迪丽热巴,女", "古力娜扎,女", "马尔扎哈,男"};
        show(arr, (s) -> {
            String name = s.split(",")[0];
            System.out.print("姓名:" + name);
        }, (s) -> {
            String sex = s.split(",")[1];
            System.out.println("。性别:" + sex + "。");
        });
    }
}
