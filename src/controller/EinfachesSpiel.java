package controller;

import model.GewinnModel;
import view.EinfachesSpielFrame;

import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class EinfachesSpiel implements ActionListener, KeyListener {

    private EinfachesSpielFrame view;
    private GewinnModel model;

    static void main(String[] args) {
        new EinfachesSpiel();
    }

    public EinfachesSpiel() {
        this.model = new GewinnModel();
        this.view = new EinfachesSpielFrame(this, this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String command = e.getActionCommand();
        if (command.equals("Noch Einmal")) {
            view.setErg(" ");
            view.setComputerZahl("");
            view.setSpielerZahl("");
        }
    }

    @Override
    public void keyTyped(KeyEvent e) {
        if (e.getKeyChar() == KeyEvent.VK_ENTER && view.getSpielerZahl() > 0 && view.getSpielerZahl() < 10) {
            model.berechneRunde(view.getSpielerZahl());
            view.setComputerZahl(model.getComputerZahl());
            view.setErg(model.getRundenErgebnis());
            view.setGes(model.getGesamtPunkte());
        }
    }

    @Override
    public void keyPressed(KeyEvent e) {

    }

    @Override
    public void keyReleased(KeyEvent e) {

    }
}
