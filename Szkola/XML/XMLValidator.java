package Szkola.XML;

import java.io.File;

import javax.xml.XMLConstants;
import javax.xml.transform.stream.StreamSource;
import javax.xml.validation.Schema;
import javax.xml.validation.SchemaFactory;
import javax.xml.validation.Validator;

public class XMLValidator {
    public static void main(String[] args) {
        String xsdPath = "C:/Users/rutek/OneDrive/Pulpit/Rheinmetall/szkola/LF05/Kaufvertrag.sxd";
        String xmlPath = "C:/Users/rutek/OneDrive/Pulpit/Rheinmetall/szkola/LF05/Kaufvertrag.xml";

        // Überprüfe die Validität der XML-Datei
        if (validateXMLSchema(xsdPath, xmlPath)) {
            System.out.println("Die XML-Datei ist gültig.");
        } else {
            System.out.println("Die XML-Datei ist ungültig.");
        }
    }

    private static boolean validateXMLSchema(String xsdPath, String xmlPath) {
        try {
            SchemaFactory factory = SchemaFactory.newInstance(XMLConstants.W3C_XML_SCHEMA_NS_URI);
            Schema schema = factory.newSchema(new File(xsdPath));
            Validator validator = schema.newValidator();
            validator.validate(new StreamSource(new File(xmlPath)));
            return true;
        } catch (Exception e) {
            return false;
        }
    }
}
