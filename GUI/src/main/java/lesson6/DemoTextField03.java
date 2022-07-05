package lesson6;

import javax.swing.*;
import java.awt.*;

public class DemoTextField03 extends JFrame {
    public DemoTextField03() {
        Container container = this.getContentPane();

        JTextField jTextField1 = new JTextField("hello");
        JTextField jTextField2 = new JTextField("world", 20);


        container.add(jTextField1, BorderLayout.NORTH);
        container.add(jTextField2, BorderLayout.SOUTH);

        setVisible(true);
        setSize(500, 500);
    }

    public static void main(String[] args) {
        new DemoTextField03();
    }
}
