import java.util.*; //se importo la clase Scanner del paquete util

class entrada_salida_Scanner { 
    
    public static void main (String[] args) { 

        //se debe de crear primero un objeto de tipo Scanner
        Scanner entrada = new Scanner(System.in); //se creo un objeto de tipo Scanner

        System.out.println("introduce tu nombre de usuario, por favor");
        String Nombre = entrada.nextLine(); // el objejto "entrada" estara a la esperar para introducir un valor de tipo String y se guardara en "Nombre" 

        System.out.println("Introducir la edad, por favor ");
        int edad = entrada.nextInt(); // lo mismo pero con una vatiable con numeros enteros

        System.out.println(Nombre + " tiene una edad de "  + edad + " años " );

        //nextline = para texto
        //nextint = para numeros enteros
        // nexDouble = para numeros decimales

        //para mas informacion, consultar el capitulo 14 del curso

          
    }
}

class ejemploDos { 
    //Haz una apliacion con Scanner que calcule el area de un circulo(pi*R2).usa la constante de pi y el metodo
    //pow de math 
    public static void main (String[] args) { 
        
        final double pi = 3.14159265359;
        double potencia = 2;
        Scanner objeto1 = new Scanner(System.in);

        System.out.println("Ingrese el valor del radio ");
        double Radio = objeto1.nextDouble();

        double Radio2 = Math.pow(Radio, potencia);
        Double Area = pi * Radio2;
        System.out.println("El Area del Circulo es: " + Area);
 
    }
}

class ejemplo3 { 
    //Una empresa regala un bono del 10 % del salario que se asigna al director que menos gane. 
    //Realice un programa que pida el salario de los 3 directores e indique cuál es el nombre de la 
    //persona que obtiene el bono y cuánto dinero recibe en total. Los salarios no pueden ser negativos ni repetidos.
    public static void main (String[] args) { 

        double bono;
        double SalarioTotal;

        Scanner director = new Scanner (System.in);
        System.out.println("Ingrese el nombre del primero director");
        String director1 = director.nextLine();
        System.out.println("Ingrese el valor de su salario");
        double salario1 = director.nextDouble();
        director.nextLine();
        System.out.println("------------------------------------------------------------");
        System.out.println("Ingrese el nombre del segundo director");
        String director2 = director.nextLine();
        System.out.println("Ingrese el valor de su salario");
        double salario2 = director.nextDouble();
        director.nextLine();
        System.out.println("------------------------------------------------------------");
        System.out.println("Ingrese el nombre del tercer director");
        String director3 = director.nextLine();
        System.out.println("Ingrese el valor de su salario");
        double salario3 = director.nextDouble();
        director.nextLine();
        System.out.println("------------------------------------------------------------");
        
        if (salario1 > 0 && salario2 > 0 && salario3 > 0) {
            if (salario1 != salario2 && salario1 != salario3 && salario2 != salario3) {
                if (salario1 < salario2 && salario1 < salario3){
                    bono = salario1 * 0.10;
                    SalarioTotal = salario1 + bono;
                    System.out.println("El director " + director1 + " Gano un bono de $ " + bono );
                    System.out.println("----------------------------------------------------------");
                    System.out.println("El director " + director1 + " Tiene un salario total de $ " + SalarioTotal);
                    System.out.println("------------------------------------------------------------");

                } else if(salario2 < salario1 && salario2 < salario3) {
                    bono = salario2 * 0.10;
                    SalarioTotal = salario2 + bono;
                    System.out.println("El director " + director2 + " Gano un bono de $ " + bono );
                    System.out.println("----------------------------------------------------------");
                    System.out.println("El director " + director2 + " Tiene un salario total de $ " + SalarioTotal);
                    System.out.println("------------------------------------------------------------");

                } else {
                    bono = salario3 * 0.10;
                    SalarioTotal = salario2 + bono;
                    System.out.println("El director " + director3 + " Gano un bono de $ " + bono );
                    System.out.println("----------------------------------------------------------");
                    System.out.println("El director " + director3 + " Tiene un salario total de $ " + SalarioTotal);
                    System.out.println("------------------------------------------------------------");
                }

            } else {
                System.out.println("----------------------------------------------------------");
                System.out.println("Error, los salarios no pueden ser repetidos");
            }

        }else {
            System.out.println("----------------------------------------------------------");
            System.out.println("Error, Las cifras no pueden ser de un valor negativo");
        }

          
    }
}

class ejemplo4 {
    //menudo de opciones
    public static void main (String[] args) {

        Scanner Formas = new Scanner(System.in);
        System.out.println("Elige una opcion: \n1: Cuadrado \n2: Rectangulo \n3: Triangulo \n4: Circulo");
        int Figuras = Formas.nextInt();

        if (Figuras > 0 && Figuras < 5) {

            switch (Figuras) {

                case 1: 
                System.out.println("Introduce el lado: ");
                double lado = Formas.nextDouble();
                System.out.println("El area del cuadrado es: " + Math.pow(lado, 2)); break;

                case 2: 
                System.out.println("Introduce la base: ");
                double base = Formas.nextDouble();
                System.out.println("Introduce la altura: ");
                double altura = Formas.nextDouble();
                System.out.println("El area del Rectangulo es: " + (base * altura)); break;

                case 3: 
                System.out.println("Introduce la base: ");
                double base2 = Formas.nextDouble();
                System.out.println("Introduce la altura: ");
                double altura2 = Formas.nextDouble();
                System.out.println("El area del Triangulo es: " + (base2 * altura2)/2); break;

                case 4:
                System.out.println("Introduce el radio");
                double radio = Formas.nextDouble();
                System.out.print("El area del circulo es: ");
                System.out.printf("%1.2f", (Math.PI * (Math.pow(radio, 2)))); break;

            }

        }else {
            System.out.println("Error , la opcion no es correcta");
        }

    }
 
}

class Ciclo_do_while_1 { 

    public static void main (String[] args) {
        int Centi;
        double division;
        double num2;
        
        Scanner ciclo = new Scanner(System.in);
        System.out.println("Ingrese el primer numero");
        double num1 = ciclo.nextInt();
        do {
            System.out.println("ingrese el segundo numero");
            num2 = ciclo.nextInt();
            if (num2 != 0) { Centi = 0;
            }else {
                System.out.println("Error, el segundo numero debe ser diferente de 0");
                Centi = 1;
            }
        } while (Centi == 1);
            division = num1 / num2;
            System.out.println("El resultado de la division es: " + division);
             
    }
}

class Ciclo_do_while_2 { 
    //verificar si la contrase es correcta 
    public static void main (String[] args) {
        Scanner monitor = new Scanner(System.in);
        String clave = "Sebastian";
        System.out.println("introdusca la contraseña, por favor: ");
        String pass = monitor.nextLine();
        while (clave.equals(pass) == false) {//la opcion equals sirve para conparar si la clave es igual pass lo cual es falso
            System.out.println("Contrasela incorrecta, vuelva a ingresar la contraseña"); 
            pass = monitor.nextLine();

            if (clave.equals(pass) == false) {

            }
 
        }
        System.out.println("Contraseña correcta, Acceso permitido");
    }
}

class Ciclo_do_while_3 { 
    //imprimir numeros
    public static void main (String[] args) {
        
        Scanner limitado = new Scanner(System.in);
        System.out.println("ingrese le valor minimo");
        int minimo = limitado.nextInt();
        System.out.println("ingrese le valor maximo");
        int maximo = limitado.nextInt();

        if (minimo <= maximo) {
            while (minimo <= maximo) {
                System.out.println(": " + minimo);
                minimo ++;
            }
        } else {
            System.out.println("Error, el valor minimo debe ser inferior al maximo");
        }
          
    }
}

class adivina_numero_Ciclo_while { 
    
    public static void main (String[] args) {
        //juego: acierta un numero aleatorio que genere el programa
        int aleatorio = (int)(Math.random()*100); //el math.random() muestra numeros de 0 a 1 pero al multiplicarlos por 100, muestra de 0 a 100, el int lo convierte en un valor entero
        //System.out.println(aleatorio); //mostrar un numero aleatorio entre 0 y 100
        Scanner Contador = new Scanner (System.in);
        int instentos = 0;
        int valor1 = 0;
        
        while (valor1 != aleatorio) {
            instentos++;
            System.out.println("----------------");
            System.out.println("ingrese un valor");
            valor1 = Contador.nextInt();
            if (aleatorio < valor1) {
                System.out.println("----------------");
                System.out.println("Mas bajo");

            } else if (aleatorio > valor1) {
                System.out.println("----------------");
                System.out.println("Mas alto");
                
            }
            
        }
        System.out.println("----------------");
        System.out.println("Correcto. lo has conseguido con " + instentos + " intentos");
        
    }
}

class prueba_ciclo_while { 
    
    public static void main (String[] args) {
        double division;
        double num2 = 0;
        Scanner variable = new Scanner(System.in);
        System.out.println("ingrese el primer numero");
        double num1 = variable.nextDouble();

        while (num2 == 0) {
            System.out.println("ingrese el segundo numero");
            num2 = variable.nextDouble();
            if(num2 == 0) {
                System.out.println("-------------------------------------------------");
                System.out.println("Error, el segundo numero debe ser difernte de 0");
                System.out.println("-------------------------------------------------");
            }
            
        }
        division = num1 / num2;
        System.out.println("EL resultado de la division es: " + division); 

        //la clave del ciclo while es crear una variable que siempre sea falsa a la primera
        //despues la cambias cuando este dentro del ciclo para que de positiva 
        //y se acabe el ciclo :v recuerda este mensaje
        
    }
}

class adivina_numero_Ciclo_do_while { //con el ciclo do while
    
    public static void main (String[] args) {
        System.out.println("Encuentra el valor correcto");
        System.out.println("----------------------------");
        //juego: acierta un numero aleatorio que genere el programa
        int aleatorio = (int)(Math.random()*100); //el math.random() muestra numeros de 0 a 1 pero al multiplicarlos por 100, muestra de 0 a 100, el int lo convierte en un valor entero
        //System.out.println(aleatorio); //mostrar un numero aleatorio entre 0 y 100
        Scanner Contador = new Scanner (System.in);
        int instentos = 0;
        int valor1 = 0;
        
        do {
            instentos++;
            System.out.println("----------------");
            System.out.println("ingrese un valor");
            valor1 = Contador.nextInt();
            if (aleatorio < valor1) {
                System.out.println("----------------");
                System.out.println("Mas bajo");

            } else if (aleatorio > valor1) {
                System.out.println("----------------");
                System.out.println("Mas alto");
                
            }
            
        } while (valor1 != aleatorio);
        System.out.println("----------------");
        System.out.println("Correcto. lo has  conseguido con " + instentos + " intentos");

        // en el ciclo do_while primero se ejecuta el programa y luego se comprueba la condicion

        // en el ciclo while primero se comprueba la condicion y despues se ejecuta 
        
    }
}

class Ciclo_do_while_4 { 
    //tabla de multiplicacion 
    
    public static void main (String[] args) {
        
        int contador = 0;
        int multiplo;
        Scanner Tabla = new Scanner(System.in);
        System.out.println("Tabla de multiplicacion");
        System.out.println("----------------------------------------------------");
        System.out.println("Ingrese un numero para su respectiva tabla de multiplo");
        int variable = Tabla.nextInt();
        System.out.println("----------------------------------------------------");

        while (contador < 10) {
            contador ++;
            multiplo = variable * contador;
            System.out.println(variable + " X " + contador + " = " + multiplo);

            
        }
        System.out.println("----------------------------------------------------");  
          
    }
}

class Ciclo_do_while_5 { 
    //conversion de unidades
    
    public static void main (String[] args) {

        Scanner variables = new Scanner(System.in);
        int unidades, i;
        double Celsius, Fahrenheit, km, millas;
        
        do {
            System.out.println("Elige una opcion:");
            System.out.println("----------------------------------------");
            System.out.println("1: Convertir Grados Celsius a Fahrenheit \n2: Convertir grados Fahrenheit a Celsius \n3: Convertir kilometros a millas \n4: Convertir millas a kilometros");
            unidades = variables.nextInt();

            switch (unidades) {

                case 1: 
                System.out.println("Ingresar el valor de los grados Celsius");
                Celsius = variables.nextDouble();
                System.out.println(Celsius + " grados Celsius son " + ((1.8 * Celsius) + 32) + " grados Fahrenheit" ); break;

                case 2: 
                System.out.println("Ingresar el valor de grados Fahrenheit");
                Fahrenheit = variables.nextDouble();
                System.out.println(Fahrenheit + " grados Fahrenheit son " + ((Fahrenheit - 32) / 1.8) + " grados Celsius"); break;

                case 3: 
                System.out.println("ingresar el valor de los kilometros");
                km = variables.nextDouble();
                System.out.println(km + " Kilometros son: " + (km/1.60934) + " millas "); break;

                case 4:
                System.out.println("ingresar el valor de millas");
                millas = variables.nextDouble();
                System.out.println(millas + " millas son " + ((millas * 1.60934)/1) + " km "  ); break;
                
                default: System.out.println("Error, opcion no valida"); break;
                
            }
             System.out.println("----------------------------------------");
            System.out.println("Presione 0 si desea elegir otra opcion ");
            i = variables.nextInt();


        } while (i == 0);

    }
}

class JUEGO_DAODS {
    public static void main(String[]args){

        Scanner Cuadro = new Scanner(System.in);
        int valorDado, valorDado2;
        int sumaLados=0;
        String preguta;
        boolean  Desicion;

        System.out.println("LANZE LOS DADOS PARA JUGAR");
        System.out.println("------------------------------------------------");
        
    
        do{

            System.out.println("TIRE EL PRIMER DADO: ");
            valorDado = Cuadro.nextInt();

            while (valorDado < 1 || valorDado > 5) {

                System.out.println("Solo se pueden lanzar Dados de 5 lados");
                System.out.println("TIRE EL PRIMER DADO: ");
                valorDado = Cuadro.nextInt();
            }

            System.out.println("TIRE EL SEGUNDO DADO: ");
            valorDado2 = Cuadro.nextInt();
            

            while (valorDado2 < 1 || valorDado2 > 5) {

                System.out.println("Solo se pueden lanzar Dados de 5 lados");
                System.out.println("TIRE EL SEGUNDO DADO: ");
                valorDado2 = Cuadro.nextInt();
            }
            preguta = Cuadro.nextLine();

            sumaLados = valorDado + valorDado2;

            System.out.println("LA SUMA DE LOS LADOS DEL DADO ES: " + sumaLados); 
            System.out.println("---------------------------------------------");
            System.out.println("QUIERE REPETIR EL LANZAMIENTO DE LOS DADOS?: ");
            preguta = Cuadro.nextLine();

            if(preguta.equalsIgnoreCase("si")){

                Desicion = true;

            }else{

                Desicion = false;
            }


        }while(Desicion != false);
        System.out.println("-----------------------------------------------");
        System.out.println("GRACIAS POR JUGAR");
      
    }
}









