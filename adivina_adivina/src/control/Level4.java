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
import modelo.Jugador;
import modelo.Modelo;
import modelo.Modelo2;
import vista.Interfaz;
import vista.Panel4;
import vista.panelPuntaje;




/**
 *
 * @author anima_000
 */
public class Level4 implements ActionListener{
    
    Modelo2 modelo = new Modelo2();
    
    private String alto, medio,bajo;
    private panelPuntaje p;
    private Panel4 v;
    private Modelo  m ;
    private Interfaz i;

    public Level4(Interfaz i, Modelo m) {
        this.i = i;
        this.m = m;
        this.v.pista2.addActionListener(this); 
        this.v.pista3.addActionListener(this); 
        this.v.imagen1.addActionListener(this);
        this.v.imagen2.addActionListener(this);
        this.v.imagen3.addActionListener(this);
    }
    
    public void iniciar (){
        i.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
   
     if(v.pista2 == ae.getSource()){
          try {
              v.pista2.setEnabled(false);
              Clip sonido = AudioSystem.getClip();
              File a = new File("src/imagenes/Carn.wav");
              sonido.open(AudioSystem.getAudioInputStream(a));
              sonido.start();
              Thread.sleep(4900);
              sonido.stop();
              v.pista2.setEnabled(true);
          } catch (LineUnavailableException | UnsupportedAudioFileException | IOException | InterruptedException ex) {
              Logger.getLogger(Level1.class.getName()).log(Level.SEVERE, null, ex);
          }
          
          
     
      }else if(v.imagen1 == ae.getSource()){
          Font f = new Font("bauhaus 93", Font.CENTER_BASELINE, 20);
          ImageIcon icono3 = new ImageIcon("src/imagenes/j.jpeg");
          Icon ico3 = new ImageIcon(icono3.getImage().getScaledInstance(265, 250, Image.SCALE_DEFAULT));
          v.nombre1.setBackground(Color.GREEN);
          JOptionPane.showMessageDialog(null, null, "Barranquilla", 0, ico3);
          
          v.nombre1.setBackground(Color.WHITE);
          v.nombre2.setBackground(Color.WHITE);
          v.nombre3.setBackground(Color.WHITE);
          
          int num = Integer.parseInt(p.nombre2.getText()); 
          int numero = num +1;
          String num2 = String.valueOf(numero);
          p.nombre2.setText(num2);
          
          
          
          if(v.nombre1.getText().equals("8") || v.nombre1.getText().equals("7")){
              p.nombre3.setText("50%");
          }
         
         
          //validacion para obtener el puntaje respecto a los valores erroneos
          if(p.nombre1.getText().equals("8") || p.nombre1.getText().equals("7")){
                p.nombre3.setText("0%");
          }else if(p.nombre1.getText().equals("6") || p.nombre1.getText().equals("5")){
               p.nombre3.setText("25%");
          }else if(p.nombre1.getText().equals("4")){
               p.nombre3.setText("50%");
          }else if(p.nombre1.getText().equals("3") || p.nombre1.getText().equals("2") || p.nombre1.getText().equals("1")){
               p.nombre3.setText("75%");
          }else if(p.nombre1.getText().equals("")){
               p.nombre3.setText("100%");
          }
          
          JOptionPane.showConfirmDialog(null, "Tu porcentaje fue: "+p.nombre3.getText());
         
          
          String nombre = String.valueOf(JOptionPane.showInputDialog(null, "ingresa tu nombre"));
          Jugador j = new Jugador(p.nombre2.getText(), p.nombre1.getText(), p.nombre3.getText() , nombre );
          
          j.setNombre(nombre);
          
          modelo.insertar(j);
          modelo.imprimir();
          
          //se limpia los labels del panelPuntaje
          p.nombre1.setText("");
          p.nombre2.setText("");
          p.nombre3.setText("");
          
          //se muestra panel1
          i.mostrarV();
          
      //envia intentos al panelPuntaje dependiendo la respuesta
      }else if(v.imagen2 == ae.getSource()){
            v.nombre2.setBackground(Color.RED);
            if(p.nombre1.getText().equals("")){
            p.nombre1.setText("1");
          
          }else{
             int num = Integer.parseInt(p.nombre1.getText()); 
             int numero = num +1;
             String num2 = String.valueOf(numero);
             p.nombre1.setText(num2);
          }
          
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
