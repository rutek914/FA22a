package Szkola.Nogard.Schritt5;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

/**
 * Diese Klasse modelliert Bereiche.Ein Bereich kann ein Gebiet, ein Haus, ein
 * Raum etc. sein.
 * 
 * Jeder Bereich ist mit anderen Bereichen �ber Ausg�nge verbunden. M�gliche
 * Ausg�nge liegen im Norden, Osten, S�den und Westen.
 * 
 * F�r jeden Ausgang h�lt ein Bereich eine Referenz auf den benachbarten Bereich
 * parat.
 */
public class Bereich {

    private String beschreibung;
    private Map<Richtungen, Bereich> nachbarn;
    private LinkedList<Gegenstand> gegenstaende;

    /**
     * Konstruktor.
     * 
     * @param beschreibung Die Beschreibung des Areals.
     */
    public Bereich(String beschreibung) {
        this.beschreibung = beschreibung;
        gegenstaende = new LinkedList<>();
        nachbarn = new HashMap<>();
        for (Richtungen richtung : Richtungen.values()) {
            nachbarn.put(richtung, null);
        }
    }

    /**
     * Liefert die Beschreibung des Bereichs.
     * 
     * @return Die Beschreibung des Bereichs.
     */
    public String getBeschreibung() {
        return beschreibung;
    }

    /**
     * Definiert die benachbarten Bereiche des Bereichs.
     * Jede Richtung f�hrt entweder in einen anderen Bereich oder ist 'null' (kein
     * Ausgang).
     * 
     * @param nord Der im Norden benachbarte Bereich.
     * @param ost  Der im Osten benachbarte Bereich.
     * @param sued Der im S�den benachbarte Bereich.
     * @param west Der im Westen benachbarte Bereich.
     */
    public void setNachbar(Richtungen richtung, Bereich nachbar) {
        nachbarn.put(richtung, nachbar);
        // nachbarn.put(Richtungen.EAST, ost);
    }

    public Bereich getNachbar(Richtungen richtung) {
        return nachbarn.get(richtung);
    }

    public StringBuilder getInfo() {
        StringBuilder sb = new StringBuilder();
        System.out.println("Du befindest dich " + getBeschreibung() + ".");
        System.out.println("Du kannst gehen nach:");
        for (Map.Entry<Richtungen, Bereich> para : nachbarn.entrySet()) {
            if (para.getValue() != null) {
                sb.append("\n\t" + para.getKey().name().toLowerCase());
            }
        }
        sb.append("\nGegenstände im Bereich:");
        if (gegenstaende.isEmpty()) {
            sb.append("\n\tkeine");
        } else {
            for (Gegenstand gegenstand : gegenstaende) {
                sb.append("\n\t" + gegenstand.getName());
            }
        }
        return sb;
    }

    public void plazierenGegenstand(Gegenstand geg) {
        gegenstaende.add(geg);
    }

    public void entfernenGegenstand(Gegenstand geg) {
        try {
            gegenstaende.remove(geg);
            throw new GegenstandException("Something went wrong");
        } catch (GegenstandException e) {
            System.out.println("Failed to delete given element " + e.getMessage());
        }

    }

    public Gegenstand suchenGegenstand(Gegenstand geg) {
        try {
            for (Gegenstand kupa : gegenstaende) {
                if (kupa.getName().equals(geg.getName())) {
                    return kupa;
                }
            }
            throw new GegenstandException("nie maaaa");
        } catch (GegenstandException e) {
            System.out.println("Failed to find your item " + e.getMessage());
        }
        return null;
    }

}
