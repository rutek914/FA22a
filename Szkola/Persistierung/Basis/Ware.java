package Szkola.Persistierung.Basis;

import java.util.List;

public class Ware {

    private String bezeichnung, beschreibung;
    private double preis;
    private List<String> besonderheiten;
    private List<String> maengel;

    public Ware(String bezeichnung, double preis) {
        this.bezeichnung = bezeichnung;
        this.preis = preis;
    }

    public String getBezeichnung() {
        return bezeichnung;
    }

    public void setBezeichnung(String bezeichnung) {
        this.bezeichnung = bezeichnung;
    }

    public String getBeschreibung() {
        return beschreibung;
    }

    public void setBeschreibung(String beschreibung) {
        this.beschreibung = beschreibung;
    }

    public double getPreis() {
        return preis;
    }

    public void setPreis(double preis) {
        this.preis = preis;
    }

    public List<String> getBesonderheiten() {
        return besonderheiten;
    }

    public List<String> getMaengel() {
        return maengel;
    }

    public String toString() {
        return "Bezeichnung: " + bezeichnung + "\nBeschreibung: " + beschreibung + "\nPreis: " + preis
                + "\nBesonderheiten: " + besonderheiten + "\nMängel: " + maengel;
    }

}
