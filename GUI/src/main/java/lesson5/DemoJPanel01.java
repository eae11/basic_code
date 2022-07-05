package lesson5;

import javax.swing.*;
import java.awt.*;

public class DemoJPanel01 extends JFrame {
    public DemoJPanel01() {
        Container container = this.getContentPane();
        container.setLayout(new GridLayout(2, 1, 10, 10));//后面两个参数间距
        JPanel jPanel1 = new JPanel(new GridLayout(1, 3));
        jPanel1.add(new JButton("1"));
        jPanel1.add(new JButton("1"));
        jPanel1.add(new JButton("1"));
        container.add(jPanel1);
        this.setVisible(true);
        this.setSize(500, 500);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new DemoJPanel01();
    }
}
