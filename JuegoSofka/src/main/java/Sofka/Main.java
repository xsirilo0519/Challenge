/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Sofka;

import Class.Juego;
import Class.Jugador;
import Class.Ronda;
import Connection.ConnectionFireBase;
import Helpers.Capturar;
import Helpers.Data;
import Helpers.TablaHistory;
import java.util.LinkedList;
import javax.swing.JFrame;

/**
 *
 * @author Sebas
 */
public class Main {
        public static void main(String args[]) {
            
            int select;
            Juego juego;
            
            ConnectionFireBase.conecction();
            LinkedList<Ronda> ListRondas=Data.getRondas();
            Capturar.MostrarMensaje("Bievenido");
            do{
            select= Capturar.CapturarEntero("Ingrese un numero:\n "
            + "1 Iniciar Juego\n "
            + "2 Ver historico\n "
            + "0 Salir");
             
                if(select==1){
                    Jugador jugador = new Jugador();
                    juego=new Juego(jugador);
                    juego.setRondas(ListRondas);
                    juego.iniciar();
                    Data.Guardar(juego,ConnectionFireBase.getInstance());
                }else{
                    if(select==2){
                         int opc= Capturar.CapturarEntero("Esta opción cerrara el juego:\n "
                                +"¿Desea continuar?\n"
                                + "1 Si\n "
                                + "0 No");
                         if(opc==1){
                            Data.getJuego();
                            select=0;
                            TablaHistory tabla=new TablaHistory(Data.getJuego());
                            tabla.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                            tabla.setVisible(true);
                            tabla.toFront();
                            tabla.setAlwaysOnTop(true);
                            tabla.requestFocus();
                         }
                    }
                }

            }while(select!=0);
    }

}
