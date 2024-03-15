import javax.swing.*;
class Arrays { 
    
    public static void main (String[] args) { 
        //metodo 1
        int [] Mi_matriz = new int[5]; //el 5 es la cantidad de valores que hay dentro de la variable "Mi_matriz"

        Mi_matriz[0]=5;
        Mi_matriz[1]=38;
        Mi_matriz[2]=15;
        Mi_matriz[3]=92;
        Mi_matriz[4]=71;

        System.out.println(Mi_matriz[3]); // en el [] puedes seleccionar la posicion de la matriz
        System.out.println(Mi_matriz[2]);
        System.out.println(Mi_matriz[1]);
        System.out.println(Mi_matriz[4]);
        System.out.println(Mi_matriz[0]);

    }
}

class arrays_bucle_for { 

    public static void main (String[] args) { 
        //metodo 1
        //metodo con for para imprimir varias matrices

        int [] Mi_matriz = new int[5]; 
        Mi_matriz[0]=5;
        Mi_matriz[1]=38;
        Mi_matriz[2]=15;
        Mi_matriz[3]=92;
        Mi_matriz[4]=71;

        for (int i=0; i<5; i++ ) {

            System.out.println("valor de la posicion de: " + i  + " = " +  Mi_matriz[i]);

        }

    }
}

class arrays_bucle_for_metodo2 { 
    
    public static void main (String[] args) { 
        //metodo 2

        int [] Mi_matriz = {5, 38, 15, 92, 71};

        for (int i=0; i<5; i++ ) {

            System.out.println("valor de la posicion de: " + i  + " = " +  Mi_matriz[i]);

        }

    }
}

class arrays_bucle_for_ejemplo2 { 
    
    public static void main (String[] args) { 

        //metodo para cuando no se sepa el limite de matrices que hay
        int [] Mi_matriz = {5, 38, 15,92, 71, 95, 85, 65, 25, 14, 78};

        for (int i=0; i < Mi_matriz.length; i++ ) {

            System.out.println("valor de la posicion de: " + i  + " = " +  Mi_matriz[i]);

        }

    }
}

class arrays_bucle_for_each { 

    //utilizamos el bucle for each
    
    public static void main (String[] args) { 

        String [] paises = new String[8];

        //String [] paises = {"Colombia", "España", "Mexico"...} de la otra forma simplificada

        paises[0]="Colombia";
        paises[1]="España";
        paises[2]="Mexico";
        paises[3]="Francia";
        paises[4]="Inglaterra";
        paises[5]="Brasil";
        paises[6]="Canada";
        paises[7]="Uruguay";

        //bucle for each

        for (String elemento: paises ) { //se debe de crear una variable que sea igual al del array

            System.out.println("Paises: " + elemento); //la variable "paises" se guarda en "elemento"


        }

    }
}

class arrays_bucle_for_each_ejemplo2 { 

    //utilizamos el bucle for each con la funcion JOptionPane
    
    public static void main (String[] args) { 

        String [] paises = new String[8];

        for (int i=0; i<8; i++) {

            paises[i] = JOptionPane.showInputDialog("Introduce un pais: " + (i+1));
            //el (i+1) es para que el programa me vaya diciendo el numero de paises tipo 1,2 o 3...


        }
        for (String elemento: paises ) { 

            System.out.println("Paises: " + elemento); 


        }

    }
}

class arrays_ejemplo3 { 

    //generar numeros aleatorios con matrices

    public static void main (String[] args) { 

        int [] matriz_aleatorio = new int[150];

        for (int i = 0; i < matriz_aleatorio.length; i++) {

            matriz_aleatorio[i]=(int)Math.round(Math.random()*100); //generar numeros aleatorios
        }
        
        for (int numero: matriz_aleatorio){
            System.out.println("numero: " + numero);
        }

        

    }
}

class arrays_bidimensionales { 

    public static void main (String[] args) { 

        int [][] matrix = new int[4][5];

        matrix[0][0]=15;
        matrix[0][1]=21;
        matrix[0][2]=18;
        matrix[0][3]=9;
        matrix[0][4]=15;

        matrix[1][0]=10;
        matrix[1][1]=52;
        matrix[1][2]=17;
        matrix[1][3]=19;
        matrix[1][4]=7;

        matrix[2][0]=19;
        matrix[2][1]=2;
        matrix[2][2]=19;
        matrix[2][3]=17;
        matrix[2][4]=7;

        matrix[3][0]=92;
        matrix[3][1]=13;
        matrix[3][2]=13;
        matrix[3][3]=32;
        matrix[3][4]=41;

        int a;

        for (int i = 0; i<4; i ++) {

            System.out.println();

            for (a = 0; a<5; a++) {
                
                System.out.print(matrix[i][a] + " ");
            }

            //para entenderlo, mirar el video 25 del curso
        }

    }
}

class arrays_bidimensionales_ejermplo2 {

    public static void main (String[]arsgs) {

        int [][] matrix = {

         { 10,15,18,19,21},
         { 5,25,37,41,15},
         { 7,19,32,14,90},
         { 85,2,7,40,27}

        };

        for (int i = 0; i<4; i ++) {

            System.out.println();

            for (int a = 0; a<5; a++) {

                System.out.print(matrix[i][a] + " ");


            }


        }

    }

}

class arrays_bidimensional_for_each {

    public static void main (String[]args) {

        int [][] matrix = {

         { 10,15,18,19,21},
         { 5,25,37,41,15},
         { 7,19,32,14,90},
         { 85,2,7,40,27}

        };

        for (int[]fila: matrix) {

            System.out.println();

            for (int z: fila) {

                System.out.print(z + " ");
            }
        }


    }

}

class Ejemplo_array_2Dimensiones {

    public static void main (String[]args) {

        double acumulado;
        double interes=0.10;

        double [][] saldo = new double[6][5];

        for (int i = 0; i<6; i++) {

            saldo[i][0]=10000;
            
            acumulado=10000;

            for (int j=1; j<5; j++) {

                acumulado = acumulado+(acumulado*interes);

                saldo[i][j]=acumulado;


            }  

            interes=interes+0.01;
        }

            for (int z=0; z<6; z++){

                System.out.println();

                for (int h=0; h<5; h++) {

                    System.out.printf("%1.2f", saldo[z][h]);

                    System.out.print(" ");
                }

            }
    }

    //mas informacion, en el video 26 del curso


}
