package cn.c12;

import java.util.ArrayList;

public class DemoRedPacket {
    public static void main(String[] args) {
        Manager manager = new Manager("群主", 100);
        Member one = new Member("成员A", 0);
        Member two = new Member("成员B", 0);
        Member three = new Member("成员C", 0);
        manager.show();
        one.show();
        two.show();
        three.show();
        System.out.println("===============");
        //群主发20块钱红包，分成3份
        ArrayList<Integer> redList = manager.send(20, 3);
        //三个人收红包
        one.receive(redList);
        two.receive(redList);
        three.receive(redList);
        manager.show();//100-20=80
        //6 6 8分给3个人
        one.show();
        two.show();
        three.show();
    }
}
