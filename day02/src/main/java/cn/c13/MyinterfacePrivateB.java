package cn.c13;

public interface MyinterfacePrivateB {
    static void methodStatic1() {
        System.out.println("默认方法1");
//        methodStaticCommon();
    }

    static void methodStatic2() {
        System.out.println("默认方法2");
//        methodStaticCommon();
    }

    //为上面两个方法服务的不能被其他实现类所访问
    /*private static void methodStaticCommon() {
        System.out.println("AAA");
        System.out.println("BBB");
        System.out.println("CCC");
    }*/
}
