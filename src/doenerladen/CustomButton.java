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

public class CustomButton extends JButton{
    
    
    
    public CustomButton (String Text) {
        super (Text);
        this.setBackground(Color.gray);
    }
    public void anderung (String neuerText, Color neuefarbe) {
        this.setText(neuerText);
        this.setBackground(neuefarbe);
   }
}
