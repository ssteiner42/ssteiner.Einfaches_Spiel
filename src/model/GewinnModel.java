package model;

import java.awt.*;

/**
 * The logic class for a small number game
 * @author Sebastian Steiner
 * @version 2026-09-16
 */
public class GewinnModel {
    private int gesamtPunkte;
    private int spielerZahl;
    private int computerZahl;
    private int rundenErgebnis;
    private Color c;

    public GewinnModel() {
        this.gesamtPunkte = 30;
    }

    public String getGesamtPunkte() {
        return String.valueOf(gesamtPunkte);
    }

    public String getComputerZahl() {
        return String.valueOf(computerZahl);
    }

    public Color getColor() {
        return c;
    }

    public String getRundenErgebnis() {
        if(hatGewonnen()) {
            c = Color.green;
            return "Gewonnen";
        }
        else if(hatVerloren()) {
            c = Color.RED;
            return "Verloren";
        }
        else {
            if(rundenErgebnis >= 0) {
                c = Color.GREEN;
            }
            else {
                c = Color.RED;
            }
            return String.valueOf(rundenErgebnis);
        }
    }

    public void berechneComputerZahl() {
        this.computerZahl = (int) (Math.random()*9)+1;
    }

    /*
     * calculates the amount of points the player gets this round
     * and updates the attributes
     * @param spielerZahl the number entered the player
     */
    public void berechneRunde(int spielerZahl) {
        this.spielerZahl = spielerZahl;
        this.berechneComputerZahl();
        if(spielerZahl == this.computerZahl) {
            this.rundenErgebnis = 20;
        }
        else if(spielerZahl == this.computerZahl + 1 || spielerZahl == this.computerZahl - 1) {
            this.rundenErgebnis = 5;
        }
        else {
            this.rundenErgebnis = -10;
        }
        this.gesamtPunkte += this.rundenErgebnis;
    }

    public boolean hatGewonnen() {
        return this.gesamtPunkte >= 100;
    }

    public boolean hatVerloren() {
        return this.gesamtPunkte <= 0;
    }
}
