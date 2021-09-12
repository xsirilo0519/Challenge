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
    String valor="";
    boolean aux=false;
    int Entero=0;
        do{    
            valor=JOptionPane.showInputDialog(null,message,"Juego",JOptionPane.QUESTION_MESSAGE);
            if(valor == null || valor.equals("")) {
                 JOptionPane.showMessageDialog(null, "Ingrese un valor","Juego",0);
            }else{    try{
               Entero=Integer.parseInt(valor);
               aux=true;
            }catch(Exception e){
                JOptionPane.showMessageDialog(null, "Ingrese un numero","Juego",0);
            }}
        }while(!aux);
    return Entero ;
    }
   
    
    public static String CapturarString(String message){
    String valor="";
    boolean aux=false;
        do{     
            valor=JOptionPane.showInputDialog(null,message,"Juego",JOptionPane.QUESTION_MESSAGE);
            if(valor == null || valor.equals("")) {
                 JOptionPane.showMessageDialog(null, "Ingrese un valor","Juego",0);
            }else{aux=true;}
        }while(!aux);
    return valor;
    }
    
     public static void MostrarMensaje(String message){

        JOptionPane.showMessageDialog(null, message,"Juego",1);

    }
    
}
