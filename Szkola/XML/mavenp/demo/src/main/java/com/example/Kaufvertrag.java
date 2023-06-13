package com.example;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "Kaufvertrag")
@XmlAccessorType(XmlAccessType.FIELD)
public class Kaufvertrag {
    @XmlElement
    private String kaeufer;

    @XmlElement
    private String verkaeufer;

    @XmlElement
    private double betrag;

    // konstruktory, gettery, settery (pominięte dla uproszczenia)

    // przykładowe metody:

    public String getKaeufer() {
        return kaeufer;
    }

    public void setKaeufer(String kaeufer) {
        this.kaeufer = kaeufer;
    }

    public String getVerkaeufer() {
        return verkaeufer;
    }

    public void setVerkaeufer(String verkaeufer) {
        this.verkaeufer = verkaeufer;
    }

    public double getBetrag() {
        return betrag;
    }

    public void setBetrag(double betrag) {
        this.betrag = betrag;
    }
}
