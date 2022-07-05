package xml.jsoup;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

import java.io.IOException;
import java.net.URL;

/*
Jsoup对象功能
 */
public class JsoupDemo02 {
    public static void main(String[] args) throws IOException {
        //2获取document对象,根据xml文件获取
        //2.1获取student.xml的path
        String path = JsoupDemo02.class.getClassLoader().getResource("student.xml").getPath();
        //2.2解析xml文档
//        Document document = Jsoup.parse(new File(path), "utf-8");
//        System.out.println(document);
        //解析文档
//        String str = "<!--?xml version=\"1.0\" encoding=\"UTF-8\" ?-->\n" +
//                "<!--<!DOCTYPE students SYSTEM \"student.dtd\">-->\n" +
//                "<!--<!DOCTYPE students [<!ELEMENT students (student*) >-->\n" +
//                "<!--        <!ELEMENT student (name,age,sex)>-->\n" +
//                "<!--        <!ELEMENT name (#PCDATA)>-->\n" +
//                "<!--        <!ELEMENT age (#PCDATA)>-->\n" +
//                "<!--        <!ELEMENT sex (#PCDATA)>-->\n" +
//                "<!--        <!ATTLIST student number ID #REQUIRED>]>-->\n" +
//                "<html>\n" +
//                " <head></head>\n" +
//                " <body>\n" +
//                "  <students> \n" +
//                "   <student number=\"s001\"> \n" +
//                "    <name>\n" +
//                "     zhagnsan\n" +
//                "    </name> \n" +
//                "    <age>\n" +
//                "     11\n" +
//                "    </age> \n" +
//                "    <sex>\n" +
//                "     male\n" +
//                "    </sex> \n" +
//                "   </student> \n" +
//                "   <student number=\"s002\"> \n" +
//                "    <name>\n" +
//                "     lisi\n" +
//                "    </name> \n" +
//                "    <age>\n" +
//                "     13\n" +
//                "    </age> \n" +
//                "    <sex>\n" +
//                "     male\n" +
//                "    </sex> \n" +
//                "   </student> \n" +
//                "  </students>\n" +
//                " </body>\n" +
//                "</html>";
//        Document document1 = Jsoup.parse(str);
        //3.parse​(URL url, int timeoutMillis)：通过网络路径获取指定的html或xml的文档对象
        URL url = new URL("https://baike.baidu.com/item/jsoup/9012509?fr=aladdin");
        Document document = Jsoup.parse(url, 10000);
        System.out.println(document);
    }
}