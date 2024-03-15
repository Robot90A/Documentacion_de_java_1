package poo;
import javax.swing.*;

import java.awt.Toolkit;
import java.awt.event.*;
import java.util.*;
import javax.swing.Timer;

public class PruebaTemporizador {

    public static void main (String[]args){

        DamelaHora oyente = new DamelaHora();

        //ActionListener oyente = new DamelaHora();

        Timer miTemporizador = new Timer(5000, oyente);

        miTemporizador.start();

        JOptionPane.showMessageDialog(null, "Pulsa aceptar para detener");

        System.exit(0);

    }
    
}


class DamelaHora implements ActionListener{

    public void actionPerformed(ActionEvent e){

        Date ahora = new Date();

        System.out.println("Te pongo la hora cada 5 sg: " + ahora);

        Toolkit.getDefaultToolkit().beep();


    }

}

//mas informacion en el video 52 y 53 del curso


