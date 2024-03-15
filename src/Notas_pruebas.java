import java.util.Date;
import java.util.Scanner;
public class Notas_pruebas{

    public static void main (String[]args){

        Scanner aprovacion = new Scanner (System.in);
        int i = 1;
        int s = 0, x = 0, z = 0;
        int N_Notas;
        int Notas;
        
        do{

            System.out.println("ingrese una cantidad de notas");
            N_Notas = aprovacion.nextInt();
            System.out.println("--------------------------------------------------");

            if(N_Notas != 0){

                while (i <= N_Notas){

                    System.out.println("ingrese las notas de los estudiantes: ");
                    Notas = aprovacion.nextInt();

                    if(Notas < 7){
                        s++;
                        
                    }else if(Notas == 7){
                        x++;

                    }else if(Notas > 7){
                        z++;
                        
                    }

                    i++;
                }

                System.out.println(s + " Estudiantes tienen notas menores a 7");
                System.out.println(x + " Estudiantes tienen notas iguales a 7");
                System.out.println(z + " Estudiantes tienen notas mayores a 7");
                i = 1;
                s = 0;
                x = 0;
                z = 0;
                System.out.println("--------------------------------------------------");

            }

        }while(N_Notas != 0);
        System.out.println("Programa terminado");

    }

}

class ejemplo{

    public static void main(String[]args){
        
        int i = 0;
        int[]Teclado = {1,2,3,4,5,6,7,8,9,10};

        while (i<Teclado.length) {

            System.out.println(Teclado[i]);
            i++;
            
        }

    }

}

class pruebaDate{

    public static void main (String[]args){
        
        int i = 1;
        Date hora = new Date();

        while (i > 0 && i<=10){

            System.out.println("Hora: " + hora);
            i++;
        }

    }
}


    

