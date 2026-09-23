package controller;

import model.GewinnModel;
import view.EinfachesSpielFrame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class EinfachesSpiel implements ActionListener {

    private EinfachesSpielFrame view;
    private GewinnModel model;

    static void main(String[] args) {
        new EinfachesSpiel();
    }

    public EinfachesSpiel() {
        this.model = new GewinnModel();
        this.view = new EinfachesSpielFrame(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String command = e.getActionCommand();
        if(command.equals("Noch Einmal")) {
            model.berechneComputerZahl();
            view.setComputerZahl(model.getComputerZahl());
            model.berechneRunde(view.getSpielerZahl());
        }
    }
}
