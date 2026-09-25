package view;

import javax.swing.*;
import java.awt.event.ActionListener;
import java.awt.event.KeyListener;

/**
 * The JFrame Class for the game with all the Methods for the controller
 */
public class EinfachesSpielFrame extends JFrame {
    private EinfachesSpielPanel esP = new EinfachesSpielPanel();
    private JTextField text;
    private JTextField computerNumber;
    private JLabel erg;
    private JLabel ges;
    private JButton b;

    public EinfachesSpielFrame(ActionListener controller, KeyListener key) {
        super("Zahlen-Gewinnspiel (v1.0)");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.add(esP);
        text = esP.getText();
        computerNumber = esP.getComputerText();
        erg = esP.getErg();
        ges = esP.getGes();
        text.addKeyListener(key);
        esP.getButton().addActionListener(controller);
        b = esP.getButton();
        this.setVisible(true);
    }

    public int getSpielerZahl() {
        try {
            return Integer.parseInt(text.getText());
        }
        catch (NumberFormatException e) {
            return 10;
        }
    }

    public void setSpielerZahl(String zahl) {
        text.setText(zahl);
    }

    public void setComputerZahl(String number) {
        computerNumber.setText(String.valueOf(number));
    }

    public void setErg(String erg) {
        this.erg.setText(erg);
    }

    public void setGes(String ges) {
        this.ges.setText(ges);
    }

    public void lockInput() {
        text.setEnabled(false);
    }

    public void unlockInput() {
        text.setEnabled(true);
    }

    public void activateButton() {
        b.setEnabled(true);
    }

    public void deactivateButton() {
        b.setEnabled(false);
    }
}
