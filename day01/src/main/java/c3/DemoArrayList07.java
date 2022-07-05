package c3;

import java.util.ArrayList;

public class DemoArrayList07 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("高圆圆");
        list.add("张馨予");
        list.add("李小璐");
        list.add("迪丽热巴");
        printArrayList(list);
    }

    public static void printArrayList(ArrayList<String> list) {
        System.out.print("{");
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i));
            if (i == list.size() - 1) {
                System.out.print("}");
            } else {
                System.out.print("@");
            }
        }
    }
}
