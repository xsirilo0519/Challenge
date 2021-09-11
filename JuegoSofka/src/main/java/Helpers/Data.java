/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Helpers;

import Class.Juego;
import Class.Jugador;
import Class.Pregunta;
import Class.Ronda;
import Connection.ConnectionFireBase;
import com.google.api.core.ApiFuture;
import com.google.cloud.firestore.CollectionReference;
import com.google.cloud.firestore.DocumentSnapshot;
import com.google.cloud.firestore.Firestore;
import com.google.cloud.firestore.QuerySnapshot;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author Sebas
 */
public class Data {
    
    public static LinkedList<Juego> getJuego(){
        
     LinkedList<Juego> ListaJuegos = new LinkedList<Juego>();
       try{
                CollectionReference cnombres=ConnectionFireBase.getInstance().collection("Juegos");
                ApiFuture<QuerySnapshot> query=cnombres.get();
                
                for(DocumentSnapshot document: query.get().getDocuments()){
                    HashMap<String, Object> JugadorTm= (HashMap)document.get("Jugador");
                    Juego juego1 = new Juego(new Jugador(JugadorTm.get("Name").toString(),Integer.parseInt(JugadorTm.get("Document").toString())));
                
                    ListaJuegos.add(juego1);
                }
    
                for (int i=0; i<ListaJuegos.size();i++){
                    System.out.print("ff\n"+ListaJuegos.get(i).getJugador().getName());
                }
                return ListaJuegos;
            }catch(Exception e){
                System.out.print(e.toString());
                return ListaJuegos;
                
            }
    }
    
    public static LinkedList<Ronda> getRondas(){
    LinkedList<Ronda> ListaRondas = new LinkedList<Ronda>();
       try{
               
                CollectionReference cnombres=ConnectionFireBase.getInstance().collection("Categorias");
                ApiFuture<QuerySnapshot> query=cnombres.get();
                
                for(DocumentSnapshot document: query.get().getDocuments()){
                    
                    List<HashMap> preguntas= (List<HashMap>)document.get("Preguntas");
                    int level=document.getLong("Nivel").intValue();
                    LinkedList<Pregunta> ListaP = new LinkedList<Pregunta>();
                     for(HashMap p: preguntas){
                         ListaP.add(new Pregunta(p.get("Enunciado").toString(),((Long)p.get("Puntos")).intValue(),((Long)p.get("Respuesta")).intValue(),(List<String>)p.get("Opciones")));
                     }
                    Ronda r = new Ronda(level,ListaP);
                    ListaRondas.add(r);
                }
    
                return ListaRondas;
            }catch(Exception e){
                System.out.print(e.toString());
                return ListaRondas;
            }
    }
    
}
