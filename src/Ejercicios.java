class ejercicio  {

    //calcular las cantidad de casas que se pueden costruir en un lote si se conoce
    //los metros cuadrados del lote y los metros cuadrados de la casa

    public static void main (String[] args) {

        double metrosLote = 200;
        double metrosCasas = 50;
        double TotalCas = metrosLote / metrosCasas;
        int finish = (int)Math.round(TotalCas);
        System.out.println("El Total de casas que se pueden construir en el lote es: " + finish);

    }
}

class ejercicio2  {

    //calcular la cantidad de productos que se puede comprar una persona que ha ahorrado determinada 
    //cantidad de cuotas de un valor especifico si se conoce el valor unitario del producto

    public static void main (String[] args) {

        double ahorro = 250000;
        double produtos = 1200;
        double Total = ahorro / produtos;
        int Totalproducto = (int)Math.round(Total);
        System.out.println("La cantidad de productos que puede comprar es: " + Totalproducto);
    }
}

class ejercicio3  {

    //la altura maxima de un proyectil con movimiento parabolico esta dada por la formula: H=G*T²/8
    //donde g es la gravedad (9.8m/s2) y T es el tiempo. Realize un programa en lenguaje java 
    //que calcule el tiempo que se demora un proyectil en alcanzar la altura maxima que ingrese el 
    //usuario en metros.

    public static void main (String[] args) {

    double alturaMax = 250;
    final double gravedad = 9.8;
    double tiempo = alturaMax * 8 / gravedad;
    float raiz = (float)Math.sqrt(tiempo);
    System.out.println("El Tiempo que se tardo en alcanzar la altura Max es de: " + raiz + " Segundos");
        
    }
}

class ejercicio4 { 

    //un vendedor recibe un sueldo base mas un 7% extra por comision de sus ventas.
    //Realice un programa que indique el valor que recibira por comisiones y el total 
    //si se conoce las 3 ventas que hizo.

    public static void main (String[] args) {

        double venta1 = 13000 * 0.07, venta2 = 33500 * 0.07, venta3 = 18000 * 0.07;
        double suledoBase = 120500;
        double comisiones = venta1 + venta2 + venta3;
        double valorTotal = suledoBase + comisiones;
        System.out.println("El valor que recibira es : " + comisiones + " Por comisiones");
        System.out.println("---------------------------------------------------------");
        System.out.println("El vendedor recibira un salario total de $ " + valorTotal);
        System.out.println("---------------------------------------------------------");

    }
}

class ejercicio5 { 

    //calcular el valor a pagar por un vehiculo en un parqueadero si se ingresan la cantidad de minutos 
    //que estuvo y el valor de la hora. Aproximar las horas a un valor entero.

    public static void main (String[] args) {

        double Canminutos = 200;
        double valorHora = 17000;
        final double minutos = 60;
        double resul1 = Math.ceil(Canminutos / minutos) *  valorHora;
        System.out.println("El valor a pagar por el uso del parqueadero es: $ " + resul1);
          
    }
}

class condicionales { 
    //crear un programa que lea el mayor de 3 numeros ingresados

    public static void main (String[] args) {

        int num1 = 15, num2 = 13, num3 = 12;

        if (num1 > num2 && num1 > num3) {
            System.out.println("El numero " + num1 + " Es el mayor");

        } else if (num2 > num1 && num2 > num3) {
            System.out.println("El numero " + num2 + " Es el mayor");

        }else {
            System.out.println("El numero " + num3 + " Es el mayor");
        }
     
    }
}


class aprueba_o_no_aprueba { 

    //realizar un programa que calcule la definitiva de un estudiante si se ingresan las notas
    //del primer parcial, segundo parcial y examen final, indique si aprueba o no, y si no aprueba
    //decir si se puede habilitar o no
    

    public static void main (String[] args) {
        
        double nota1 = 3.4 * 0.30, nota2 = 4.2 * 0.30, examenFinal = 2.5 * 0.40;
        double definitiva = nota1 + nota2 + examenFinal;
        String Nombre = "Santiago";

        if ( nota1 <= 5 && nota2 <= 5 && examenFinal <= 5) {
            if (definitiva > 0 && definitiva <=5  ) {
                if (definitiva >= 3  ) {
                    System.out.println("----------------------------------------- ");
                    System.out.println("Aprobo: ");
                    System.out.println("----------------------------------------- ");
                    System.out.println("La nota definitiva de " + Nombre +  " es: " + definitiva );
                }else if (definitiva > 2.2 && definitiva < 3) {
                    System.out.println("----------------------------------------- ");
                    System.out.println("No aprobo: ");
                    System.out.println("------------------------------------------ ");
                    System.out.println("La nota definitiva de " + Nombre +  " es: " + definitiva );
                }else if ( definitiva < 2.2) {
                    System.out.println("----------------------------------------- ");
                    System.out.println("No aprobo: ");
                    System.out.println("------------------------------------------ ");
                    System.out.println("La nota definitiva de " + Nombre +  " es: " + definitiva );
                    System.out.println("------------------------------------------ ");
                    System.out.println("Debe cursar otra vez la asignatura");
                }

            }else {
                System.out.println("La nota definitiva debe estar entre 0 y 5");
            }

        }else {
            System.out.println("Error, las notas ingresadas deben ser menores a 5");
        }


    }
} 

class ejercicio7 { 
    //Una empresa regala un bono del 10 % del salario que se asigna al director que menos gane. 
    //Realice un programa que pida el salario de los 3 directores e indique cuál es el nombre de la
    //persona que obtiene el bono y cuánto dinero recibe en total. Los salarios no pueden ser negativos ni repetidos.

    public static void main (String[] args) {

        String director1 = "juan";
        String director2 = "miguel";
        String director3 = "Sebastian";
        double salario1 = 500500, salario2 = 620500, salario3 = 250000;
        double total;
        double TotalSal;
        final double porcentaje = 0.10;

        if (salario1 > 0 && salario2 > 0 && salario3 > 0) {
            if(salario1 != salario2 && salario1 != salario3 && salario2 != salario3) {
                if (salario1 < salario2 && salario1 < salario3) {
                    total = salario1 * porcentaje;
                    TotalSal = salario1 + total;
                    System.out.println("El Director " + director1 + " recibio un salario total de: $ " + TotalSal);

                } else if (salario2 < salario1 && salario2 < salario3) {
                    total = salario2 * porcentaje;
                    TotalSal = salario2 + total;
                    System.out.println("El Director " + director2 + " recibio un salario total de: $ " + TotalSal);

                }else {
                    total = salario3 * porcentaje;
                    TotalSal = salario3 + total;
                    System.out.println("El Director " + director3 + " recibio un salario total de: $ " + TotalSal);

                }

            }else {
                System.out.println("Error, los salarios no pueden ser iguales");
            }

        }else {
            System.out.println("Error, los salarios no pueden ser negativos");
        } 
    }
}

class ejercicio8 {
    //Una empresa dedicada a ofrecer banquetes define sus tarifas así: el costo de plato por
    //persona es de $9.500=. Pero si el número de personas es mayor a 50 y menor o igual a 80, el
    //costo es de $8.500=. Para más de 80 personas el costo por platillo es de $7.500=. Se requiere
    //un programa que ayude a determinar el presupuesto que se debe presentar a los clientes que
    //deseen realizar un evento si se conoce el número de personas a atender que debe ser una cantidad positiva. 

    public static void main (String[] args) {

        short CanClientes = 20;
        double Totalpaga;
        
        if (CanClientes > 0 && CanClientes <= 50 ) {
            Totalpaga = CanClientes * 9500;
            System.out.println("El presupuesto que se le debe presentar a los clientes es: $ " + Totalpaga);  
        } else if (CanClientes > 50 && CanClientes <= 80) {
            Totalpaga = CanClientes * 8500;
            System.out.println("El presupuesto que se le debe presentar a los clientes es: $ " + Totalpaga);
        }else if (CanClientes > 80) {
            Totalpaga = CanClientes * 7500;
            System.out.println("El presupuesto que se le debe presentar a los clientes es: $ " + Totalpaga);

        }else {
            System.out.println("Error, numero de persona no valido.");
        }
           
    }
}


class ejercicio9 {

    //Una medida de la obesidad se determina mediante el índice de masa corporal (IMC), que se calcula 
    //dividiendo los kilogramos de peso por el cuadrado de la estatura en metros. (IMC = peso / estatura2).
    //Realizar un programa que pida el peso y la estatura e indique la composición corporal obtenida por la persona.
    

    public static void main (String[] args) {

        double peso = 94.0;
        double base = 1.75;
        double cuadrado = 2;
        double estatura = (float)Math.pow(base, cuadrado);
        float IMC = (float)(peso / estatura);

        if (IMC > 0 && IMC < 18.5) {
            System.out.println("El Peso es inferior al normal: " + IMC);

        } else if (IMC >= 18.5 && IMC <= 24.9) {
            System.out.println("El peso es normal: " + IMC);

        }else if (IMC >= 25.0 && IMC <= 29.9) {
            System.out.println("El peso es superior al normal: " + IMC);

        }else if (IMC > 30.0) {
            System.out.println("Obesidad: " + IMC);
        }else {
            System.out.println("Error, no se puede ingresar variables negativas");
        }
           
    }
}

class ejercicio10 {
    //Pedir el nombre y el año de nacimiento de una persona e imprimir si es niño, adolescente
    //joven o adulto, según el rango de edades siguiente:
    //0 a 11 es niño, 12 a 17 es adolescente, 18 a 30 es joven, Mayor que 30 es adulto.
    
    public static void main (String[] args) {

        String name = "Sebastian";
        int edad = 2002;
        int year = 2023;
        int edadActual = year - edad;

        if (edadActual > 0 && edadActual <= 11) {
            System.out.println(name + " es un niño de " + edadActual + " años");

        }else if (edadActual >= 12 && edadActual <= 17) {
            System.out.println(name + " es un adolecente de " + edadActual + " años");

        }else if (edadActual >= 18 && edadActual <= 30) {
            System.out.println(name + " es un joven de " + edadActual + " años");

        }else if (edadActual > 30) {
            System.out.println(name + " es un adulto de " + edadActual + " años");

        }else {
            System.out.println("Error, la edad no se puede expresar en variables negativa");
        }
  
    }
}

class ejercicio11 {
    //Utilice una sentencia de selección múltiple para asignar en una variable el equivalente en 
    //letras respectivo al día de la semana, donde 1 es lunes hasta 7 que es domingo. Cualquier 
    //otro valor genera un mensaje de error.
    
    public static void main (String[] args) {

        int dia = 1;
        if (dia > 0 && dia < 8) {
            switch (dia) {
                case 1: System.out.println("Lunes"); break;
                case 2: System.out.println("Martes"); break;
                case 3: System.out.println("Miercoles"); break;
                case 4: System.out.println("Jueves"); break;
                case 5: System.out.println("Viernes"); break;
                case 6: System.out.println("Sabado"); break;
                case 7: System.out.println("Domingo"); break;
            }
        }else {
            System.out.println("Error, solo se permite un rango de entre 1 a 7");
        }
    }
}


class ejercicio12 {
    //El banco "BANK" ha decidido aumentar el límite de crédito de las tarjetas de crédito de sus 
    //clientes. Para esto considera que, si su cliente tiene tarjeta tipo 1, el aumento será de 25 %; si
    //tiene tipo 2, será de 35 %; si tiene tipo 3, de 40 %, y para cualquier otro tipo, de 50 %. Realice 
    //un programa para determinar el nuevo límite de crédito que tendrá una persona en su tarjeta si
    //se ingresan el nombre, el tipo de tarjeta y el valor actual del crédito que tiene. Si se ingresa un 
    //tipo incorrecto se debe generar un mensaje de error. Usar una sentencia múltiple para la solución.

    public static void main (String[] args) {

        String name = "Sebastian";
        int tipoTarjeta = 1;
        double credito = 500000;
        double porcentaje;
        double Totalcredito;

        if ( tipoTarjeta > 0 ) {

            switch (tipoTarjeta) {

                case 1: porcentaje = credito * 0.25;
                        Totalcredito = credito + porcentaje;
                        System.out.println(name + " tiene un nuevo limite de credito de: $ " + Totalcredito); break;

                case 2: porcentaje = credito * 0.35;
                        Totalcredito = credito + porcentaje;    
                        System.out.println(name + " tiene un nuevo limite de credito de: $ " + Totalcredito); break;

                case 3: porcentaje = credito * 0.40;
                        Totalcredito = credito + porcentaje;     
                        System.out.println(name + " tiene un nuevo limite de credito de: $ " + Totalcredito); break;

                default: porcentaje = credito * 0.50;
                         Totalcredito = credito + porcentaje;
                         System.out.println(name + " tiene un nuevo limite de credito de: $ " + Totalcredito); break;

            }
        } else {
            System.out.println("Error, Ingrese un tipo valido de tarjeta");
        } 
    }
}

class ejercicio13 { 
    //Haz una apliacion que calcule el area de un circulo(pi*R2).usa la constante de pi y el metodo
    //pow de math
    
    public static void main (String[] args) { 

        final double pi = 3.14159265359;
        int base = 2;
        double radio1 = 5.0;
        double radio2 = Math.pow(radio1, base);
        double Area = pi * radio2;

        System.out.println("El Area del circulo es: " + Area);

    }
}

class ejercicio14 { 
    //sumar todo los numeros pares del 1 al 20
    
    public static void main (String[] args) {

        int pares = 1;
        int i = 0;
        System.out.println("------------------------");

        while (pares < 21) {

            if (pares % 2 == 0) {
                System.out.println("Par: " + pares);

                if (pares % 2 == 0) {
                    i = pares + i;

                } 

            }
            pares++;
            
        } 
        System.out.println("------------------------");
        System.out.println("suma de los pares: " + i);
          
    }
}



















