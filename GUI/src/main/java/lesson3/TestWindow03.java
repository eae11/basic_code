package lesson3;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class TestWindow03 {
    public static void main(String[] args) {
        new WindowFrame();
    }
}

class WindowFrame extends Frame {
    public WindowFrame() {
        setBackground(Color.blue);
        setBounds(100, 100, 200, 300);
        setVisible(true);
        addWindowListener(new WindowAdapter() {
            @Override
            public void windowOpened(WindowEvent e) {
                System.out.println("窗口打开");
            }

            @Override
            public void windowClosing(WindowEvent e) {
                System.out.println("窗口正在关");
            }

            @Override
            public void windowClosed(WindowEvent e) {
                System.out.println("窗口关掉了");
            }


            @Override
            public void windowActivated(WindowEvent e) {
                WindowFrame windowFrame = (WindowFrame) e.getSource();
                windowFrame.setTitle("被激活了");
                System.out.println("窗口激活了");
            }
        });
    }
}
