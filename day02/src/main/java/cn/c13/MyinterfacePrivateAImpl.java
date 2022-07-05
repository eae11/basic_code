package cn.c13;

public class MyinterfacePrivateAImpl implements MyinterfacePrivateA {
    public void methodAnother() {
        //直接访问到了接口当中的默认方法，这样是错误的
//            methodCommon();

    }
}
