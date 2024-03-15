public class Arrays_ejercicios {

    public static void main (String[]args) {

        //suma de arreglos

        int suma = 0;
        int [] arreglos = new int[5];

        arreglos[0]=5;
        arreglos[1]=10;
        arreglos[2]=15;
        arreglos[3]=20;
        arreglos[4]=25;

        for (int i=0; i<arreglos.length; i++) {

            suma = suma + arreglos[i];
            

        }

        System.out.println("la suma de los arreglos es: " + suma);


    }

    
}

class Arrays_ejercico2 {

    public static void main (String[]args) {

        //promedio de arreglos

        int suma = 0;
        double promedio=0;
        
        int [] arreglos = new int[6];

        arreglos[0]=5;
        arreglos[1]=10;
        arreglos[2]=15;
        arreglos[3]=20;
        arreglos[4]=25;
        arreglos[5]=30;

        for (int i=0; i<arreglos.length; i++) {

            suma = suma + arreglos[i];
            
        }

        promedio = suma / (double) arreglos.length;
        
        System.out.println("el promedio de los arreglos es: " + promedio);
        

    }

    
}



