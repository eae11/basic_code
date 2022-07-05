package xml.jsoup;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.File;
import java.io.IOException;

/*
Jsoup快速入门
 */
public class JsoupDemo01 {
    public static void main(String[] args) throws IOException {
        //2获取document对象,根据xml文件获取
        //2.1获取student.xml的path
        String path = JsoupDemo01.class.getClassLoader().getResource("student.xml").getPath();
        //2.2解析xml文档
        Document document = Jsoup.parse(new File(path), "utf-8");
        //3.获取元素对象Element
        Elements elements = document.getElementsByTag("name");
        System.out.println(elements.size());
        //3.1获取第一个name的Element对象
        Element element1 = elements.get(0);
        String name1 = element1.text();
        System.out.println(name1);

    }
}