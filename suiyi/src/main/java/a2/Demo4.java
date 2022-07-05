package a2;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Demo4 extends JFrame {
    private final JTextField jTextField1;
    private final JTextField jTextField2;
    private final JTextField jTextField3;

    public static void check(int a, int b, int c) {
        int xing = 0;// 标识这是个什么三角形，1 ：直角三角形 2：钝角三角形 3：锐角三角形
        JDialog dialog = new JDialog();
        Container container = dialog.getContentPane();
        container.setLayout(new BorderLayout());
        dialog.setBounds(750, 385, 200, 100);
        dialog.setVisible(true);
        if (a >= b && a >= c) {
            // 如果任意一条边的平方等于其他两边的平方之和 为直角三角形
            // 大于 为 钝角三角形
            // 否则 为锐角三角形
            if ((a * a) == (b * b + c * c)) {
                xing = 1;
            } else if ((a * a) > (b * b + c * c)) {
                xing = 2;
            } else {
                xing = 3;
            }
        } else if (b >= a && b >= c) {
            if ((b * b) == (a * a + c * c)) {
                xing = 1;
            } else if ((b * b) > (a * a + c * c)) {
                xing = 2;
            } else {
                xing = 3;
            }
        } else if (c >= a && c >= b) {
            if ((c * c) == (b * b + a * a)) {
                xing = 1;
            } else if ((c * c) > (b * b + a * a)) {
                xing = 2;
            } else {
                xing = 3;
            }
        }
        switch (xing) {
            case 1:
                JLabel jLabel1 = new JLabel("这是一个直角三角形");
                jLabel1.setLayout(new BorderLayout());
                dialog.add(jLabel1);
                break;
            case 2:
                JLabel jLabel2 = new JLabel("这是一个钝角三角形");
                jLabel2.setLayout(new BorderLayout());
                dialog.add(jLabel2);
                break;
            case 3:
                JLabel jLabel3 = new JLabel("这是个锐角三角形");
                jLabel3.setLayout(new BorderLayout());
                dialog.add(jLabel3);
        }
    }


    public static void main(String[] args) {
        new Demo4();
    }

    public Demo4() {
        this.setLayout(null);
        JButton button1 = new JButton("验证");
        JButton button2 = new JButton("清空");
        JButton button3 = new JButton("退出");
        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                String text1 = jTextField1.getText();
                String text2 = jTextField2.getText();
                String text3 = jTextField3.getText();
                String pattern = "^\\d{0,9}$";
                Pattern r = Pattern.compile(pattern);
                Matcher matcher1 = r.matcher(text1);
                Matcher matcher2 = r.matcher(text2);
                Matcher matcher3 = r.matcher(text3);
                if (matcher1.matches() && matcher2.matches() && matcher3.matches()) {
                    int a = Integer.parseInt(text1);
                    int b = Integer.parseInt(text2);
                    int c = Integer.parseInt(text3);
                    check(a, b, c);
                } else {
                    JDialog dialog = new JDialog();
                    JLabel jLabel1 = new JLabel("输入数据不合法");
                    jLabel1.setLayout(new BorderLayout());
                    Container container = dialog.getContentPane();
                    container.setLayout(new BorderLayout());
                    dialog.setBounds(750, 385, 200, 100);
                    dialog.add(jLabel1);
                    dialog.setVisible(true);
                }
            }
        });

        JLabel label1 = new JLabel("边长a");
        JLabel label2 = new JLabel("边长b");
        JLabel label3 = new JLabel("边长c");
        JLabel label4 = new JLabel("20181843周晏任");
        JLabel label5 = new JLabel("规则说明:1.a,b,c均大于02.a+b>c,b+c>a,c+a>b");
        jTextField1 = new JTextField();
        jTextField2 = new JTextField();
        jTextField3 = new JTextField();
        label5.setBounds(200, 50, 300, 100);
        label4.setBounds(150, 10, 100, 40);
        label1.setBounds(10, 50, 50, 30);
        label2.setBounds(10, 90, 50, 30);
        label3.setBounds(10, 130, 50, 30);
        jTextField1.setBounds(50, 50, 100, 30);
        jTextField2.setBounds(50, 90, 100, 30);
        jTextField3.setBounds(50, 130, 100, 30);
        button1.setBounds(20, 200, 60, 30);
        button2.setBounds(120, 200, 60, 30);
        button3.setBounds(220, 200, 60, 30);
        setBounds(700, 300, 500, 300);
        jTextField1.setColumns(20);
        jTextField2.setColumns(20);
        jTextField3.setColumns(20);
        this.add(label4);
        this.add(label1);
        this.add(label2);
        this.add(label3);
        this.add(label5);
        this.add(jTextField1);
        this.add(jTextField2);
        this.add(jTextField3);
        this.add(button1);
        this.add(button2);
        this.add(button3);
        this.setResizable(true);
        this.setVisible(true);
    }
}
