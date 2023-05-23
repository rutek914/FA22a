package Szkola.Persistierung.Basis;

public class Kaufvertrag {

    private Vertragspartner verkaeufer;
    private Vertragspartner kaeufer;
    private Ware ware;
    private String zahlungsModalitaeten;

    public Kaufvertrag(Vertragspartner kaeufer, Vertragspartner verkaeufer, Ware ware) {
        this.kaeufer = kaeufer;
        this.verkaeufer = verkaeufer;
        this.ware = ware;
    }

    public Vertragspartner getVerkaeufer() {
        return verkaeufer;
    }

    public Vertragspartner getKaeufer() {
        return kaeufer;
    }

    public void setKaeufer(Vertragspartner kaeufer) {
        this.kaeufer = kaeufer;
    }

    public Ware getWare() {
        return ware;
    }

    public void setWare(Ware ware) {
        this.ware = ware;
    }

    public String getZahlungsModalitaeten() {
        return zahlungsModalitaeten;
    }

    public void setZahlungsModalitaeten(String zahlungsModalitaeten) {
        this.zahlungsModalitaeten = zahlungsModalitaeten;
    }

    @Override
    public String toString() {
        return "Käufer: " + kaeufer + "\nVerkäufer: " + verkaeufer + "\nWare: " + ware + "\nZahlungsmodalitäten: "
                + zahlungsModalitaeten;
    }

}
