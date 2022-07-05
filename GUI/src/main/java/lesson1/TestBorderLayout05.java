package lesson1;

import java.awt.*;

public class TestBorderLayout05 {
    public static void main(String[] args) {
        Frame frame = new Frame("BorderLayout");
        Button east = new Button("east");
        Button west = new Button("west");
        Button north = new Button("north");
        Button south = new Button("south");
        Button center = new Button("center");
        frame.add(east, BorderLayout.EAST);
        frame.add(west, BorderLayout.WEST);
        frame.add(north, BorderLayout.NORTH);
        frame.add(south, BorderLayout.SOUTH);
        frame.add(center, BorderLayout.CENTER);
        frame.setSize(200, 200);
        frame.setVisible(true);
    }
}
