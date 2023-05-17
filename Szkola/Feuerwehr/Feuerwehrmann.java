package Szkola.Feuerwehr;

public class Feuerwehrmann {
    private String vornamme, nachnamme;

    public Feuerwehrmann(String v, String n) {
        vornamme = v;
        nachnamme = n;
    }

    public void setVornamme(String v) {
        vornamme = v;
    }

    public String getVornamme() {
        return vornamme;
    }

    public void setNachname(String n) {
        nachnamme = n;
    }

    public String getNachname() {
        return nachnamme;
    }
}
