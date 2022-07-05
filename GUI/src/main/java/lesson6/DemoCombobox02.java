package lesson6;

import javax.swing.*;
import java.awt.*;
import java.util.Vector;

public class DemoCombobox02 extends JFrame {
    public DemoCombobox02() {
        Container container = this.getContentPane();

        //生成列表的内容
//        String[] contents = {"1", "2", "3"};
        Vector contents = new Vector();
        //列表中需要放入内容
        JList jList = new JList(contents);

        contents.add("1");
        contents.add("2");
        contents.add("3");
        container.add(jList);

        setVisible(true);
        setSize(500, 500);
    }

    public static void main(String[] args) {
        new DemoCombobox02();
    }
}
