package dn.d45;

/*
通过this引用本类的成员方法
 */
public class Husband {
    //定义一个买房子的方法
    public void buyHouse() {
        System.out.println("哈哈哈哈");
    }

    //定义一个结婚的方法,参数传递RichabLe接口
    public void marry(Richable r) {
        r.buy();
    }

    //定义一个非常高兴的方法
    public void soHappy() {
        //调用结婚的方法,方法的参数Richable是一个函|数式接口,传递Lambda表达式
//        marry(() -> {
//            //使用this.成员方法，调用本来买房子的方法
//            this.buyHouse();
//        });
        marry(this::buyHouse);
    }

    public static void main(String[] args) {
        new Husband().soHappy();
    }
}
