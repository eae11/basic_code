package lesson2;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TestText03 {
    public static void main(String[] args) {
        MyFrame myFrame = new MyFrame();

    }
}

class MyFrame extends Frame {
    public MyFrame() {
        TextField textField = new TextField();
        add(textField);
        //监听这个文本框输入的文字
        //按下enter 就会触发这个输入框的事件
        textField.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                TextField textField = (TextField) e.getSource();//获得一些资源
                System.out.println(textField.getText());
                textField.setText("");
            }
        });
        //设置替换编码
        textField.setEchoChar('*');
        setVisible(true);
        pack();
    }
}

