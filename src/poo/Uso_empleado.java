package poo;
import java.util.*;
public class Uso_empleado {

    public static void main (String[]args){

        jefatura jefe_RRHH = new jefatura("Juan", 55000, 2006, 9, 25);
        jefe_RRHH.estableceintentivo(2570);

        Empleado[]misEmpleados=new Empleado[6];
        misEmpleados[0]= new Empleado("Sebastian Ramirez", 85000, 1990, 12, 17);
        misEmpleados[1]= new Empleado("Miguel Angel", 95000, 1995, 06, 02);
        misEmpleados[2]= new Empleado("Michel muñoz", 105000, 2002, 03, 15);
        misEmpleados[3]=new Empleado("Antonio Fernandes");

        misEmpleados[4] = jefe_RRHH; //polimorfismo en accion. principio de sustitucion
        misEmpleados[5] = new jefatura("Maria", 95000, 1999, 5, 26);

        jefatura jefa_finanzas = (jefatura) misEmpleados[5];
        jefa_finanzas.estableceintentivo(55000);

        System.out.println(jefa_finanzas.tomar_decisiones("Dar mas dias de vacaiones a los empleados"));
        
        System.out.println("El Jefe " + jefa_finanzas.dameNombre() + " tiene un bonus de: " 
        + jefa_finanzas.establece_bonus(500));

        System.out.println(misEmpleados[3].dameNombre() + " tiene un bonus de: " 
        + misEmpleados[3].establece_bonus(200));

        

        for(int i=0; i<misEmpleados.length;i++){

            misEmpleados[i].subSueldo(5);
        }

        Arrays.sort(misEmpleados);

        for(int i=0; i<misEmpleados.length;i++){

            System.out.println("Nombre: " + misEmpleados[i].dameNombre()
            + " Suledo: " + misEmpleados[i].dameSueldo() + " Fecha de alta: " 
            + misEmpleados[i].dameFechaContrato());


        }

    }

}

class Empleado implements Comparable, Trabajadores{ //estamos incluyendo la intefaz comparable

    private String Nombre;
    private double Sueldo;
    private String Fecha_alta;

    public Empleado(String nom, double sue, int agno, int mes, int dia){ //primer constructor

        nombre=nom;
        sueldo=sue;
        GregorianCalendar calendario = new GregorianCalendar (agno, mes-1, dia);
        altaContrato=calendario.getTime();

    }

    public double establece_bonus(double gratificacion){
        
        return Trabajadores.bonus_base + gratificacion;
    }

    public Empleado(String nom){ //segundo Constructor

        this(nom, 30000, 2000, 01,01);

    }
    
    public String dameNombre(){ //getter

        return nombre;
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
    
    public int compareTo(Object miObject){ //creamos el setter de compareTo que nos pide el implement

        Empleado otroEmpleado = (Empleado)miObject; //se crea una refundicion
        if(this.sueldo < otroEmpleado.sueldo){

            return -1;
        }

        if(this.sueldo > otroEmpleado.sueldo){

            return 1;
        }

        return 0;

    }
    private String nombre;
    private double sueldo;
    private Date altaContrato;

    

}

class jefatura extends Empleado implements Jefes{ //final se utilizara para evitar que se cree otra herencia con jefatura

    public jefatura(String nom, double sue, int agno, int mes, int dia){ //porque la clase "Empleado" tiene parametros y no constructor

        super(nom, sue, agno, mes, dia); 
    }

    public String tomar_decisiones(String decision){

        return "un  miembro de la direccion a tomado la desicion de " + decision;
    }

    public double establece_bonus(double gratificacion){

        double prima = 2000;

        return Trabajadores.bonus_base + gratificacion + prima;
    }

    public void estableceintentivo(double b){

        incentivo = b;
    }
    public double dameSueldo(){

        double sueldojefe = super.dameSueldo();
        return sueldojefe + incentivo;
    }

    private double incentivo;

}


