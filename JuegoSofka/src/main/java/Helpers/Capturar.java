/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Helpers;

import javax.swing.JOptionPane;

/**
 *
 * @author Sebas
 */
public class Capturar {
   
    
    public static int CapturarEntero(String message){
    String value="";
    boolean aux=false;
    int Entero=0;
        do{    
            value=JOptionPane.showInputDialog(message);
            if(value == null || value.equals("")) {
                 JOptionPane.showMessageDialog(null, "Ingrese un valor");
            }else{    try{
               Entero=Integer.parseInt(value);
               aux=true;
            }catch(Exception e){
                JOptionPane.showMessageDialog(null, "Ingrese un numero");
            }}
        }while(!aux);
    return Entero ;
    }
   
    
    public static String CapturarString(String message){
    String value="";
    boolean aux=false;
    do{     
            value=JOptionPane.showInputDialog(message);
            if(value == null || value.equals("")) {
                 JOptionPane.showMessageDialog(null, "Ingrese un valor");
            }
    }while(!aux);
    return value;
    }
    
}
