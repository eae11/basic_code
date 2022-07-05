package lesson3;

import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.util.Iterator;

//鼠标监听事件
public class TestMouseListener02 {
    public static void main(String[] args) {
        new MyFrame("画图");
    }
}

//自己的类
class MyFrame extends Frame {
    ArrayList points;

    //画画需要画笔，需要监听鼠标当前的位置，需要集合来存储这个点
    public MyFrame(String title) {
        super(title);
        setBounds(200, 200, 400, 400);
        //存鼠标的点
        points = new ArrayList<>();
        //鼠标监听器，正对这个窗口
        this.addMouseListener(new MyMouseListener());
        setVisible(true);
    }

    @Override
    public void paint(Graphics g) {
        //画画，监听鼠标的事件
        Iterator iterator = points.iterator();
        while (iterator.hasNext()) {
            Point point = (Point) iterator.next();
            System.out.println(point);
            g.setColor(Color.black);
            g.fillOval(point.x, point.y, 10, 10);

        }
    }


    private class MyMouseListener extends MouseAdapter {

        @Override
        public void mousePressed(MouseEvent e) {
            MyFrame frame = (MyFrame) e.getSource();
            //这个我们点击的时候，就会在界面上产生一个点！
            //这个点就是鼠标的点;
            Point point = new Point(e.getX(), e.getY());
            //添加到集合了
            points.add(point);
            //每次点击鼠标都需要重新画一遍
            frame.repaint();//刷新
        }
    }
}