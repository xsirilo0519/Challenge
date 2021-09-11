/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Class;

import java.util.ArrayList;

/**
 *
 * @author Sebas
 */
public class Juego {

    double acumulado;
    String estado;
    Jugador jugador;
    ArrayList<Ronda> rondas = new ArrayList<Ronda>();
    
    public Juego(Jugador jugador) {
       this.jugador=jugador;
    }
    
    public void iniciar(){
    this.rondas.add(new Ronda());
    this.rondas.add(new Ronda());
    this.rondas.add(new Ronda());
    this.rondas.add(new Ronda());
    }

    public Jugador getJugador() {
        return jugador;
    }

    public void setJugador(Jugador jugador) {
        this.jugador = jugador;
    }
    
    
    
    public double getAcumulado() {
        return acumulado;
    }

    public void setAcumulado(double acumulado) {
        this.acumulado = acumulado;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public ArrayList<Ronda> getRondas() {
        return rondas;
    }

    public void setRondas(ArrayList<Ronda> rondas) {
        this.rondas = rondas;
    }

    

    
    
}
