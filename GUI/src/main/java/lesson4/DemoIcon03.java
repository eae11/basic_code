package lesson4;

import javax.swing.*;
import java.awt.*;

//图标,需要实现类,Frame继承
public class DemoIcon03 extends JFrame implements Icon {
    private int width;
    private int height;

    public DemoIcon03() {//无参构造

    }

    public DemoIcon03(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public void init() {
        DemoIcon03 icon = new DemoIcon03(15, 15);
        //图标放在标签，也可以放在按钮上！
        JLabel jLabel = new JLabel("HHHdadjaj", icon, SwingConstants.CENTER);
        Container container = this.getContentPane();
        container.add(jLabel);
        this.setVisible(true);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new DemoIcon03().init();
    }

    @Override
    public void paintIcon(Component c, Graphics g, int x, int y) {
        g.fillOval(x, y, width, height);
    }

    @Override
    public int getIconWidth() {
        return this.width;
    }

    @Override
    public int getIconHeight() {
        return this.height;
    }
}
