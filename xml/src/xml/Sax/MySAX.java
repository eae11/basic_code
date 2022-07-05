package xml.Sax;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

public class MySAX extends DefaultHandler {
    @Override
    public void startDocument() throws SAXException {
        System.out.print("<?xml version=\" 1.0 \" encoding=\"utf-8\"?>");
    }

    @Override
    public void endDocument() throws SAXException {
        System.out.println("文档读取结束。。。");
    }

    @Override
    public void startElement(java.lang.String uri, java.lang.String localName, java.lang.String qName, Attributes attributes) throws SAXException {
        System.out.print("<");
        System.out.print(qName);
        System.out.print(">");
        System.out.print(" ");
        if (attributes != null) {
            for (int i = 0; i < attributes.getLength(); i++) {
                System.out.print("" + attributes.getQName(i) + "=\"" + attributes.getValue(i) + "\"");
                System.out.print(">");
            }
        }

    }

    @Override
    public void endElement(java.lang.String uri, java.lang.String localName, java.lang.String qName) throws SAXException {
        System.out.print("</");
        System.out.print(qName);
        System.out.print(">");
    }

    @Override
    public void characters(char[] ch, int start, int length) throws SAXException {
    }
}


