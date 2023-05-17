package Szkola.Nogard.Schritt5;

public class Gegenstand {
    private String name;
    private String beschreibung;
    private double gewicht; // in kg

    public Gegenstand(String name, String beschreibung, double gewicht) {
        this.beschreibung = beschreibung;
        this.name = name;
        this.gewicht = gewicht;
    }

    public String getName() {
        return name;
    }

    public String getBeschreibung() {
        return beschreibung;
    }

    public double getGewicht() {
        return gewicht;
    }

    public String getInfo() {
        return String.format("Name: %s, Beschreibung: %s, Gewicht: %.2f kg", name, beschreibung, gewicht);
    }
}
