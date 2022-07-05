package lesson1;

import java.awt.*;

public class TestFlowLayout04 {
    public static void main(String[] args) {
        Frame frame = new Frame("FlowLayout");
        //组件 按钮
        Button button1 = new Button("button1");
        Button button2 = new Button("button2");
        Button button3 = new Button("button3");
        //设置流式布局
        frame.setLayout(new FlowLayout(FlowLayout.LEFT));
        frame.setLayout(new FlowLayout(FlowLayout.RIGHT));
        frame.setLayout(new FlowLayout(FlowLayout.CENTER));
        frame.setSize(200, 200);
        frame.setVisible(true);
        frame.add(button1);
        frame.add(button2);
        frame.add(button3);
    }
}
