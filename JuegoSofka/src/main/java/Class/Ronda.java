
package Class;

import Helpers.Capturar;
import java.util.LinkedList;

/**
 *
 * @author Sebas
 */
public class Ronda {
        
    String respuestaUser;
    Pregunta preguntaSelect;
    LinkedList<Pregunta> preguntas;
    int nivel;

    public Ronda(int nivel) {
        this.preguntas= new LinkedList<Pregunta>();
        this.nivel=nivel;
    }
    
    public Ronda(int nivel,LinkedList<Pregunta> ListaPreguntas) {
        this.preguntas= ListaPreguntas;
        this.nivel=nivel;
    }
    
    public void iniciar(){
        Pick();
        Capturar.CapturarEntero("Nivel: "+this.nivel+"\n"+
               this.preguntaSelect.toString());
        
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
    
    public String getRespuestaUser() {
        return respuestaUser;
    }

    public void setRespuestaUser(String respuestaUser) {
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
