package Szkola.XML;

import java.io.File;
import java.io.FileWriter;

import javax.xml.XMLConstants;
import javax.xml.transform.stream.StreamSource;
import javax.xml.validation.Schema;
import javax.xml.validation.SchemaFactory;
import javax.xml.validation.Validator;

import org.xml.sax.SAXException;

public class XMLValidator {
    public static void main(String[] args) {
        String xsdPath = "C:/Users/rutek/OneDrive/Pulpit/Rheinmetall/szkola/LF05/Kaufvertrag.sxd";
        String xmlPath = "C:/Users/rutek/OneDrive/Pulpit/Rheinmetall/szkola/LF05/Kaufvertrag.xml";

        // Erstelle eine valide XML-Datei basierend auf der XSD-Datei
        createValidXML(xsdPath, xmlPath);

        // Überprüfe die Validität der XML-Datei
        if (validateXMLSchema(xsdPath, xmlPath)) {
            System.out.println("Die XML-Datei ist gültig.");
        } else {
            System.out.println("Die XML-Datei ist ungültig.");
        }
    }

    private static void createValidXML(String xsdPath, String xmlPath) {
        try {
            SchemaFactory factory = SchemaFactory.newInstance(XMLConstants.W3C_XML_SCHEMA_NS_URI);
            Schema schema = factory.newSchema(new File(xsdPath));
            Validator validator = schema.newValidator();

            // Erzeuge eine Beispiel-XML-Datei (hier als Platzhalter)
            String xmlContent = "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n" +
                    "<root>\n" +
                    "   <element>Value</element>\n" +
                    "</root>";

            // Speichere den XML-Inhalt in eine Datei
            FileWriter fileWriter = new FileWriter(xmlPath);
            fileWriter.write(xmlContent);
            fileWriter.close();

            // Überprüfe die XML-Datei auf Validität
            validator.validate(new StreamSource(new File(xmlPath)));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static boolean validateXMLSchema(String xsdPath, String xmlPath) {
        try {
            SchemaFactory factory = SchemaFactory.newInstance(XMLConstants.W3C_XML_SCHEMA_NS_URI);
            Schema schema = factory.newSchema(new File(xsdPath));
            Validator validator = schema.newValidator();
            validator.validate(new StreamSource(new File(xmlPath)));
            return true;
        } catch (SAXException e) {
            System.out.println("SAX Exception: " + e.getMessage());
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }
}
