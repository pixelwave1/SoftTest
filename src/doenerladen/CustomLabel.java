/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package doenerladen;

/**
 *
 * @author MahminoHas22
 */
import java.awt.Color;
import javax.swing.*;

public class CustomLabel extends JLabel{
    
    public CustomLabel(String text) {
        super (text, SwingConstants.CENTER);
        this.setBackground(Color.blue);
    }
    public void anderung (String neuerText, Color neuerFarbe){
        this.setText(neuerText);
        this.setBackground(neuerFarbe);
    }
}
