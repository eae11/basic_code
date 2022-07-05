package lesson6;

import javax.swing.*;
import java.awt.*;

public class DemoPassword04 extends JFrame {
    public DemoPassword04() {
        Container container = this.getContentPane();

        JPasswordField jPasswordField = new JPasswordField();//****
        jPasswordField.setEchoChar('*');

        container.add(jPasswordField);

        setVisible(true);
        setSize(500, 500);
    }

    public static void main(String[] args) {
        new DemoPassword04();
    }
}
