/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Class;

import Helpers.Capturar;
import Helpers.Mapper;
import java.util.HashMap;
import java.util.LinkedList;

/**
 *
 * @author Sebas
 */
public class Juego extends Mapper{

    int acumulado=0;
    String estado;
    Jugador jugador;
    LinkedList<Ronda> rondas = new LinkedList<Ronda>();
    
    public Juego(Jugador jugador) {
       this.jugador=jugador;
    }

    public Juego() {
       ; //To change body of generated methods, choose Tools | Templates.
    }
    
    public void iniciar(){
        this.estado="Jugando";
        Capturar.MostrarMensaje("Hola "+getJugador().getName()+"\n"
        +"Vamos a comenzar");
      
        for(int i=1;i<3;i++){
            final int cont=i;
            Ronda h=rondas.stream().filter(r->r.nivel==cont).findFirst().orElse(null);
            if(h!=null){
                
                h.iniciar();
            
                if(h.getRespuestaUser()==h.getPreguntaSelect().getRespuesta()){
                    setAcumulado(this.getAcumulado()+h.getPreguntaSelect().getPuntaje());
                    Capturar.MostrarMensaje("Respuesta correcta\n"
                    +"Su puntaje es: "+getAcumulado());
                }else{ 
                    setAcumulado(0);
                    this.setEstado("Perdio");
                    Capturar.MostrarMensaje("Respuesta incorrecta\n"
                    +"Su puntaje es: "+getAcumulado());
                }
            }
        }
    }

    public Jugador getJugador() {
        return jugador;
    }

    public void setJugador(Jugador jugador) {
        this.jugador = jugador;
    }
    
    
    
    public int getAcumulado() {
        return acumulado;
    }

    public void setAcumulado(int acumulado) {
        this.acumulado = acumulado;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public LinkedList<Ronda> getRondas() {
        return rondas;
    }

    public void setRondas(LinkedList<Ronda> rondas) {
        this.rondas = rondas;
    }
    
    

    @Override
    public HashMap toMap() {
        HashMap<String, Object> Juego= new HashMap<>();
        Juego.put("Acumulado", this.acumulado);
        Juego.put("Estado", this.estado);
        Juego.put("Jugador", this.jugador.toMap());
        return Juego;
    }

    

    
    
}
