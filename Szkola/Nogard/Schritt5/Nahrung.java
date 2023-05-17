package Szkola.Nogard.Schritt5;

public class Nahrung extends Gegenstand {
    private final int NWERT;

    public Nahrung(String name, String beschreibung, double gewicht, int nWert) {
        super(name, beschreibung, 0);
        NWERT = nWert;

    }

    public int getNWERT() {
        return NWERT;
    }

}
