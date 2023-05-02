package Szkola.Nogard.Schritt4;

import java.util.HashMap;
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

    /**
     * Konstruktor.
     * 
     * @param beschreibung Die Beschreibung des Areals.
     */
    public Bereich(String beschreibung) {
        this.beschreibung = beschreibung;
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
        return sb;
    }

}
