package lesson1;


import java.awt.*;

public class TestFrame02 {
    public static void main(String[] args) {
        MyFrame myFrame1 = new MyFrame(100, 100, 200, 200, Color.black);
        MyFrame myFrame2 = new MyFrame(100, 100, 200, 200, Color.black);
        MyFrame myFrame3 = new MyFrame(100, 100, 200, 200, Color.black);
        MyFrame myFrame4 = new MyFrame(100, 100, 200, 200, Color.black);
    }

}

class MyFrame extends Frame {
    static int id = 0;//可能存在多个窗口，我们需要一个计数器

    public MyFrame(int x, int y, int w, int h, Color color) {
        super("我的第一个java图形" + (++id));
        setResizable(false);
        setVisible(true);
        setBounds(x, y, w, h);
        setBackground(color);
    }
}
