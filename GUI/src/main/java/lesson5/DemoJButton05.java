package lesson5;

import javax.swing.*;
import java.awt.*;
import java.net.URL;

public class DemoJButton05 extends JFrame {
    public DemoJButton05() {
        Container container = this.getContentPane();
        //将一个图片变为图标
        URL resource = DemoJButton05.class.getResource("9.jpg");
        String path = resource.getPath();
        ImageIcon imageIcon = new ImageIcon(path);

        //多选框
        JCheckBox jCheckBox1 = new JCheckBox("1");
        JCheckBox jCheckBox2 = new JCheckBox("2");
        container.add(jCheckBox1, BorderLayout.NORTH);
        container.add(jCheckBox2, BorderLayout.SOUTH);

        this.setVisible(true);
        this.setSize(500, 500);

    }

    public static void main(String[] args) {
        new DemoJButton05();
    }
}