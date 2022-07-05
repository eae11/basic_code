package xml.jsoup;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

import java.io.File;
import java.io.IOException;

/*
选择器查询
 */
public class JsoupDemo05 {
    public static void main(String[] args) throws IOException {
        //2获取document对象,根据xml文件获取
        String path = JsoupDemo05.class.getClassLoader().getResource("student.xml").getPath();
        Document document = Jsoup.parse(new File(path), "utf-8");
        //通过document对象获取name标签,获取所有的name标签,可以获取到两个
//        Element xing = document.getElementsByTag("xing").get(0);
//        System.out.println(xing);
        //查询name标签
        Elements elements = document.select("name");
        System.out.println(elements);
        System.out.println("-----------------------");
        //查询id值为llll的元素
        Elements elements1 = document.select("#llll");
        System.out.println(elements1);
        System.out.println("-----------------------");
        //获取student标签并且number属性为张伟是nt
        Elements elements2 = document.select("student[number='张伟是nt']");
        System.out.println(elements2);
        System.out.println("-----------------------");
        //获取student标签并且number属性为张伟是nt的age的子标签
        Elements elements3 = document.select("student[number='张伟是nt']>age");
        System.out.println(elements3);

    }
}