/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;


import java.awt.Color;
import java.awt.Font;
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
import vista.Panel1;
import vista.panelPuntaje;




/**
 *
 * @author anima_000
 */
public class Level1 implements ActionListener{
    
    
    private panelPuntaje p;
    private Panel1 v;
    private Modelo  m ;
    private Interfaz i;
    

    public Level1(Interfaz i, Modelo m) {
        this.i = i;
        this.m = m;
        this.v.pista2.addActionListener(this); 
        this.v.imagen1.addActionListener(this);
        this.v.imagen2.addActionListener(this);
        this.v.imagen3.addActionListener(this);
    }
    

    @Override
    public void actionPerformed(ActionEvent ae) {
   
     if(v.pista2 == ae.getSource()){
          try {
              v.pista2.setEnabled(false);            //se desactiva el boton al dar click
              Clip sonido = AudioSystem.getClip();  //libreria que inicializa audios
              File a = new File("src/imagenes/Joe.wav");  //ruta o url del archivo
              sonido.open(AudioSystem.getAudioInputStream(a)); //se abre el audio, queda listo para iniciar
              sonido.start();                                  //se reproduce solo 5 segundos con el Thread sleep
              Thread.sleep(4900);
              sonido.stop();
              v.pista2.setEnabled(true);             //el boton se vuelve a activar
          } catch (LineUnavailableException | UnsupportedAudioFileException | IOException | InterruptedException ex) {
              Logger.getLogger(Level1.class.getName()).log(Level.SEVERE, null, ex);
          }
            
      }else if(v.imagen1 == ae.getSource()){
          v.nombre1.setBackground(Color.red);
          
          if(p.nombre1.getText().equals("")){ //si el label (nombre1) de panelpuntaje esta vacío entonces...
                p.nombre1.setText("1");       //envie 1 como string
                
          }else{                              //sino
                int num = Integer.parseInt(p.nombre1.getText()); //traigame el valor del label como entero
                int numero = num +1;                             //sumele uno
                String num2 = String.valueOf(numero);            //conviertalo a string (label no recibe enteros)
                p.nombre1.setText(num2);                         //envíe el nuevo puntaje
          }
          
      }else if(v.imagen2 == ae.getSource()){
          Font f = new Font("bauhaus 93", Font.CENTER_BASELINE, 20); //fuente
          ImageIcon icono3 = new ImageIcon("src/imagenes/a.jpeg"); //url de imagen
          Icon ico3 = new ImageIcon(icono3.getImage().getScaledInstance(265, 250, Image.SCALE_DEFAULT)); //se modifica tamaño de imagen
          
          v.nombre2.setBackground(Color.GREEN);
          JOptionPane.showMessageDialog(null, null, "JOE ARROYO", 0, ico3); // se añade ico3 al JOption
          v.nombre1.setBackground(Color.WHITE);
          v.nombre2.setBackground(Color.WHITE);
          v.nombre3.setBackground(Color.WHITE);
          p.nombre2.setText("1");
          i.mostrarV2();
          
      }else if(v.imagen3 == ae.getSource()){
          v.nombre3.setBackground(Color.RED);
          if(p.nombre1.getText().equals("")){
            p.nombre1.setText("1");
          
          }else{
            int num = Integer.parseInt(p.nombre1.getText()); 
            int numero = num +1;
             String num2 = String.valueOf(numero);
             p.nombre1.setText(num2);
          }
      }
    }
    
    
    
    
}