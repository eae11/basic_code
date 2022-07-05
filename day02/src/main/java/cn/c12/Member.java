package cn.c12;

import java.util.ArrayList;
import java.util.Random;

public class Member extends User {
    public Member() {
    }

    public Member(String name, int money) {
        super(name, money);
    }

    public void receive(ArrayList<Integer> list) {
        //从多个红包当中随便抽取一个，给自己。
        Random r = new Random();
        //随机获取一个集合当中的索引编号
        int index = r.nextInt(list.size());
        //根据索引，从集合当中删除并且得到被删除的红包给自己
        int hongBao = list.remove(index);
        //自己本来有多少钱
        int money = super.getMoney();
        //原本的钱加上红包的钱
        super.setMoney(hongBao + money);
    }
}
