/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Sofka;

import Connection.ConnectionFireBase;

/**
 *
 * @author Sebas
 */
public class Main {
        public static void main(String args[]) {
    
            try{
                ConnectionFireBase conectar = new ConnectionFireBase();
                conectar.conecction();
            }catch(Exception e){
                System.out.print("Error al conectar con FireBase");
            }
        
    }
}
