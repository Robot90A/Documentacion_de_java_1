package poo;
import javax.swing.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.Timer;


import java.awt.Toolkit;

public class PruebaTemporizador2 {

    public static void main(String[]args){

        Relog mirelog = new Relog();
        mirelog.enMarcha(3000, true);
        JOptionPane.showMessageDialog(null, "Pulsa Acpetar Para Terminar");
        System.exit(0);

    }
    
}

class Relog{

    private int intervalo;
    private boolean sonido;

    public void enMarcha(int intervalo, final boolean sonido){

        class DamelaHora2 implements ActionListener{ //esto es una clase interna local "no lleva modificador de acceso"

            public void actionPerformed(ActionEvent e){
    
                Date ahora = new Date();
    
                System.out.println("Te pongo la hora cada 3 sg: " + ahora);
    
                if(sonido == true){
    
                    Toolkit.getDefaultToolkit().beep();
                }
    
    
            }
    
    
        }

        ActionListener oyente = new DamelaHora2();
        Timer miTemporizador = new Timer(intervalo, oyente);
        miTemporizador.start();

    }

}
