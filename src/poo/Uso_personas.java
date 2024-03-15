package poo;
import java.util.Date;
import java.util.GregorianCalendar;
public class Uso_personas {

    public static void main (String[]args){

        Persona[] lasPersonas = new Persona[2];

        lasPersonas[0] = new Empleado2("Luis conde ", 50000, 2009, 02, 25);
        lasPersonas[1] = new Alumno("ana lopez", "Biologicas");

        for(Persona p: lasPersonas){

            System.out.println(p.dameNombre() + ", " + p.dameDescripcion());
        }

        
    }
    
}

abstract class Persona{ //se tiene que utilizar el metodo "abstract" para crear un metod abstracto

    private String nombre;

    public Persona(String nom){

        nombre = nom;

    }

    public String dameNombre(){

        return nombre;
    }

    public abstract String dameDescripcion(); //este se declaro como abstracto

}


class Empleado2 extends Persona{

    private String Nombre;
    private double Sueldo;
    private String Fecha_alta;
    private static int idSisguiente = 1;
    private int id;

    

    public Empleado2(String nom, double sue, int agno, int mes, int dia){ //primer constructor

        super(nom);
        sueldo=sue;
        GregorianCalendar calendario = new GregorianCalendar (agno, mes-1, dia);
        altaContrato=calendario.getTime();
        id = idSisguiente;
        idSisguiente++;

    }

    public String dameDescripcion(){

        return "Este Empleado tiene un id: " + id + " con un sueldo = " + sueldo; 

    }

    
    
    

    public double dameSueldo(){ //getter

        return sueldo;
    }

    public Date dameFechaContrato(){ //getter

        return altaContrato;
    }

    public void subSueldo(double porcentaje){ //setter

        double aumento=sueldo*porcentaje/100;
        sueldo+=aumento;
    }

    
    private double sueldo;
    private Date altaContrato;


}

class Alumno extends Persona{

    private String carrera;
    public Alumno(String nom, String car){

        super(nom);
        carrera = car;
    }

    public String dameDescripcion(){

        return "Este Alumno esta estudiando la carrera de " + carrera;
    }

}
