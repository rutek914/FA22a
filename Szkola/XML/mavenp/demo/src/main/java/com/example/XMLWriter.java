package com.example;

import java.io.File;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Marshaller;

public class XMLWriter {
    public static void main(String[] args) {
        // Tworzenie obiektu Kaufvertrag
        Kaufvertrag kaufvertrag = new Kaufvertrag();
        kaufvertrag.setKaeufer("Jan Kowalski");
        kaufvertrag.setVerkaeufer("Anna Nowak");
        kaufvertrag.setBetrag(1000.0);

        try {
            // Tworzenie kontekstu JAXB dla klasy Kaufvertrag
            JAXBContext jaxbContext = JAXBContext.newInstance(Kaufvertrag.class);

            // Tworzenie marshallera
            Marshaller marshaller = jaxbContext.createMarshaller();
            marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);

            // Zapis do pliku XML
            marshaller.marshal(kaufvertrag, new File("C:/Users/rutek/OneDrive/Pulpit/generujtu"));
            System.out.println("Dane Kaufvertrag zostały zapisane do pliku XML.");
        } catch (Exception e) {
            System.out.println("Błąd podczas zapisywania danych do pliku XML: " + e.getMessage());
        }
    }
}
