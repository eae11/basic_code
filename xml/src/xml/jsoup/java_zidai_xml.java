package xml.jsoup;

import org.w3c.dom.Document;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.*;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

/*

 */
public class java_zidai_xml {
    public static void main(String[] args) throws IOException {
        //获取document对象,根据xml文件获取
        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        DocumentBuilder builder = null;
        Document document = null;
        TransformerFactory tf = TransformerFactory.newInstance();
        Transformer t = null;
        try {
            builder = factory.newDocumentBuilder();
            String path = java_zidai_xml.class.getClassLoader().getResource("student.xml").getPath();
            document = builder.parse((new File(path)));
            t = tf.newTransformer();
        } catch (TransformerConfigurationException e) {
            e.printStackTrace();
        } catch (ParserConfigurationException e) {
            e.printStackTrace();
        } catch (SAXException e) {
            e.printStackTrace();
        }
        t.setOutputProperty(OutputKeys.ENCODING, "utf-8");
        DOMSource source = new DOMSource(document);

        StreamResult result = new StreamResult(new FileOutputStream("D:\\2.xml"));
        try {
            t.transform(source, result);
        } catch (TransformerException e) {
            e.printStackTrace();
        }
    }
}