package lesson1;

import java.awt.*;

//GUI的第一个界面
public class TestFrame01 {
    public static void main(String[] args) {
        Frame frame = new Frame("我的第一个java图形界面窗口");
        //需要设置可见性 wid height
        frame.setVisible(true);
        //设置窗口大小
        frame.setSize(400, 400);
        //设置颜色
        frame.setBackground(new Color(70, 125, 42));
        //弹出初始位置
        frame.setLocation(new Point(500, 500));
        //设置大小固定
        frame.setResizable(false);
    }
}
