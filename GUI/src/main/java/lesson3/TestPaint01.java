package lesson3;

import java.awt.*;

public class TestPaint01 {
    public static void main(String[] args) {
        new MyPaint().loadFrame();
    }
}

class MyPaint extends Frame {
    public void loadFrame() {
        setBounds(200, 200, 500, 500);
        setVisible(true);
    }

    //画笔
    @Override
    public void paint(Graphics g) {
        //画笔,需要有颜色,画笔可以画画
        g.setColor(new Color(255, 0, 0));
        g.drawOval(100, 100, 100, 100);
        g.fillOval(100, 100, 100, 100);//实心的圆
        g.setColor(new Color(0, 255, 0));
        g.fillRect(150, 200, 200, 200);
//        repaint();
        //画笔用完，将他还原到最初的颜色
    }
}
