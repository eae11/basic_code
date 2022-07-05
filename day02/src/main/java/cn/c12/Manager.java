package cn.c12;

import java.util.ArrayList;

public class Manager extends User {
    public Manager() {

    }

    public Manager(String name, int money) {
        super(name, money);
    }

    public ArrayList<Integer> send(int totalMoney, int count) {
        //首先需要一个集合，用来存储若干个红包的金额
        ArrayList<Integer> redList = new ArrayList<>();
        //首先看一下群主自己有多少钱
        int leftmoney = super.getMoney();//群主当前的余额
        if (totalMoney > leftmoney) {
            System.out.println("余额不足");
            return redList;//返回空集合
        }
        //重新设置余额
        super.setMoney(leftmoney - totalMoney);
        //发红包需要平均分为count份
        int avg = totalMoney / count;
        int mod = totalMoney % count;//余数，也就是零头
        //零头放在最后一个红包当中
        //下面把红包一个一个放到集合当中
        for (int i = 0; i < count - 1; i++) {
            redList.add(avg);
        }
        //最后一个红包
        int last = avg + mod;
        redList.add(last);
        return redList;
    }
}
