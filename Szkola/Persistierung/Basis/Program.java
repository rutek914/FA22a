package Szkola.Persistierung.Basis;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
//import java.util.ArrayList;

public class Program {

    public static void main(String[] args) throws FileNotFoundException {

        Vertragspartner kaeufer = new Vertragspartner("Zinedine", "Zidane");
        Vertragspartner verkaeufer = new Vertragspartner("Raul", "Gonzalez");
        Ware ware = new Ware("Audi", 7500.0);
        ware.setBeschreibung("R8, Baujahr: 2007");
        ware.getBesonderheiten().add("Winterreifen inklusive");
        ware.getBesonderheiten().add("Panoramadach");
        ware.getMaengel().add("Motorfehler wird angezeigt");
        Kaufvertrag kaufvertragg = new Kaufvertrag(kaeufer, verkaeufer, ware);

        String datei = "C:/Users/rutek/OneDrive/Dokumenty/vscode_git/FA22a/Szkola/Persistierung/Kaufvertrag.txt";
        PrintWriter printer = new PrintWriter(datei);
        printer.println(kaufvertragg);
        printer.close();

    }

}
