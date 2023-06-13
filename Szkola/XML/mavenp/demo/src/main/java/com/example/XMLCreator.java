package com.example;

import java.io.File;

import javax.xml.XMLConstants;
import javax.xml.transform.stream.StreamSource;
import javax.xml.validation.Schema;
import javax.xml.validation.SchemaFactory;
import javax.xml.validation.Validator;

public class XMLCreator {
    public static void main(String[] args) {
        String xsdPath = "C:/Users/rutek/OneDrive/Pulpit/Kaufvertrag.xsd";
        String xmlPath = "C:/Users/rutek/OneDrive/Pulpit/";

        try {
            // Tworzenie fabryki dla walidatora
            SchemaFactory factory = SchemaFactory.newInstance(XMLConstants.W3C_XML_SCHEMA_NS_URI);

            // Wczytanie schematu z pliku XSD
            Schema schema = factory.newSchema(new File(xsdPath));

            // Tworzenie walidatora
            Validator validator = schema.newValidator();

            // Walidacja - wygenerowanie XML zgodnie z XSD
            validator.validate(new StreamSource(new File(xmlPath)));

            System.out.println("Poprawny plik XML został utworzony na podstawie XSD.");
        } catch (Exception e) {
            System.out.println("Błąd podczas tworzenia pliku XML: " + e.getMessage());
        }
    }
}
