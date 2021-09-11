/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Sofka;

import Class.Juego;
import Class.Jugador;
import Connection.ConnectionFireBase;
import static Connection.ConnectionFireBase.db;
import com.google.api.core.ApiFuture;
import com.google.cloud.firestore.CollectionReference;
import com.google.cloud.firestore.DocumentReference;
import com.google.cloud.firestore.DocumentSnapshot;
import com.google.cloud.firestore.QuerySnapshot;
import com.google.cloud.firestore.WriteResult;
import java.util.HashMap;
import java.util.LinkedList;
import javax.swing.JOptionPane;

/**
 *
 * @author Sebas
 */
public class Main {
        public static void main(String args[]) {
            
            /*Jugador jugador = new Jugador();
            
            Juego juego=new Juego(jugador);*/
            try{
            ConnectionFireBase.conecction();
            }catch(Exception e){
            
            }
            /*String uuid=java.util.UUID.randomUUID().toString();

            DocumentReference docref= ConnectionFireBase.db.collection("Juegos").document(uuid);
            ApiFuture<WriteResult> result =docref.set(juego.toMap());
            try{
            System.out.print(result.get().getUpdateTime());
            }catch(Exception e){}*/

            try{
                LinkedList<Juego> ListaJuegos = new LinkedList<Juego>();
                CollectionReference cnombres=ConnectionFireBase.db.collection("Juegos");
                ApiFuture<QuerySnapshot> query=cnombres.get();
                for(DocumentSnapshot document: query.get().getDocuments()){
                HashMap<String, Object> JugadorTm= (HashMap)document.get("Jugador");
                Juego juego1 = new Juego(new Jugador(JugadorTm.get("Name").toString(),Integer.parseInt(JugadorTm.get("Document").toString())));
                
                ListaJuegos.add(juego1);
                }
    
                for (int i=0; i<ListaJuegos.size();i++){
                    System.out.print("ff\n"+ListaJuegos.get(i).getJugador().getName());
                }
            }catch(Exception e){
                System.out.print(e.toString());
                
            }
            

    }
}
