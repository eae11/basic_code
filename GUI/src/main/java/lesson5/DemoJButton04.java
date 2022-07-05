package lesson5;

import javax.swing.*;
import java.awt.*;

public class DemoJButton04 extends JFrame {
    public DemoJButton04() {
        Container container = this.getContentPane();
        //单选按钮
        JRadioButton radioButton1 = new JRadioButton("1");
        JRadioButton radioButton2 = new JRadioButton("2");
        JRadioButton radioButton3 = new JRadioButton("3");

        //由于单选按钮只能选择一个,分组
        ButtonGroup buttonGroup = new ButtonGroup();
        buttonGroup.add(radioButton1);
        buttonGroup.add(radioButton2);
        buttonGroup.add(radioButton3);

        container.add(radioButton1, BorderLayout.CENTER);
        container.add(radioButton2, BorderLayout.NORTH);
        container.add(radioButton3, BorderLayout.SOUTH);

        this.setVisible(true);
        this.setSize(500, 500);

    }

    public static void main(String[] args) {
        new DemoJButton04();
    }
}

