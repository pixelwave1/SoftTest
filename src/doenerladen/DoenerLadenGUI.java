/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package doenerladen;

/**
 *
 * @author MahminoHas22
 */
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

public class DoenerLadenGUI extends JFrame {

    private CustomLabel Willkommensnachricht;
    private CustomButton doenerkaufen;
    private CustomButton getrenkkaufen;

    public DoenerLadenGUI() {
        this.setTitle("ZoomDöner");

        JPanel panel = new JPanel(new GridLayout(3, 1));

        Willkommensnachricht = new CustomLabel("Willkommen im ZoomDöner");
        doenerkaufen = new CustomButton("Döner kaufen");
        getrenkkaufen = new CustomButton("Getränk kaufen");

        panel.add(Willkommensnachricht);
        panel.add(doenerkaufen);
        panel.add(getrenkkaufen);

        this.add(panel);

        this.setSize(400, 300);
        this.setLocationRelativeTo(null);
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == doenerkaufen) {
            doenerkaufen.anderung("Döner bestellt", Color.orange);
            Willkommensnachricht.anderung(" :) ", Color.orange);
        }
        if (e.getSource() == getrenkkaufen) {
            getrenkkaufen.anderung("Getränke bestellt", Color.orange);
            Willkommensnachricht.anderung(" :) ", Color.orange);
        }
    }
}
