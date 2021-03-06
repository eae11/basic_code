package dn.d17;

/*
如果finally有return语句,永远返回finally中的结果,避免该情况。
 */
public class Demo09Exception {
    public static void main(String[] args) {
        int a = getA();
        System.out.println(a);
    }

    //定义一个方法,返回变量o的值
    private static int getA() {
        int a = 10;
        try {
            return a;
        } catch (Exception e) {
            System.out.println(e);
        } finally {
            a = 100;
            return a;
        }
    }
}
