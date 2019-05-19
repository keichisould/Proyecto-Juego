/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;


import java.awt.Color;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import modelo.Modelo;
import vista.Interfaz;
import vista.Panel2;
import vista.panelPuntaje;




/**
 *
 * @author anima_000
 */
public class Level2 implements ActionListener{
    
    
    private Panel2 v;
    private panelPuntaje p;
    private Modelo  m ;
    private Interfaz i;
    

    public Level2(Interfaz i, Modelo m) {
        this.i = i;
        this.m = m;
        this.v.pista2.addActionListener(this);
        this.v.imagen1.addActionListener(this);
        this.v.imagen2.addActionListener(this);
        this.v.imagen3.addActionListener(this);
    }
    
    public void iniciar (){
        i.setVisible(false);
    }
    
    @Override
    public void actionPerformed(ActionEvent ae) {
   
     if(v.pista2 == ae.getSource()){
          try {
              v.pista2.setEnabled(false);
              Clip sonido = AudioSystem.getClip();
              File a = new File("src/imagenes/Med.wav");
              sonido.open(AudioSystem.getAudioInputStream(a));
              sonido.start();
              Thread.sleep(4900);
              sonido.stop();
              v.pista2.setEnabled(true);
          } catch (LineUnavailableException | UnsupportedAudioFileException | IOException | InterruptedException ex) {
              Logger.getLogger(Level1.class.getName()).log(Level.SEVERE, null, ex);
          }
              
      }else if(v.imagen1 == ae.getSource()){
          v.nombre1.setBackground(Color.red);
            
           if(p.nombre1.getText().equals("")){
            p.nombre1.setText("1");
          
          }else{
            int num = Integer.parseInt(p.nombre1.getText()); 
            int numero = num +1;
             String num2 = String.valueOf(numero);
             p.nombre1.setText(num2);
          }
          
      }else if(v.imagen2 == ae.getSource()){
          v.nombre2.setBackground(Color.red);
          if(p.nombre1.getText().equals("")){
            p.nombre1.setText("1");
          
          }else{
            int num = Integer.parseInt(p.nombre1.getText()); 
            int numero = num +1;
             String num2 = String.valueOf(numero);
             p.nombre1.setText(num2);
          }
          
      }else if(v.imagen3 == ae.getSource()){
          ImageIcon icono3 = new ImageIcon("src/imagenes/d.jpg");
          Icon ico3 = new ImageIcon(icono3.getImage().getScaledInstance(265, 250, Image.SCALE_DEFAULT));
          v.nombre3.setBackground(Color.GREEN);
          JOptionPane.showMessageDialog(null, null, "MEDELLIN", 0, ico3);
           v.nombre1.setBackground(Color.WHITE);
          v.nombre2.setBackground(Color.WHITE);
          v.nombre3.setBackground(Color.WHITE);
          int num = Integer.parseInt(p.nombre2.getText()); 
          int numero = num +1;
          String num2 = String.valueOf(numero);
          p.nombre2.setText(num2);
          i.mostrarV3();
      }     
    }
}