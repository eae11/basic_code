package a2;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class Demo5 extends JFrame {
    private final JTextField jTextField1;
    private final JTextField jTextField2;
    private final JTextField jTextField3;
    private final JTextField jTextField4;

    public static void main(String[] args) {
        new Demo5();
    }

    public Demo5() {
        this.setLayout(null);
        JLabel label1 = new JLabel("年");
        JLabel label2 = new JLabel("月");
        JLabel label3 = new JLabel("日");
        JLabel label4 = new JLabel("购买日期");
        JButton button1 = new JButton("提交");
        jTextField1 = new JTextField();
        jTextField2 = new JTextField();
        jTextField3 = new JTextField();
        jTextField4 = new JTextField();
        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String text1 = jTextField1.getText();
                String text2 = jTextField2.getText();
                String text3 = jTextField3.getText();
                String pattern = "^[1-9][0-9]*$";
                String pattern2 = "^((0?[1-9])|((1|2)[0-9])|30|31)$";
                Pattern r = Pattern.compile(pattern);
                Pattern r2 = Pattern.compile(pattern2);
                Matcher matcher1 = r.matcher(text2);
                Matcher matcher2 = r2.matcher(text3);
                if (matcher1.matches() && matcher2.matches()) {
                    int a = Integer.parseInt(text1);
                    int b = Integer.parseInt(text2);
                    int c = Integer.parseInt(text3);
                    jTextField4.setText("text1");

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

        label4.setBounds(10, 10, 100, 40);
        label1.setBounds(10, 50, 50, 30);
        label2.setBounds(10, 90, 50, 30);
        label3.setBounds(10, 130, 50, 30);
        jTextField1.setBounds(50, 50, 100, 30);
        jTextField2.setBounds(50, 90, 100, 30);
        jTextField3.setBounds(50, 130, 100, 30);
        jTextField4.setBounds(100, 200, 100, 50);
        button1.setBounds(20, 200, 60, 30);
        setBounds(700, 300, 500, 300);
        jTextField1.setColumns(20);
        jTextField2.setColumns(20);
        jTextField3.setColumns(20);
        jTextField4.setColumns(20);
        this.add(label4);
        this.add(label1);
        this.add(label2);
        this.add(label3);
        this.add(jTextField1);
        this.add(jTextField2);
        this.add(jTextField3);
        this.add(jTextField4);
        this.add(button1);
        this.setResizable(true);
        this.setVisible(true);
    }
}
