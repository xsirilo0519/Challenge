
package Class;

import Helpers.Capturar;
import java.util.LinkedList;

/**
 *
 * @author Sebas
 */
public class Ronda {
        
    int respuestaUser;
    Pregunta preguntaSelect;
    LinkedList<Pregunta> preguntas;
    int nivel;

    
    public Ronda(int nivel,LinkedList<Pregunta> ListaPreguntas) {
        this.preguntas= ListaPreguntas;
        this.nivel=nivel;
    }
    
    public void iniciar(){
        Pick();
        setRespuestaUser(Capturar.CapturarEntero("Nivel: "+this.nivel+"\n"+
               this.preguntaSelect.toString())-1);
        
    }
    
    private void Pick(){
        if(!getPreguntas().isEmpty()){
            int max = getPreguntas().size();
            int min = 0;
            int range = max - min;
            int rand = (int)(Math.random() * range) + min;
            setPreguntaSelect(getPreguntas().get(rand));
        } 
    }
    @Override 
    public String toString(){
    return "Nivel "+this.nivel;
    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }
    
    public int getRespuestaUser() {
        return respuestaUser;
    }

    public void setRespuestaUser(int respuestaUser) {
        this.respuestaUser = respuestaUser;
    }

    public void setPreguntaSelect(Pregunta preguntaSelect) {
        this.preguntaSelect = preguntaSelect;
    }
    
    
    
    public Pregunta getPreguntaSelect() {
        return preguntaSelect;
    }

    public LinkedList<Pregunta> getPreguntas() {
        return preguntas;
    }

    
    
}
