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
    String opcion1;
    String opcion2;
    String opcion3;
    String opcion4;
    String respuesta;
    int puntaje;

    public Pregunta() {
        this.enunciado = "¿Que es java?";
        this.opcion1 = "Lenguaje de programacion";
        this.opcion2 = "Un café";
        this.opcion3 = "Nada";
        this.opcion4 = "Lo que sea";
        this.respuesta = "Lenguaje de programacion";
        this.puntaje = 100;
    }

    
    
    public String getEnunciado() {
        return enunciado;
    }

    public String getOpcion1() {
        return opcion1;
    }

    public String getOpcion2() {
        return opcion2;
    }

    public String getOpcion3() {
        return opcion3;
    }

    public String getOpcion4() {
        return opcion4;
    }

    public String getRespuesta() {
        return respuesta;
    }

    public int getPuntaje() {
        return puntaje;
    }
    
    
    
    
    
}
