/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Class;

/**
 *
 * @author Sebas
 */
public class Pregunta {
    
    String enunciado;
    String[] opcions;
    String respuesta;
    int puntaje;

    public Pregunta() {
        this.enunciado = "¿Que es java?";
        this.opcions= new String[4];
        this.respuesta = "Lenguaje de programacion";
        this.puntaje = 100;
    }

    
    
    public String getEnunciado() {
        return enunciado;
    }


    public String getRespuesta() {
        return respuesta;
    }

    public int getPuntaje() {
        return puntaje;
    }
    
    
    
    
    
}
