package xml.jsoup;

import cn.wanghaomiao.xpath.exception.XpathSyntaxErrorException;
import cn.wanghaomiao.xpath.model.JXDocument;
import cn.wanghaomiao.xpath.model.JXNode;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

import java.io.File;
import java.io.IOException;
import java.util.List;

/*
Xpath查询
 */
public class JsoupDemo06 {
    public static void main(String[] args) throws IOException, XpathSyntaxErrorException {
        //获取document对象,根据xml文件获取
        String path = JsoupDemo06.class.getClassLoader().getResource("student.xml").getPath();
        Document document = Jsoup.parse(new File(path), "utf-8");
        //根据document对象，创建JXDocument对象
        JXDocument jxDocument = new JXDocument(document);
        //结合xpath语法查询
        //查询所有student标签
        List<JXNode> jxNodes = jxDocument.selN("//student");
        for (JXNode jxNode : jxNodes) {
            System.out.println(jxNode);
        }
        System.out.println("----------------------");
        //查询所有student标签下的name标签
        List<JXNode> jxNodes2 = jxDocument.selN("//student/name");
        for (JXNode jxNode2 : jxNodes2) {
            System.out.println(jxNode2);
        }
        System.out.println("----------------------");
        //查询student标签下带有id属性的name标签
        List<JXNode> jxNodes3 = jxDocument.selN("//student/name[@id]");
        for (JXNode jxNode3 : jxNodes3) {
            System.out.println(jxNode3);
        }
        System.out.println("----------------------");
        //查询student标签下带有id属性的name标签,并且属性值为张伟是nt
        List<JXNode> jxNodes4 = jxDocument.selN("//student/name[@id='hhhh']");
        for (JXNode jxNode4 : jxNodes4) {
            System.out.println(jxNode4);
        }

    }
}