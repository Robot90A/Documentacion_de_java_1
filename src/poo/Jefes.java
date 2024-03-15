package poo;

public interface Jefes extends Trabajadores {
    
    //no es necesario establecer si el metodo sera publico o astracto (el programa java lo establece de forma predeterminada)

    String tomar_decisiones(String decision); //esta es la forma de declara un metodo dentro de una inferfaz
    
    
}
