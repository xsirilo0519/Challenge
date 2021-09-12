/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Helpers;

import Class.Juego;
import java.awt.BorderLayout;
import java.util.LinkedList;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;

/**
 *
 * @author Sebas
 */
public class TablaHistory extends JFrame{
    private String [] nom={"Nombre","Documento","Puntos","Estado","Max-Ronda"};
    private String [][] datos;
    public TablaHistory(LinkedList<Juego> Juegos){
        datos=new String [Juegos.size()][5];
    
        final int ronda=0;
        for(int i=0;i<Juegos.size();i++){
             datos[i][0]=Juegos.get(i).getJugador().getName();
             datos[i][1]=Integer.toString(Juegos.get(i).getJugador().getDocument());
             datos[i][2]=Integer.toString(Juegos.get(i).getAcumulado());
             datos[i][3]=Juegos.get(i).getEstado();
             datos[i][4]=Integer.toString(Juegos.get(i).getRonda());
        };
       
        
        setTitle("Histórico");
        setBounds(300,300,400,200);
        JTable tablaHistory=new JTable(datos,nom);
        add(new JScrollPane(tablaHistory),BorderLayout.CENTER);
    }

}
