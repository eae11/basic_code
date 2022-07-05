package a2;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Demo2 {

    public static void main(String[] args) {
        String str = "";
        String pattern = "\\d{4}-\\d{8}";

        Pattern r = Pattern.compile(pattern);
        Matcher m = r.matcher(str);
        if (m.matches()) {

        }
    }

}