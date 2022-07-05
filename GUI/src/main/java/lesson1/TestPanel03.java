package lesson1;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class TestPanel03 {
    public static void main(String[] args) {
        Frame frame = new Frame();
        //布局的概念
        Panel panel = new Panel();
        //设置布局
        frame.setLayout(null);
        frame.setBounds(300, 300, 500, 500);
        frame.setBackground(new Color(70, 125, 42));
        //Panel设置坐标，相对于frame
        panel.setBounds(50, 50, 400, 400);
        panel.setBackground(new Color(222, 43, 81));
        //
        frame.add(panel);
        frame.setVisible(true);
        frame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
    }
}
