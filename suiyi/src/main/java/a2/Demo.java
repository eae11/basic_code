package a2;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Demo extends JFrame {
    private final JTextField jTextField1;

    public static void main(String[] args) {
        new Demo();
    }

    public Demo() {
        Container container = this.getContentPane();
        container.setLayout(new FlowLayout(FlowLayout.CENTER, 10, 10));
        JButton button = new JButton("验证");
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String text = jTextField1.getText();
                String pattern = "^\\d{0,4}-\\d{8}$";

                Pattern r = Pattern.compile(pattern);
                Matcher m = r.matcher(text);
                if (m.matches()) {
                    JDialog dialog = new JDialog();
                    JLabel jLabel = new JLabel("电话号码合格");
                    jLabel.setLayout(new BorderLayout());
                    Container container = dialog.getContentPane();
                    container.setLayout(new BorderLayout());
                    dialog.setBounds(750, 385, 200, 100);
                    dialog.add(jLabel);
                    dialog.setVisible(true);
                } else {
                    JDialog dialog = new JDialog();
                    JLabel jLabel = new JLabel("电话号码不合格");
                    jLabel.setLayout(new BorderLayout());
                    Container container = dialog.getContentPane();
                    container.setLayout(new BorderLayout());
                    dialog.setBounds(750, 385, 200, 100);
                    dialog.add(jLabel);
                    dialog.setVisible(true);
                }
            }
        });
        JLabel label1 = new JLabel("电话号码:");
        JLabel label2 = new JLabel("客户名称:");
        JLabel label3 = new JLabel("登录密码:");
        JLabel label4 = new JLabel("20181843周晏任");
        jTextField1 = new JTextField();
        JTextField jTextField2 = new JTextField();
        JPasswordField jPasswordField = new JPasswordField();
        setBounds(700, 300, 300, 270);
        jTextField1.setColumns(20);
        jTextField2.setColumns(20);
        jPasswordField.setColumns(20);

        container.add(label4);
        container.add(label1);
        container.add(jTextField1);
        container.add(label2);
        container.add(jTextField2);
        container.add(label3);
        container.add(jPasswordField);
        container.add(button);

        this.setResizable(false);
        this.setVisible(true);
    }
}
