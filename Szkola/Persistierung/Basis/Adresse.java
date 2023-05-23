package Szkola.Persistierung.Basis;

public class Adresse {

    private String strasse, hausNr, plz, ort;

    public Adresse(String strasse, String hausNr, String plz, String ort) {
        this.hausNr = hausNr;
        this.strasse = strasse;
        this.plz = plz;
        this.ort = ort;
    }

    public String getStrasse() {
        return strasse;
    }

    public void setStrasse(String strasse) {
        this.strasse = strasse;
    }

    public String getHausNr() {
        return hausNr;
    }

    public void setHausNr(String hausNr) {
        this.hausNr = hausNr;
    }

    public String getPlz() {
        return plz;
    }

    public void setPlz(String plz) {
        this.plz = plz;
    }

    public String getOrt() {
        return ort;
    }

    public void setOrt(String ort) {
        this.ort = ort;
    }

    public String toString() {
        return "Straße: " + strasse + "\nHausnummer: " + hausNr + "\nPLZ: " + plz + "\nOrt: " + ort;
    }

}
