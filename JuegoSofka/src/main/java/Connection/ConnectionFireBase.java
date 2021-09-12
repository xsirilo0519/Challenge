/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Connection;

import Helpers.Capturar;
import com.google.auth.oauth2.GoogleCredentials;
import com.google.cloud.firestore.Firestore;
import com.google.firebase.FirebaseApp;
import com.google.firebase.FirebaseOptions;
import com.google.firebase.cloud.FirestoreClient;
import java.io.FileInputStream;


/**
 *
 * @author Sebas
 */
public class ConnectionFireBase {
    
    static Firestore db;
    public static void conecction() {
        try{
        FileInputStream serviceAccount =new FileInputStream("game-58.json");
        FirebaseOptions options = new FirebaseOptions.Builder()
                .setCredentials(GoogleCredentials.fromStream(serviceAccount))
                .build();

        FirebaseApp.initializeApp(options);
        
        db=FirestoreClient.getFirestore();
        }catch(Exception e){
            Capturar.MostrarMensaje("Problemas con la conexion:"+e.getMessage());
        }
    }

    public static Firestore getInstance() {
        return db;
    }
    
}
