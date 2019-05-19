package vista;
import javax.swing.JFrame;

/**
 *
 * @author anima_000
 */
public class Interfaz extends JFrame{
    
    private final Panel1 panel;
    private final Panel2 panel2;
    private final Panel3 panel3;
    private final Panel4 panel4;
    private final panelPuntaje panel5;
    
    public Interfaz() {
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setBounds(280, 10, 1338, 700);
        this.setLocationRelativeTo(this);
        this.setResizable(false);
        setTitle("ADIVINA ADIVINA");
        setLayout(null);
        
        
        panel= new Panel1(this);
        this.add(panel);
        panel.setVisible(true);
        
        panel2= new Panel2(this);
        this.add(panel2);
        panel2.setVisible(false);
        
        panel3= new Panel3(this);
        this.add(panel3);
        panel3.setVisible(false);
        
        panel4= new Panel4(this);
        this.add(panel4);
        panel4.setVisible(false);
        
        panel5= new panelPuntaje(this);
        this.add(panel5);
        panel5.setVisible(true);
        
    }
    
    public void mostrarV(){
        panel.setVisible(true);
        panel2.setVisible(false);
        panel3.setVisible(false);
        panel4.setVisible(false);
    }
    
    public void mostrarV2(){
        panel.setVisible(false);
        panel2.setVisible(true);
        panel3.setVisible(false);
        panel4.setVisible(false);
    }
    
    public void mostrarV3(){
        panel.setVisible(false);
        panel2.setVisible(false);
        panel3.setVisible(true);
        panel4.setVisible(false);
    }
    
    public void mostrarV4(){
        panel.setVisible(false);
        panel2.setVisible(false);
        panel3.setVisible(false);
        panel4.setVisible(true);
    }
}
