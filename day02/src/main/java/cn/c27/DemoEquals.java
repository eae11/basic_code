package cn.c27;

public class DemoEquals {
    public static void main(String[] args) {
        Person one = new Person("高圆圆", 18);
        Person two = new Person("高圆圆", 18);
        boolean b = one.equals(two);
        System.out.println(b);
    }
}
