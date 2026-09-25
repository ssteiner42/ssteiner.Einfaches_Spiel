package view;

import javax.swing.*;
import java.awt.*;

/**
 * The JPanel Class for the game with all the components and methods to give the components to the frame
 */
public class EinfachesSpielPanel extends JPanel{
    private JButton b = new JButton("Noch Einmal");
    private JTextField person = new JTextField();
    private JTextField computer = new JTextField();
    private JLabel erg = new JLabel("Tippe eine Zahl von 1 bis 9");
    private JLabel ges = new JLabel("Gesamtpunkte: 30");

    public EinfachesSpielPanel() {
        this.setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
        JPanel gP = new JPanel(new GridLayout(1,2));
        this.add(BorderLayout.CENTER, gP);
        JPanel bL;
        bL = new JPanel();
        bL.setLayout(new BoxLayout(bL, BoxLayout.Y_AXIS));
        gP.add(bL);
        bL.add(new JLabel("Rundenergebnis:"));
        erg.setOpaque(true);
        erg.setBackground(Color.WHITE);
        bL.add(erg);
        bL.add(new JLabel("Deine Zahl:"));
        bL.add(person);
        bL = new JPanel();
        bL.setLayout(new BoxLayout(bL, BoxLayout.Y_AXIS));
        gP.add(bL);
        bL.add(new JLabel("Gesamtpunkte:"));
        ges.setOpaque(true);
        ges.setBackground(Color.WHITE);
        bL.add(ges);
        bL.add(new JLabel("Computer:"));
        computer.setEnabled(false);
        bL.add(computer);
        JPanel p = new JPanel();
        p.setSize(this.getWidth(),(this.getHeight()/5));
        b.setAlignmentX(Component.CENTER_ALIGNMENT);
        p.add(b);
        this.add(b);
    }

    public JButton getButton() {
        return b;
    }

    public JTextField getText() {
        return person;
    }

    public JTextField getComputerText() {
        return computer;
    }

    public JLabel getErg() {
        return erg;
    }

    public JLabel getGes() {
        return ges;
    }

    public void setLabelColor(Color c) {
        erg.setBackground(c);
        ges.setBackground(c);
    }
}
