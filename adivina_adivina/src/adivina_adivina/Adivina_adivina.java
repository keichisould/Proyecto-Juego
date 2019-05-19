/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package adivina_adivina;

import vista.Interfaz;
import modelo.Modelo;
import control.Level1;
import control.Level2;
import control.Level3;
import control.Level4;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
/**
 *
 * @author anima_000
 */
public class Adivina_adivina {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args){
        // TODO code application logic here
        try{
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        }catch(Exception a){
            JOptionPane.showMessageDialog(null, a);
        }
       
        Interfaz inter = new Interfaz();
        Modelo modelo = new Modelo();
        Level1 a = new Level1(inter, modelo);
        Level2 b = new Level2(inter,modelo);
        Level3 c = new Level3(inter,modelo);
        Level4 d = new Level4(inter,modelo);
        inter.setVisible(true);
    }
    
}
