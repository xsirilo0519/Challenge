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

    public int getRespuesta() {
        return respuesta;
    }

    public void setRespuesta(int respuesta) {
        this.respuesta = respuesta;
    }
    
    @Override
    public String toString(){
        String opc="";
        for(int i=0;i<getOpcions().size();i++){
            opc=opc+"Opcion "+(i+1)+": "+getOpcions().get(i)+"\n";
        }
    return       "Pregunta: "+getEnunciado()+"\nIngrese el numero de la opcion correcta:\n"+opc+"\n";
    }

}
