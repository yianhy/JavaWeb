package com.atguigu.pojo;

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;
import org.junit.Test;

/**
 * @author yian
 * @date 2023/4/28 22:40
 * Description:
 */
public class Dom4jTest {
    @Test
    public void text() throws DocumentException {
        SAXReader saxReader = new SAXReader();
        Document document = saxReader.read("src/books.xml");
        System.out.println(document);
    }

    @Test
    public void text2() throws DocumentException {
        SAXReader saxReader = new SAXReader();
        Document document = saxReader.read("src/books.xml");
        Element rootElement = document.getRootElement();
//        System.out.println(rootElement);

    }
}
