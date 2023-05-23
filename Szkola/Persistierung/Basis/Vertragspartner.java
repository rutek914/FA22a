package Szkola.Persistierung.Basis;

public class Vertragspartner {

    private String vorname, nachname, ausweisNr;
    private Adresse adresse;

    public Vertragspartner(String vorname, String nachname) {
        this.vorname = vorname;
        this.nachname = nachname;
    }

    public String getVorname() {
        return vorname;
    }

    public void setVorname(String vorname) {
        this.vorname = vorname;
    }

    public String getNachname() {
        return nachname;
    }

    public void setNachname(String nachname) {
        this.nachname = nachname;
    }

    public String getAusweisNr() {
        return ausweisNr;
    }

    public void setAusweisNr(String ausweisNr) {
        this.ausweisNr = ausweisNr;
    }

    public Adresse getAdresse() {
        return adresse;
    }

    public void setAdresse(Adresse adresse) {
        this.adresse = adresse;
    }

    public String toString() {
        return "Vorname: " + vorname + "\nNachname: " + nachname + "\nAusweisnummer: " + ausweisNr + "\nAdresse: "
                + adresse;
    }

}
