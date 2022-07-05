package cn.c1;
/*
        ==是进行对象的地址值比较，如果确实需要字符串的内容比较，可以使用两个方法
        public boolean equals（object obj）参数可以是任何对象，只有参数是一个字符串并且内容相同的才会给 true：否则返回false。
        任何对象都能用object进行接收
        注意事项：
        1、任何对象都能用Object进行接收。
        2、equals方法具有对称性，a.equals(b)和b.equals(a)效果一样
        3、如果双方其中有一个常量，要把常量写前面避免空指针异常
        public boolean equalsIgnoreCase(String str):忽略大小写，进行内容比较
*/
public class DemoStringEquals {
    public static void main(String[] args) {
        String str1="Hello";
        String str2="Hello";
        char[] charArray={'H','e','l','l','o'};
        String str3=new String(charArray);
        System.out.println(str1.equals(str2));
        System.out.println(str1.equals(str3));
        System.out.println(str3.equals("Hello"));
        System.out.println("Hello".equals(str1));
        String str4="hello";
        System.out.println(str1.equals(str4));
        System.out.println("=============");
        String str5=null;
        System.out.println("abc".equals(str5));//推荐
//        System.out.println(str5.equals("abc"));//不推荐：空指针异常
        System.out.println("====================");
        String strA="java";
        String strB="Java";
        System.out.println(strA.equals(strB));
        System.out.println(strA.equalsIgnoreCase(strB));
    }
}
