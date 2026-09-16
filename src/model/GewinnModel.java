package model;

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

    public GewinnModel() {
        this.gesamtPunkte = 30;
    }

    public int getGesamtPunkte() {
        return gesamtPunkte;
    }

    public int getComputerZahl() {
        return computerZahl;
    }

    public int getRundenErgebnis() {
        return rundenErgebnis;
    }

    public void berechneComputerZahl() {
        this.computerZahl = (int) (Math.random()*9)+1;
    }

    /**
     * calculates the amount of points the player gets this round
     * and updates the attributes
     * @param spielerZahl the number entered the player
     */
    public void berechneRunde(int spielerZahl) {
        this.spielerZahl = spielerZahl;
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
