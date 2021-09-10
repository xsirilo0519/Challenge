/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Sofka;

import Class.Juego;
import Class.Jugador;
import Connection.ConnectionFireBase;
import javax.swing.JOptionPane;

/**
 *
 * @author Sebas
 */
public class Main {
        public static void main(String args[]) {
            
            Jugador jugador = new Jugador();
            
            Juego juego=new Juego(jugador);
            
            juego.iniciar();
    }
}
