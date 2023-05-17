package Szkola.Nogard.Schritt5;

public class Befehl {
    String befehlswort, befehlszusatz;

    public Befehl(String b, String bz) {
        befehlswort = b;
        befehlszusatz = bz;
    }

    public Befehl(String b) {
        this(b, null);
    }

    public String getBefehl() {
        return befehlswort;
    }

    public String getBefehlszusatz() {
        return befehlszusatz;
    }

}
