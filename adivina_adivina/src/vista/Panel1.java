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
public class Panel1 extends JPanel {
    
    Level1 l1;
    
    public static final String VERDADERO = "verdadero";
    
    private final Interfaz ventana;
    
    public static JLabel titulo;
    
    public static JLabel descrip;
    
    public static JButton imagen1;
    
    public static JButton imagen2;
    
    public static JButton imagen3;
    
    public static JLabel nombre1;
    public static JLabel nombre2;
    public static JLabel nombre3;
    
    public static JLabel tablero;
    public static JLabel ronda;
    
    public static Button pista2;
    public static Button pista3;
    
    private JFXPanel efecto;
    private final JPanel contenedor;
   
    
    
    public Panel1(Interfaz ventana) {
        
        int red = 30;
        int green = 22;
        int blue = 100;
        float[] hsb = Color.RGBtoHSB(red, green, blue, null);
        float hue = hsb[0];
        float sat = hsb[1];
        float bri = hsb[2];
        
        
        this.setBackground(Color.getHSBColor(hue, sat, bri));
        this.ventana = ventana;
        this.setSize(1274, 980);
        setBorder(BorderFactory.createTitledBorder(" JUEGO EDUCATIVO "));
        setLayout(null);
        
        titulo = new JLabel(" Adivina Adivina");
        titulo.setBounds(480, 20, 300, 55);
        titulo.setBorder(BorderFactory.createEtchedBorder(Color.BLACK, Color.WHITE));
        Font f = new Font("bauhaus 93", Font.CENTER_BASELINE, 34);
        titulo.setFont(f);
        titulo.setOpaque(true);
        titulo.setBackground(Color.BLACK);
        titulo.setForeground(Color.WHITE);
        titulo.setHorizontalAlignment(JLabel.CENTER);
        
        
        descrip = new JLabel("Adivina cual de los siguientes cantantes es un salsero colombiano de Cartagena:\n");
        descrip.setOpaque(true);
        descrip.setHorizontalAlignment(JLabel.CENTER);
        descrip.setBounds(20, 95, 1232, 100);
        descrip.setBorder(BorderFactory.createEtchedBorder(Color.BLACK,Color.BLACK));
        descrip.setBackground(Color.WHITE);
        descrip.setForeground(Color.BLACK);
        
        ImageIcon icono = new ImageIcon("src/imagenes/c.jpg");
        ImageIcon ico = new ImageIcon(icono.getImage().getScaledInstance(265, 250, Image.SCALE_DEFAULT));
        imagen1 = new JButton(ico);
        imagen1.setBounds(10, 220, 265, 250);
        imagen1.setBackground(Color.DARK_GRAY);
        imagen1.setBorder(new CompoundBorder(new EmptyBorder(5, 5, 5, 5), new TitledBorder("")));
        
        Font f2 = new Font("bauhaus 93", Font.CENTER_BASELINE, 24);
        nombre1= new JLabel("Gilberto SantaRosa");
        nombre1.setFont(f2);
        nombre1.setBounds(10, 480, 265, 55);
        nombre1.setOpaque(true);
        nombre1.setBackground(Color.WHITE);
        nombre1.setBorder(BorderFactory.createEtchedBorder(Color.BLACK, Color.black));
        nombre1.setHorizontalAlignment(JLabel.CENTER);
        
        
        ImageIcon icono2 = new ImageIcon("src/imagenes/a.jpeg");
        ImageIcon ico2 = new ImageIcon(icono2.getImage().getScaledInstance(265, 250, Image.SCALE_DEFAULT));
        imagen2 = new JButton(ico2);
        imagen2.setBounds(280, 220, 265, 250);
        imagen2.setBackground(Color.DARK_GRAY);
        imagen2.setBorder(new CompoundBorder(new EmptyBorder(5, 5, 5, 5), new TitledBorder("")));
        

        nombre2= new JLabel("Joe Arroyo");
        nombre2.setFont(f2);
        nombre2.setBounds(280, 480, 265, 55);
        nombre2.setOpaque(true);
        nombre2.setBackground(Color.WHITE);
        nombre2.setBorder(BorderFactory.createEtchedBorder(Color.BLACK, Color.black));
        nombre2.setHorizontalAlignment(JLabel.CENTER);
          
        ImageIcon icono3 = new ImageIcon("src/imagenes/b.jpg");
        ImageIcon ico3 = new ImageIcon(icono3.getImage().getScaledInstance(265, 250, Image.SCALE_DEFAULT));
        imagen3 = new JButton(ico3);
        imagen3.setBounds(550, 220, 265, 250);
        imagen3.setBackground(Color.DARK_GRAY);
        imagen3.setBorder(new CompoundBorder(new EmptyBorder(5, 5, 5, 5), new TitledBorder("")));
       
        
        nombre3= new JLabel("Grupo Niche");
        nombre3.setFont(f2);
        nombre3.setBounds(550, 480, 265, 55);
        nombre3.setOpaque(true);
        nombre3.setBackground(Color.WHITE);
        nombre3.setBorder(BorderFactory.createEtchedBorder(Color.BLACK, Color.black));
        nombre3.setHorizontalAlignment(JLabel.CENTER);
        
        Font f1 = new Font("Tahoma", Font.CENTER_BASELINE, 35);
        Font f3 = new Font("Verdana", Font.CENTER_BASELINE, 25);
        ronda = new JLabel("NIVEL");
        ronda.setFont(f3);
        ronda.setForeground(Color.yellow);
        ronda.setBorder(BorderFactory.createEtchedBorder(10, Color.CYAN, Color.CYAN));
        ronda.setOpaque(true);
        ronda.setBounds(10, 580, 94, 55);
        ronda.setBackground(Color.BLACK);
        
        tablero = new JLabel("    1");
        tablero.setFont(f1);
        tablero.setForeground(Color.yellow);
        tablero.setOpaque(true);
        tablero.setBorder(BorderFactory.createEtchedBorder(10, Color.CYAN, Color.CYAN));
        tablero.setBounds(120, 580, 100, 55);
        tablero.setBackground(Color.BLACK);
     
        
        pista2 = new Button("AUDIO");
        pista2.setFont(f2);
        pista2.setForeground(Color.BLACK);
        pista2.setBounds(280, 580, 265, 55);
        pista2.setBackground(Color.ORANGE);
        
        
        pista3 = new Button("VIDEO");
        pista3.setFont(f2);
        pista3.setForeground(Color.BLACK);
        pista3.setBounds(550, 580, 265, 55);
        pista3.setBackground(Color.ORANGE);
        pista3.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent ae) {
                playPista();
                pista3.disable();
               }
        });
        
        iniciar();
        
        int red2 = 107;
        int green2 = 0;
        int blue2 = 20;
        float[] hsb2 = Color.RGBtoHSB(red2, green2, blue2, null);
        float hue2 = hsb2[0];
        float sat2 = hsb2[1];
        float bri2 = hsb2[2];
        
        contenedor = new JPanel();
        contenedor.setBounds(835, 220, 430, 313);
        contenedor.setBackground(Color.getHSBColor(hue2, sat2, bri2));
        contenedor.setBorder(BorderFactory.createTitledBorder("Pistas"));
        contenedor.add(efecto);
        contenedor.setLayout(null);
        contenedor.setVisible(true);
        
        add(contenedor);
        add(titulo);
        add(descrip);
        add(imagen1);
        add(nombre1);
        add(imagen2);
        add(nombre2);
        add(imagen3);
        add(nombre3);
        add(tablero);
        add(ronda);
        add(pista2);
        add(pista3);   
    }   
    
    private void iniciar(){
        efecto = new JFXPanel(); // se instancia el jfx panel para ser usado
        efecto.setSize(430,313);
        efecto.setLayout(null);
       
    }
    
    private void playPista(){
        
        Platform.runLater(new Runnable() {  //se crea el hilo de ejecucion para el video dentro del jfxpanel
            @Override
            public void run() {
                
                File a = new File("src/imagenes/video1.mp4"); // ruta del video
                MediaPlayer video = new MediaPlayer(new Media(a.toURI().toString())); //añade la url del video al reproductor
                
                efecto.setScene(new Scene( new Group( new MediaView(video)))); //se le añade la escena al jfxpanel
                
                video.setVolume(0.8);
                video.play();
                video.setStopTime(Duration.seconds(10));
            
            }   
            
        });    
    }
    
}
