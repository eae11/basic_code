package lesson5;

import javax.swing.*;
import java.awt.*;
import java.net.URL;

public class DemoJButton03 extends JFrame {
    public DemoJButton03() {
        Container container = this.getContentPane();
        //将一个图片变为图标
        URL resource = DemoJButton03.class.getResource("9.jpg");
        String path = resource.getPath();
        ImageIcon imageIcon = new ImageIcon(path);
        //把这个图标放在按钮上
        JButton button = new JButton(imageIcon);
//        button.setIcon(imageIcon);
        button.setToolTipText("图片按钮");
//        button.setText("图片按钮");
        container.add(button);
        this.setVisible(true);
        this.setSize(500, 500);

    }

    public static void main(String[] args) {
        new DemoJButton03();
    }
}