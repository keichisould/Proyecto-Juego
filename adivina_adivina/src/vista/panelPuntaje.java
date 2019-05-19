/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import control.Level1;
import java.awt.Button;
import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import javafx.application.Platform;
import javafx.embed.swing.JFXPanel;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.media.MediaView;
import javafx.util.Duration;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.CompoundBorder;
import javax.swing.border.EmptyBorder;
import javax.swing.border.TitledBorder;

/**
 *
 * @author anima_000
 */
public class panelPuntaje extends JPanel {
 
    public static final String VERDADERO = "verdadero";
    
    private final Interfaz ventana;
    
   
    public static JLabel nombre1;
    public static JLabel nombre2;
    public static JLabel nombre3;
     
    public static Button pista2;
    public static Button pista3;
    
    
    
    
    public panelPuntaje(Interfaz ventana) {
        
        int red = 30;
        int green = 22;
        int blue = 100;
        float[] hsb = Color.RGBtoHSB(red, green, blue, null);
        float hue = hsb[0];
        float sat = hsb[1];
        float bri = hsb[2];
        
        
        this.setBackground(Color.getHSBColor(hue, sat, bri));
        this.ventana = ventana;
        this.setBounds(1276, 0, 54, 697);
        setBorder(BorderFactory.createTitledBorder("*"));
        setLayout(null);
        
       
        
       
        
        Font f2 = new Font("bauhaus 93", Font.CENTER_BASELINE, 24);
        nombre1= new JLabel();
        nombre1.setFont(f2);
        nombre1.setBounds(7, 95, 40, 100);
        nombre1.setOpaque(true);
        nombre1.setBackground(Color.RED);
        nombre1.setBorder(BorderFactory.createEtchedBorder(Color.BLACK, Color.black));
        nombre1.setHorizontalAlignment(JLabel.CENTER);
        
       

        nombre2= new JLabel();
        nombre2.setFont(f2);
        nombre2.setBounds(7, 220, 40, 100);
        nombre2.setOpaque(true);
        nombre2.setBackground(Color.GREEN);
        nombre2.setBorder(BorderFactory.createEtchedBorder(Color.BLACK, Color.black));
        nombre2.setHorizontalAlignment(JLabel.CENTER);
          
       
        
        nombre3= new JLabel();
        nombre3.setFont(f2);
        nombre3.setBounds(7, 345, 40, 100);
        nombre3.setOpaque(true);
        nombre3.setBackground(Color.WHITE);
        nombre3.setForeground(Color.GREEN);
        nombre3.setBorder(BorderFactory.createEtchedBorder(Color.BLACK, Color.black));
        nombre3.setHorizontalAlignment(JLabel.CENTER);
       
        
        add(nombre1);
        add(nombre2);
        add(nombre3);
        
    }   
    
    
    
}
