package lesson4;

import javax.swing.*;

public class DemoJFrame01 {
    //初始化
    public void init() {
        //顶级窗口
        JFrame jFrame = new JFrame("这是一个JFrame窗口");
        jFrame.setVisible(true);
        jFrame.setBounds(100, 100, 200, 200);
        //设置文字Jlabel
        JLabel jLabel = new JLabel("哈哈哈");
        jFrame.add(jLabel);
        jLabel.setHorizontalAlignment(SwingConstants.CENTER);
//        Container contentPane = jFrame.getContentPane();
//        contentPane.setBackground(Color.YELLOW);

        //关闭事件
        jFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);


    }

    public static void main(String[] args) {
        //建立一个窗口
        new DemoJFrame01().init();
    }
}
