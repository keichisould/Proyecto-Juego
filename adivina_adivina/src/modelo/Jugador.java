/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author anima_000
 */
public class Jugador extends Persona { //herencia de variable "nombre" de la clase persona
  
    private String Aciertos;
    private String Erroneos;
    private String Porcentaje;

    public Jugador(String Aciertos, String Erroneos, String Porcentaje, String Nombre) {
        super(Nombre);
        this.Aciertos = Aciertos;
        this.Erroneos = Erroneos;
        this.Porcentaje = Porcentaje;
    }

    public String getAciertos() {
        return Aciertos;
    }

    public void setAciertos(String Aciertos) {
        this.Aciertos = Aciertos;
    }

    public String getErroneos() {
        return Erroneos;
    }

    public void setErroneos(String Erroneos) {
        this.Erroneos = Erroneos;
    }

    public String getPorcentaje() {
        return Porcentaje;
    }

    public void setPorcentaje(String Porcentaje) {
        this.Porcentaje = Porcentaje;
    }

    

}
