package lesson5;

import javax.swing.*;
import java.awt.*;

public class DemoJScrolll02 extends JFrame {
    public DemoJScrolll02() {
        Container container = this.getContentPane();
        //文本域
        JTextArea textArea = new JTextArea(20, 50);
        textArea.setText("欢迎学习狂神说java");

        //Scroll面板
        JScrollPane jScrollPane = new JScrollPane(textArea);
        container.add(jScrollPane);
        this.setVisible(true);
        this.setSize(500, 500);
//        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new DemoJScrolll02();
    }
}
