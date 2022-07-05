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
public class JsoupDemo03 {
    public static void main(String[] args) throws IOException {
        //2获取document对象,根据xml文件获取
        String path = JsoupDemo03.class.getClassLoader().getResource("student.xml").getPath();
        Document document = Jsoup.parse(new File(path), "utf-8");
        //获取元素对象
        //获取所有student对象
        Elements student = document.getElementsByTag("student");
        System.out.println(student);
        System.out.println("--------------------------");
        //获取属性名为id的元素对象们
        Elements ids = document.getElementsByAttribute("id");
        System.out.println(ids);
        System.out.println("--------------------------");
        //获取属性值为张伟是nt的元素对象
        Elements elementsByAttributeValue = document.getElementsByAttributeValue("number", "张伟是nt");
        System.out.println(elementsByAttributeValue);
        System.out.println("--------------------------");
        //获取属性名为id的元素对象
        Element id = document.getElementById("hhhh");
        System.out.println(id);


    }
}