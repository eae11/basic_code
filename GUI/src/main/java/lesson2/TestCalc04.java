package lesson2;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

//简易计算器
public class TestCalc04 {
    public static void main(String[] args) {
        new Calculator().loadFrame();
    }
}

//计算器类
class Calculator extends Frame {
    //属性
    TextField num1, num2, num3;

    //方法
    public void loadFrame() {
        //3个文本框
        num1 = new TextField(10);//字符数
        num2 = new TextField(10);
        num3 = new TextField(20);
        //1个按钮
        Button button = new Button("=");
        button.addActionListener(new MyCalculatorListener());
        //1个标签
        Label label = new Label("+");

        setLayout(new FlowLayout());
        add(num1);
        add(label);
        add(num2);
        add(button);
        add(num3);
        pack();
        setVisible(true);
    }

    //监听器类
    //内部类的最大好处,就是可以畅通无阻的访问外部的属性和方法!
    private class MyCalculatorListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
//        //获得加数和被加数
//        int n1 = Integer.parseInt(num1.getText());
//        int n2 = Integer.parseInt(num2.getText());
//        //讲这个值+法运算后，放到第三个框
//        int n3 = n1 + n2;
//        String s = String.valueOf(n3);
//        num3.setText(s);
//        //清除两个框
//        num1.setText("");
//        num2.setText("");
            int n1 = Integer.parseInt(num1.getText());
            int n2 = Integer.parseInt(num2.getText());
            int n3 = n1 + n2;
            num3.setText("" + n3);
            num1.setText("");
            num2.setText("");
        }
    }
}



