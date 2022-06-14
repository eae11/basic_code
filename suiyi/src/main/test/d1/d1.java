package d1;

import org.junit.Test;

import java.util.Arrays;
import java.util.HashMap;
import java.util.TreeSet;
import java.util.stream.IntStream;

public class d1 {
    @Test
    public void m1() {
        //String a = "aaa";
        //switch (a) {
        //    case "aaa":
        //        break;
        //    case 1:
        //
        //}
    }

    @Test
    public void m2() {
        IntStream.iterate(1, n -> n + 1)
                .skip(Integer.parseInt("11"))
                .limit(Integer.parseInt("15"))
                .forEach(System.out::println);
    }

    @Test
    public void m3() {
        int a=0b1110;
        int b = 0b1010;
        System.out.println(a/b);
        float c=0b1110;
        float d = 0b1010;
        System.out.println(c/d);
    }

    @Test
    public void m4() {
        String text = "Na na na na na na na na Batman!";
        String[] s = text.split(" ");
        System.out.println(Arrays.toString(s));//[Na, na, na, na, na, na, na, na, Batman!]
    }
    @Test
    public void m5() {
        TreeSet treeSet = new TreeSet();
//        TreeSet treeSet = new TreeSet(new Comparator() {
//            @Override
//            public int compare(Object o1, Object o2) {
////                return ((String) o1).compareTo((String) o2);
//                return ((String) o1).length() - ((String) o2).length();
//            }
//        });
        new HashMap<>();
        treeSet.add("jack");
        treeSet.add("tom");
        treeSet.add("a");
        treeSet.add("abc");//长度一样不会填进去
        treeSet.add("b");
        System.out.println(treeSet);
    }
    @Test
    public void m6() {
        out:for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 6; j++) {
                if (i == 3) {
                    //break out;
                    //continue out;
                }
            }
        }
    }
}

