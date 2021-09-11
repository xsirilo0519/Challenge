
package Class;

/**
 *
 * @author Sebas
 */
public class Ronda {
        
    String respuestaUser;
    Pregunta pregunta;

    public Ronda() {
        
        this.pregunta = new Pregunta();
    }
    
        
    public String getRespuestaUser() {
        return respuestaUser;
    }

    public void setRespuestaUser(String respuestaUser) {
        this.respuestaUser = respuestaUser;
    }

    public Pregunta getPregunta() {
        return pregunta;
    }
    
}
