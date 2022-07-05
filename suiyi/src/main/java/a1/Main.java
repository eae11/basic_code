package a1;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main extends JFrame {
    private static JTextField num;
    private static JTextField admin;
    private static JPasswordField password;
    private static JButton exit;
    private static JButton login;
    private static JLabel background;

    private JButton success;
    private JButton fail;
    static JFrame f = new JFrame("电话");
    Container c = f.getContentPane(), c2 = f.getLayeredPane();
    Font font = new Font("幼圆", Font.PLAIN, 15);


    public Main() {
        f.setResizable(false);
        f.setLayout(null);
        f.setSize(450, 400);
        f.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        f.setLocationRelativeTo(null);

        JLabel phone = new JLabel("电话号码:");
        phone.setBounds(75, 30, 100, 50);
        phone.setFont(font);
        phone.setForeground(new Color(102, 204, 255));


        num = new JTextField("123456789");
        num.setBounds(185, 45, 200, 20);
        num.setHorizontalAlignment(JTextField.CENTER);
        num.setFont(font);

        JLabel name = new JLabel("用户名:");
        name.setBounds(75, 90, 100, 50);
        name.setFont(font);
        name.setForeground(new Color(102, 204, 255));

        admin = new JTextField("舒星扬");
        admin.setBounds(185, 100, 200, 20);
        admin.setHorizontalAlignment(JTextField.CENTER);
        admin.setFont(font);

        JLabel pwd = new JLabel("密码:");
        pwd.setBounds(75, 165, 75, 20);
        pwd.setFont(font);
        pwd.setForeground(new Color(102, 204, 255));

        password = new JPasswordField("123");
        password.setBounds(185, 165, 200, 20);
        password.setHorizontalAlignment(JTextField.CENTER);
        password.setEchoChar('☆');


        login = new JButton("登陆");
        login.setBounds(110, 260, 100, 50);
        login.setFont(font);

        exit = new JButton("退出");
        exit.setBounds(270, 260, 100, 50);
        exit.setFont(font);

        background = new JLabel();
        ImageIcon icon = new ImageIcon("src/img/天依.jpeg");
        icon.setImage(icon.getImage().getScaledInstance(600, 400, Image.SCALE_DEFAULT));
        background.setIcon(icon);
        background.setBounds(-40, 0, icon.getIconWidth(), icon.getIconHeight());
        c2.add(background, new Integer(Integer.MIN_VALUE));

        c.add(phone);
        c.add(admin);
        c.add(password);

        c.add(num);
        c.add(name);
        c.add(pwd);
        c.add(login);
        c.add(exit);
        c.add(background);

        f.setVisible(true);

        login.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                Main ex = new Main();
                String number = num.getText();
                System.out.println(number);

                if (number == "123") {
                    ex.success("登陆成功");
                } else {
                    ex.fail("电话号码错误");
                }
            }
        });

        exit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });

    }

    public void success(String str) {
        success = new JButton(str);
        success.setFont(font);
        success.setForeground(Color.BLUE);
        c.add(success);
        f.setVisible(true);

        success.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                f.dispose();
            }
        });
    }

    public void fail(String str) {
        fail = new JButton(str);
        fail.setFont(font);
        fail.setForeground(Color.RED);
        c.add(fail);
        f.setVisible(true);

        fail.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                f.dispose();
            }
        });
    }

    public void login(String str) {
        success = new JButton(str);
        success.setFont(font);
        success.setForeground(Color.BLUE);
        c.add(success);
        f.setVisible(true);

        success.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                f.dispose();
//                Login.f.dispose();
            }
        });
    }

    public static void main(String[] args) {
        Main l = new Main();
    }

}