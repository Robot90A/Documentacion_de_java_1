package poo;
//para heredar de otra clase se debe utilizar el "extends" y el nombre de la clase que quieres heredar 
public class Furgoneta extends Coche{

    private int capacidad_carga;
    private int plazas_extra;

    public Furgoneta(int capacidad_carga, int plazas_extra){

        super(); //llamar al constructor de la clase padre (en este caso es Coche)

        this.capacidad_carga = capacidad_carga;
        this.plazas_extra = plazas_extra;

    }

    public String DimeDatosFurgoneta(){

        return "La capacidad de carga es: " + capacidad_carga + " Y las plazas son: " + plazas_extra;
    }
    
}
