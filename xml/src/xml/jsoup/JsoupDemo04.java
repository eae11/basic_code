package xml.jsoup;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.File;
import java.io.IOException;

/*
Document/Element对象功能
 */
public class JsoupDemo04 {
    public static void main(String[] args) throws IOException {
        //2获取document对象,根据xml文件获取
        String path = JsoupDemo04.class.getClassLoader().getResource("student.xml").getPath();
        Document document = Jsoup.parse(new File(path), "utf-8");
        //通过document对象获取name标签,获取所有的name标签,可以获取到两个
        Elements elements = document.getElementsByTag("name");
        System.out.println(elements.size());
        //通过Element对象获取子标签对象
        Elements student = document.getElementsByTag("student");
        Element element_student = student.get(0);
        Elements ele_name = element_student.getElementsByTag("name");
        System.out.println(ele_name.size());
//        System.out.println(ele_name);

        //获取student对象的属性值
        String number = element_student.attr("number");
        System.out.println(number);
        //获取文本内容
        String text = ele_name.text();
        String html = ele_name.html();
        System.out.println(text);
        System.out.println(html);

    }
}