package lesson6;

import javax.swing.*;
import java.awt.*;

public class DemoCombobox01 extends JFrame {
    public DemoCombobox01() {
        Container container = this.getContentPane();
        JComboBox status = new JComboBox();

        status.addItem(null);
        status.addItem("正在热映");
        status.addItem("已下架");
        status.addItem("即将上映");

        container.add(status);
        setVisible(true);
        setSize(500, 500);
    }

    public static void main(String[] args) {
        new DemoCombobox01();
    }
}
