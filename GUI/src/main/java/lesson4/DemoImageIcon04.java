package lesson4;

import javax.swing.*;
import java.awt.*;
import java.net.URL;

public class DemoImageIcon04 extends JFrame {
    public static void main(String[] args) {
        new DemoImageIcon04();
    }

    public DemoImageIcon04() {
        //获取图片的地址
        JLabel jLabel = new JLabel("ImageIcon");
        URL resource = DemoImageIcon04.class.getResource("12.jpg");
        ImageIcon imageIcon = new ImageIcon(resource);
        jLabel.setIcon(imageIcon);
        jLabel.setHorizontalAlignment(SwingConstants.CENTER);
        Container container = this.getContentPane();
        container.add(jLabel);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setBounds(500, 500, 500, 500);
        setVisible(true);

    }

}
