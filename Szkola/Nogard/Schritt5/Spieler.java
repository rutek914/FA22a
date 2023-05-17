package Szkola.Nogard.Schritt5;

import java.util.ArrayList;
import java.util.Collections;

public class Spieler {
    private final String name;
    private final double maxTragkraft;
    private final int fitness;
    private ArrayList<Gegenstand> gegenstaendeSpieler;
    private Bereich aktuBereich;

    public Spieler(String name, double mT, int fit, Bereich aB) {
        this.name = name;
        maxTragkraft = mT;
        fitness = fit;
        aktuBereich = aB;
        gegenstaendeSpieler = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public double getMT() {
        return maxTragkraft;
    }

    public int getFitness() {
        return fitness;
    }

    public ArrayList<Gegenstand> getGegList() {
        return gegenstaendeSpieler;
    }

    public Bereich getAktBereich() {
        return aktuBereich;
    }

    public double getTraglast() {
        double traglast = 0;
        for (Gegenstand gegenstand : gegenstaendeSpieler) {
            traglast += gegenstand.getGewicht();
        }
        return traglast;
    }

    public StringBuilder getInfo() {
        StringBuilder sb = new StringBuilder();
        sb.append("Name: " + name + "\n");
        sb.append("Maximale Tragkraft: " + maxTragkraft + "\n");
        sb.append("Fitness: " + fitness + "\n");
        sb.append("Tragbare Gegenstände: ");
        if (gegenstaendeSpieler.isEmpty()) {
            sb.append("keine\n");
        } else {
            sb.append("\n");
            for (Gegenstand gegenstand : gegenstaendeSpieler) {
                sb.append("\t" + gegenstand.getName() + " (" + gegenstand.getGewicht() + ")\n");
            }
        }
        sb.append("Aktueller Bereich: " + aktuBereich.getBeschreibung() + "\n");
        return sb;
    }

    public void aufnehmenGegenstand(Gegenstand przedmiot){
        Gegenstand rzecz = getAktBereich().suchenGegenstand(przedmiot);
        if (rzecz instanceof Nahrung == false){
            double tragLast = getTraglast();
            
        } else {
            thorw new GegenstandNichtVorhandenException("nie ma przedmiotu takiego !");
        }
    }

}
