package lesson2;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class TestActionEvent01 {
    public static void main(String[] args) {
        //按下按钮,触发一些事件
        Frame frame = new Frame();
        Button button = new Button();
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("aaa");
            }
        });
        frame.add(button, BorderLayout.CENTER);
        frame.pack();
        frame.setVisible(true);
        windowClose(frame);

    }

    private static void windowClose(Frame frame) {
        frame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
    }
}
