/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.util.ArrayList;

/**
 *
 * @author anima_000
 */
public class Modelo2 implements metodos { //implementa todos los metodos de la interface (Polimorfismo)
    private ArrayList<Jugador> jugadores = new ArrayList<Jugador>();

    public Modelo2() {
    }
    
    public Modelo2(ArrayList<Jugador> jugador ) {
        this.jugadores=jugador;
    }
    
    @Override
    public void imprimir() {
        if(jugadores != null){
            for (Jugador jug : jugadores){   //iterador para recorrer los objetos dentro del array list
                System.out.println("ACIERTOS"+"["+jug.getAciertos()+"]"+"  "+"ERRONEOS"+"["+jug.getErroneos()+"]"+"  "+"PORCENTAJE"+"["+jug.getPorcentaje()+"]"+"  "+"NOMBRE"+"["+jug.getNombre()+"]");
            }
        }
    }

    @Override
    public void insertar(Jugador j) {
       this.jugadores.add(j);
    }
    
}
