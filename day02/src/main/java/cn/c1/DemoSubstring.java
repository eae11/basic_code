package cn.c1;

/*
public String substring（int index）：截取从参数位置一直到字符串末尾，返回新字符串。
public String substring（int begin，int end）：截取从begin开始，一直到end结束，中间的字符串。
备注：[begin,end)左闭右开
 */
public class DemoSubstring {
    public static void main(String[] args) {
        String str1 = "HelloWorld";
        String str2 = str1.substring(5);
        System.out.println(str2);
        String str3 = str1;
        System.out.println(str3);
    }
}
