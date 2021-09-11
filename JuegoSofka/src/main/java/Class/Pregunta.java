/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Class;

import java.util.List;

/**
 *
 * @author Sebas
 */
public class Pregunta {
    
    String enunciado;
    List<String> opcions;
    int respuesta;
    int puntaje;

    public Pregunta(String enunciado,int puntos,int respuesta,List<String> opcions) {
        this.enunciado = enunciado;
        this.opcions= opcions;
        this.respuesta = respuesta;
        this.puntaje = puntos;
    }

    
    
    public String getEnunciado() {
        return enunciado;
    }

    
    public int getPuntaje() {
        return puntaje;
    }

    public List<String> getOpcions() {
        return opcions;
    }
    
    @Override
    public String toString(){
    return getEnunciado()+"\n"+getOpcions().toString()+"\n";
    }
    
    
    
    
    
    
    
}
