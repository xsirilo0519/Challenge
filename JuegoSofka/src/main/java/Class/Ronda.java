
package Class;

import Helpers.Capturar;
import Helpers.Mapper;
import java.util.HashMap;
import java.util.LinkedList;

/**
 *
 * @author Sebas
 */
public class Ronda extends Mapper {
        
    int respuestaUser=100;
    Pregunta preguntaSelect;
    LinkedList<Pregunta> preguntas;
    int nivel=0;
    
    public Ronda(int nivel,Pregunta preguntaSelect ,int respuestaUser) {
        this.preguntaSelect= preguntaSelect;
        this.nivel=nivel;
        this.respuestaUser=respuestaUser;
    }
    
    public Ronda(int nivel,LinkedList<Pregunta> ListaPreguntas) {
        this.preguntas= ListaPreguntas;
        this.nivel=nivel;
    }
    
    public void iniciar(){
        setRespuestaUser(Capturar.CapturarEntero("Nivel: "+getNivel()+"\n"+
               this.preguntaSelect.toString())-1);
    }
    
    public void Pick(){
        if(!getPreguntas().isEmpty()){
            int rand = (int)(Math.random() * getPreguntas().size());
            setPreguntaSelect(getPreguntas().get(rand));
            setRespuestaUser(100);
        } 
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
    
    @Override
    public HashMap toMap() {
        HashMap<String, Object> Rondas= new HashMap<>();
        Rondas.put("Nivel", this.getNivel());
        Rondas.put("RespuestaUser", this.getRespuestaUser());
        Rondas.put("PreguntaSelect", this.getPreguntaSelect().toMap());
        return Rondas;
    }

}
