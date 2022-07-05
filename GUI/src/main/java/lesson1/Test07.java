package lesson1;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Test07 {
    public static void main(String[] args) {
        Frame frame = new Frame();
        frame.setVisible(true);
        frame.setSize(500, 500);
        frame.setLayout(new GridLayout(2, 1));
        frame.setBackground(new Color(0x98243B));

        Panel panel1 = new Panel(new BorderLayout());
        Panel panel2 = new Panel(new GridLayout(2, 1));
        Panel panel3 = new Panel(new BorderLayout());
        Panel panel4 = new Panel(new GridLayout(2, 2));

        Button button1 = new Button("button1");
        Button button2 = new Button("button2");
        Button button3 = new Button("button3");
        Button button4 = new Button("button4");
        Button button5 = new Button("button5");
        Button button6 = new Button("button6");
        Button button7 = new Button("button7");
        Button button8 = new Button("button8");
        Button button9 = new Button("button9");
        Button button10 = new Button("button10");


        panel1.setBackground(new Color(70, 125, 42));
        panel2.setBackground(new Color(70, 125, 42));
        panel3.setBackground(new Color(70, 125, 42));
        panel4.setBackground(new Color(70, 125, 42));


        frame.add(panel1);
        frame.add(panel3);


        panel1.add(button1, BorderLayout.WEST);
        panel1.add(button4, BorderLayout.EAST);
        panel1.add(panel2, BorderLayout.CENTER);
        panel2.add(button2);
        panel2.add(button3);
        panel3.add(button5, BorderLayout.WEST);
        panel3.add(button10, BorderLayout.EAST);
        panel3.add(panel4, BorderLayout.CENTER);

        panel4.add(button6);
        panel4.add(button7);
        panel4.add(button8);
        panel4.add(button9);
        frame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
    }
}
