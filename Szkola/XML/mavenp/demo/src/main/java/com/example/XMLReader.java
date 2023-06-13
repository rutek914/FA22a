package com.example;

import java.io.File;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class XMLReader {
    public static void main(String[] args) {
        try {
            // stworz DocumentBuilder
            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
            DocumentBuilder builder = factory.newDocumentBuilder();

            // sczytaj XML-Datei
            Document document = builder.parse(new File("C:/Users/rutek/OneDrive/Pulpit/breakfast_menu.xml"));

            // dostan die Wurzel tego dokument
            Element root = document.getDocumentElement();

            // przerob dane des Kaufvertrags
            String kaeufer = getTextContent(root, "kaeufer");
            String verkaeufer = getTextContent(root, "verkaeufer");
            double betrag = Double.parseDouble(getTextContent(root, "betrag"));

            // pokaz przeczytane dane
            System.out.println("Käufer: " + kaeufer);
            System.out.println("Verkäufer: " + verkaeufer);
            System.out.println("Betrag: " + betrag);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // metoda pomocna zum Abrufen des Textinhalts eines Elements
    private static String getTextContent(Element element, String tagName) {
        NodeList nodeList = element.getElementsByTagName(tagName);
        if (nodeList != null && nodeList.getLength() > 0) {
            Node node = nodeList.item(0);
            if (node.getNodeType() == Node.ELEMENT_NODE) {
                Element subElement = (Element) node;
                return subElement.getTextContent();
            }
        }
        return "";
    }
}
