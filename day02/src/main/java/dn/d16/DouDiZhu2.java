package dn.d16;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

/*
斗地主综合案例:有序版本
1.准备牌
2.洗牌
3.发牌
4.排序
5.看牌

 */
public class DouDiZhu2 {
    public static void main(String[] args) {
        //1、准备牌，
        //创建一个Map集合，,存储牌的索引和组装好的牌
        HashMap<Integer, String> poker = new HashMap<>();
        //创建一个List集合,存储牌的索引
        ArrayList<Integer> pokerIndex = new ArrayList<>();
        //定义两个数组，,存储花色和牌的序号
        String[] nums = {"2", "A", "K", "Q", "J", "10", "9", "8", "7", "6", "5", "4", "3"};
        String[] colors = {"♠", "♥", "♣", "♦"};
        //定义一个牌的索引
        //把大王和小王存储到集合中
        int index = 0;
        poker.put(index, "大王");
        pokerIndex.add(index);
        index++;
        poker.put(index, "小王");
        pokerIndex.add(index);
        index++;
        //循环嵌套逾历两个数组,组装52张牌,存储到集合中
        for (String num : nums) {
            for (String color : colors) {
                poker.put(index, color + num);
                pokerIndex.add(index);
                index++;
            }
        }

//        System.out.println(poker);
//        System.out.println(pokerIndex);
        /*
        2.洗牌
        使用Collections中的方法shuffle(List)
         */
        Collections.shuffle(pokerIndex);
//        System.out.println(pokerIndex);
        /*
        3、发牌
         */
        //定义4个集合,存储玩家牌的索引,和底牌的索引
        ArrayList<Integer> player01 = new ArrayList<>();
        ArrayList<Integer> player02 = new ArrayList<>();
        ArrayList<Integer> player03 = new ArrayList<>();
        ArrayList<Integer> diPai = new ArrayList<>();
        //遍历存储牌索引的List集合,获取每一个牌的索引
        for (int i = 0; i < pokerIndex.size(); i++) {
            if (i >= 51) {
                diPai.add(pokerIndex.get(i));
            } else if (i % 3 == 0) {
                player01.add(pokerIndex.get(i));
            } else if (i % 3 == 1) {
                player02.add(pokerIndex.get(i));
            } else {
                player03.add(pokerIndex.get(i));
            }
        }
        /*
        4.排序
        使用Collections中的方法sort(List)
        默认是升序排序
         */
        Collections.sort(player01);
        Collections.sort(player02);
        Collections.sort(player03);
        Collections.sort(diPai);
        /*
        5.看牌
        调用看牌的方法
         */
        lookPoker("刘德华", poker, player01);
        lookPoker("周润发", poker, player02);
        lookPoker("周星驰", poker, player03);
        lookPoker("底牌", poker, diPai);

    }

    /*
    定义一个看牌的方法,提高代码的复用性
    参数:
    String nome:玩家名称
    HashMap<Integer, String> poker:存储牌的poker集合
    ArrayList<Integer> list:存储玩家和底牌的List集合
    查表法:
    遍历玩家或者底牌集合， ,获取牌的索引
    使用牌的索引，去Map集合中,找到对应的牌
    */
    private static void lookPoker(String name, HashMap<Integer, String> poker, ArrayList<Integer> list) {
        //输出玩家名称
        System.out.print(name + ":");
        //遍历玩家或者底牌集合，获取牌的索引
        for (Integer key : list) {
            String value = poker.get(key);
            System.out.print(value + " ");
        }
        System.out.println();//打印完每一个玩家的牌换行
    }
}
