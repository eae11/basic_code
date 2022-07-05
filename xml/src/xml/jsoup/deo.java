package xml.jsoup;

import org.w3c.dom.Document;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.File;
import java.io.IOException;

public class deo {
    public static void main(String[] args) {
        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        DocumentBuilder builder = null;
        Document document = null;
        try {
            builder = factory.newDocumentBuilder();
            String path = JsoupDemo01.class.getClassLoader().getResource("student.xml").getPath();
            document = builder.parse((new File(path)));
        } catch (ParserConfigurationException e) {
            e.printStackTrace();
        } catch (SAXException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println(document);
        NodeList list = document.getElementsByTagName("xing");
        String nodeValue = list.item(0).getFirstChild().getNodeValue();
        System.out.println(nodeValue);
//        /*for (int i = 0; i < list.getLength(); i++) {
//            Element e = (Element) list.item(i);
//            System.out.println(e.);
//        }*/
    }
}
