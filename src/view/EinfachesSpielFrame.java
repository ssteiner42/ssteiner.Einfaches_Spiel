package view;

import javax.swing.*;
import java.awt.event.ActionListener;

public class EinfachesSpielFrame extends JFrame {
    private EinfachesSpielPanel esP = new EinfachesSpielPanel();
    private JTextField text;
    private JTextField computerNumber;

    public EinfachesSpielFrame(ActionListener controller) {
        super("Zahlen-Gewinnspiel (v1.0)");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.add(esP);
        text = esP.getText;
        esP.getButton.addActionListener(controller);
        this.setVisible(true);
    }

    public int getSpielerZahl() {
        return Integer.parseInt(text.getText());
    }

    public void setComputerZahl(int number) {
        computerNumber.setText(String.valueOf(number));
    }
}
