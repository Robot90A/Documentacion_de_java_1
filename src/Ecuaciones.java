class ejemplo1 { 

    public static void main (String[] args) {

        short num1;
        short num2;
        num1=130;
        num2=320;
        double resultado; 
        resultado = num1 + num2;
        int finis = (int)resultado * 2;
        System.out.println("el resultado es de: " + finis);   
    }
}

class operadores { 

    public static void main (String[] args) {

        int a,b;
        double c;
        a = 7;
        b= 5;
        c = a*b; //valores aritmeticos + - * /
        //c++; //-------------incremento - esta desavilitado, habilatalo quitando en // antes de c
        System.out.print(c);
    }
}

class constantes { 

    public static void main (String[] args) {
        //utilizar el "final" para que el valor de la variable no cambie
        final double pulgadas = 2.54;
        double centimetros = 6;
        double resultado;
        resultado = centimetros / pulgadas;
        System.out.println("El valor de " + centimetros + " a pulgadas es: " + resultado);   
    }
}

class clase_math_sqrt { 

    public static void main (String [] args) {
        //utilar el "math.sqrt()" para sacar raiz cuadrada de una variable
        int numero = 5, numero2 = 4;
        double raiz;
        double resultado = numero+numero2;
        raiz = Math.sqrt(resultado);
        System.out.println("el resultado de la raiz cuadrada es: " + raiz);  
    }
}

class clase_math_round { 

    public static void main (String [] args) {
        //utilizar el "math.round()" para redondear una variable
        double valor1 = 13098, valor2 = 426;
        double divi = valor1 / valor2 ;
        double redondeo = Math.round(divi);
        System.out.println("el resultado de la operacion es: " + redondeo);
    }
}

class clase_math_pow { 

    public static void main (String [] args) {
        //utilizar el "math.pow()" para elevar un numero
        double base=5;
        double altura=3;
        int elevado = (int)Math.pow(base,altura); //el (int) en parecentesis no es necesario como tal
                                                  //la idea es mantener el valor en entero con el int
                                                  //ya que estoy utilizando un double que es un valor en 
                                                  //decimales.
        System.out.println("El resultado de la operacion es: " + elevado);
    }
}

class uso_String { 
    //cadena de caracterses con el String (para imprimir nombres o lo que tenga letras)

    public static void main (String[] args) {

        String mi_nombre ="Sebastian";
        System.out.println("Su nombre es " + mi_nombre); 
     
    }
}

class funciones_de_length { 
    //String sirve para imprimir nombre y guardarlos en una variables
    //tambien tiene doferentes funciones como:  

    public static void main (String[] args) {
    
        String name = "Sebastian";

        //imprime el nombre 
        System.out.println("mi nombre es: " + name);

        //imprime la cantidad de letras que tiene tu nombre 
        System.out.println("mi nombre tiene " + name.length() + " letras ");
        
        //imprime la primera letra que tiene tu nombre 
        System.out.println("La primera letra de mi nombre es: " + name.charAt(0)); //empieza de 0

        //para seleccionar la ultima letra de tu nombre en caso de que sea muy larga
        int ultima_letra = name.length();
        System.out.println("la ultima letra del nombre: " + name + " Es: " + name.charAt(ultima_letra-1));


    }
}

class funciones_de_length_2 { 
    

    public static void main (String[] args) {
        //usar el metodo substring para seleccionar cierta parte determinada de una frase o texto

        //crear una variabale string
        String frase ="hola luk, yo soy tu padre";

        //imprimir la parte del mensaje que quieres extraer
        String frase_resumen = frase.substring(0, 8);
        System.out.println(frase_resumen + " quiero ser tu mejor amigo" + " y tanbien conoci a " + 
        frase.substring(17, 25));

        //clase 12 del curso

    }
}

class funciones_de_length_3 { 
    

    public static void main (String[] args) {

        //compara 2 cadenas de caracterses, si son iguales devuelve "true" si son difrente devuelve 
        // "false" recordar que este metodo distingue entre mayusculas y minusculas

        String Profesor1 = "Alexander", Profesor2 = "alexander";
        System.out.println(Profesor1.equals(Profesor2));
        System.out.println("----------------------------------------------------------");
        
        //este metodo nos permite comparar las 2 sin necesidad de tomar en cuenta las mayusculas
        System.out.println(Profesor1.equalsIgnoreCase(Profesor2));  



        //clase 12 del curso
    }
}

class bucle_for { 
    

    public static void main (String[] args) { //imprimir mi nombre 10 veces

        // el ; se ultiliza para cerrar bloques, el i=0 es el primer bloque donde inicia el biclo
        //y el i<10 es el segundo bloque donde culmina el ciclo
        // el i++ es el incremento, en este caso le sumara de 1 en 1
        
        for (int i=0; i>10; i++) {

            System.out.println("Sebastian Ramirez"); 

            
        }
        
    }
}

class cronometro_minutos_segundos {

    public static void main (String[]args) {

        int segundos = 0;
        int minutos = 0;
        
        while (minutos < 15 ) {
               
            segundos = 0;

            while (segundos < 60) {

                segundos++;

                if ( segundos == 60) {

                    minutos++;

                }

                System.out.println("seconds: " + segundos + " minutes: " + minutos );

            }

        }


    }



}
































