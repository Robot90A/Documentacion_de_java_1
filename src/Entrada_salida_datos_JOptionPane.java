
import javax.swing.*; //se importo la clase JOptionsPane del paquete javax,swing

public class Entrada_salida_datos_JOptionPane {

    public static void main (String[] args) {

        String Nombre = JOptionPane.showInputDialog("introduce tu nombre, por favor");

        String edad = JOptionPane.showInputDialog("introducir la edad, por favor"); 
        //la edad no la reconoce como un valor numerico, sino como texto, hay que convertirlo a entero
        //con la clase "integer"

        int edad_usuario = Integer.parseInt(edad); // aqui ya se convirtio en un valor entero

        // si se quiere convertir a un valor decimal se puede usar el "Double.parseDoble()"

        JOptionPane.showMessageDialog(null, Nombre + " tiene una edad de " + edad_usuario + " años ");

        //para mas informacion mirar el capitulo 15 del curso
        
          
    }
 
}


class ejercio2 {
    //Haz una apliacion que calcule el area de un circulo(pi*R2). el radio se pedira por teclado
    //(recuerda pasar de String a double con Double.paseDouble). usa la constante de pi y el metodo
    //pow de math

    public static void main (String[] args) {

        final double pi = 3.14159265359;
        double elevado = 2;
        
        String radio = JOptionPane.showInputDialog("Ingresar el valor del radio");
        double radio2 = Double.parseDouble(radio);
        double potencia = Math.pow(radio2, elevado);

        double Area = pi * potencia;
        JOptionPane.showMessageDialog(null, "el Area del Circulo es: " + Area);

    }
 
}

class ejercio3 {
    

    public static void main (String[] args) {
        String genero ="";

        do {
            genero = JOptionPane.showInputDialog("Introduce tu genero (H/M) ");

        } while (genero.equalsIgnoreCase("H")==false && genero.equalsIgnoreCase("M")==false);
        
        int altura = Integer.parseInt(JOptionPane.showInputDialog("introduce tu altura en cm"));
        int peso = 0;

        if(genero.equalsIgnoreCase("H")) {
            peso = altura - 110;

        } else if (genero.equalsIgnoreCase("M")) {
            peso = altura - 120;
            
        }
        JOptionPane.showMessageDialog(null,"Tu peso ideal es de: " + peso);
        

    }
 
}

class bucle_for_2 { 
    //comprobar si tiene el @ o no
    
    public static void main (String[] args) { 

        int arroba = 0;
        boolean punto = false;

        String mail = JOptionPane.showInputDialog("imgrese su gmail");

        for (int i = 0; i<mail.length(); i++){

            if (mail.charAt(i)=='@') {

                arroba++;

            }
            if (mail.charAt(i)=='.'){
                punto = true;
            }

        }
        if (arroba == 1 && punto == true) {
            System.out.println("es correcto");

        }else {
            System.out.println("no es correcto");
        }

        //por si algo, volver a ver el cap 21 del curso

        
    }
}

class bucle_for_3 {
    //imprimir el factorial de un numero

    public static void main (String[] args) {

        long resultado = 1L;
        int numero = Integer.parseInt(JOptionPane.showInputDialog("ingresar un numero "));

        for (int i = numero; i > 0; i-- ) {

            resultado = resultado *i;
        
        }
        System.out.println("El factorial de " + numero + " Es " + resultado);


    }
 
}










