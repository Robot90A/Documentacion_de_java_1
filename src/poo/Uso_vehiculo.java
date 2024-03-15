package poo;
//import javax.swing.JOptionPane;
public class Uso_vehiculo {

    public static void main (String[]args) {

        Coche miCoche1 = new Coche(); //INSTANCIAR UNA CLASE. EJEMPLAR CLASE
        miCoche1.establece_color("Rojo");
        System.out.println(miCoche1.dime_color());

        Furgoneta miFurgoneta1 = new Furgoneta(580, 7);
        System.out.println(miFurgoneta1.DimeDatosFurgoneta());

        miFurgoneta1.establece_color("Verde"); //furgoneta hereda todo de la clase coche
        System.out.println(miFurgoneta1.dime_color());

        miFurgoneta1.configura_asientos("si");
        System.out.println(miFurgoneta1.dime_asientos());

        miFurgoneta1.configira_climatizador("si");
        System.out.println(miFurgoneta1.dime_climatizador());
        
        System.out.println(miCoche1.dime_datos_generales());
        System.out.println(miFurgoneta1.dime_datos_generales() + " " + miFurgoneta1.DimeDatosFurgoneta());

        


    }

}
