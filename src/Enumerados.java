import java.util.Scanner;

public class Enumerados {

    //uso del tipo enumerado
    enum Talla {MINI, MEDIANO, GRANDE, MUY_GRANDE};

    public static void main (String[]args){

        Talla x = Talla.MINI;
        Talla L = Talla.MEDIANO;
        Talla s = Talla.GRANDE;
        Talla d = Talla.MUY_GRANDE;

    }
    
}

class Enumerados2{

    enum talla{

        mini("S"), mediano("M"), grande("L"), muy_grande("XL"); 

        private String abreviatura;

        private talla(String abreviatura){

            this.abreviatura = abreviatura;
        }

        public String dameabreviatura(){

            return abreviatura;
        }

    }

    public static void main(String[]args){

        Scanner entrada = new Scanner(System.in);

        System.out.println("Escribe una talla: \n: mini \n: mediano \n: grande \n: muy grande");
        String entrada_datos = entrada.next();  //toUpperCase sirve para pasar en mayuscula lo que el usuario escriba

        talla la_talla = Enum.valueOf(talla.class, entrada_datos);

        System.out.println("talla = " + la_talla);
        System.out.println("abrviatura = " + la_talla.dameabreviatura());

        
    }

    //para mas informacion: video 48 del curso


}
