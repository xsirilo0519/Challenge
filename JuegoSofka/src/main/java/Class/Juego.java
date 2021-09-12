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
import java.util.stream.Collectors;

/**
 *
 * @author Sebas
 */
public class Juego extends Mapper{

    int acumulado=0;
    String estado="";
    Jugador jugador;
    int ronda=0;
    LinkedList<Ronda> rondas = new LinkedList<Ronda>();
    
    public Juego(Jugador jugador) {
       this.jugador=jugador;
    }

    public Juego() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public void iniciar(){
        int opcion;
        int i;
        this.estado="Jugando";
        Capturar.MostrarMensaje("Hola "+getJugador().getName()+"\n"
        +"Vamos a comenzar");
        for(i=0;i<5;i++){
            getRondas().get(i).Pick();  
        }
        for(i=1;i<6;i++){
            final int cont=i;
            Ronda rondaFiltrada=getRondas().stream().filter(r->r.getNivel()==cont).findFirst().orElse(null);
            if(rondaFiltrada!=null){
                
                rondaFiltrada.iniciar();
            
                if(rondaFiltrada.getRespuestaUser()==rondaFiltrada.getPreguntaSelect().getRespuesta()){
                    setAcumulado(this.getAcumulado()+rondaFiltrada.getPreguntaSelect().getPuntaje());
                    setRonda(rondaFiltrada.getNivel());
                    Capturar.MostrarMensaje("Respuesta correcta\n"
                    +"Su puntaje es: "+getAcumulado());
                    
                    if(rondaFiltrada.getNivel()!=5){
                        do{        
                            opcion=Capturar.CapturarEntero("Desea continuar o quiere retirarse:\n"
                                + "1 Continuar\n"
                                + "0 Retirarse");
                            
                        }while(!(opcion>=0 && opcion<=1));
                        if(opcion==0){
                            setEstado("Se retiró");
                            break;
                        }
                    }else{
                    setEstado("Ganó el juego");
                    Capturar.MostrarMensaje("Felicidades Ganó el Juego!");
                    }
                    
                }else{ 
                    setRonda(rondaFiltrada.getNivel());
                    setAcumulado(0);
                    setEstado("Perdió");
                    Capturar.MostrarMensaje("Respuesta incorrecta\n"
                    +"Su puntaje es: "+getAcumulado());
                    break;
                }
            }
        }
        Capturar.MostrarMensaje(Mensaje());  
    }

    public String Mensaje(){
    return getJugador().getName()+"\nUsted "+getEstado()
            +"\nSu puntaje fue: "+getAcumulado();
    }

    public int getRonda() {
        return ronda;
    }

    public void setRonda(int ronda) {
        this.ronda = ronda;
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
        Juego.put("Acumulado", this.getAcumulado());
        Juego.put("Estado", this.getEstado());
        Juego.put("Ronda", this.getRonda());
        Juego.put("Jugador", this.getJugador().toMap());
        Juego.put("Rondas", this.getRondas().stream().collect(Collectors.toMap(x->Integer.toString(x.getNivel()), x->x.toMap())));
        return Juego;
    }

    

    
    
}
