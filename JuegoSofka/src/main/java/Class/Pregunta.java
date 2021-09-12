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
    List<String> opciones;
    int respuesta;
    int puntaje;

    public Pregunta(String enunciado,int puntos,int respuesta,List<String> opciones) {
        this.enunciado = enunciado;
        this.opciones= opciones;
        this.respuesta = respuesta;
        this.puntaje = puntos;
    }
    
    public String getEnunciado() {
        return enunciado;
    }
    
    public int getPuntaje() {
        return puntaje;
    }

    public List<String> getOpciones() {
        return opciones;
    }

    public int getRespuesta() {
        return respuesta;
    }

    public void setRespuesta(int respuesta) {
        this.respuesta = respuesta;
    }
    
    @Override
    public String toString(){
        String opcionStr="";
        for(int i=0;i<getOpciones().size();i++){
            opcionStr=opcionStr+"Opcion "+(i+1)+": "+getOpciones().get(i)+"\n";
        }
    return       "Pregunta: "+getEnunciado()+"\nIngrese el numero de la opcion correcta:\n"+opcionStr+"\n";
    }

}
