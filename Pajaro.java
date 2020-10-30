//Código de la clase Pajaro, subclase de la clase Datos
public class Pajaro extends Datos {

    //Campos específicos de la subclase.

    public String Especie;

    //Constructor de la subclase: incluimos como parámetros al menos los del constructor de la superclase

    public Pajaro (String nombre, String color, String habilidad) {

        super(nombre, color, habilidad);

        Especie = "Unknown";   } //Cierre del constructor

    //Métodos específicos de la subclase

    public void setEspecie (String Especie) { this.Especie = Especie;   }
    public String getEspecie () { return Especie;   }
    public void mostrar() {

       

        // Sí podemos acceder a variables de instancia a través de los métodos de acceso públicos de la superclase

        System.out.println ("\n Nombre del Pajaro: " + getNombre() +  "\n Color del Pajaro: " +  getColor() + "\n Su Habilidad es : " + getHabilidad() + "\n Su Especie es: " + getEspecie() ); }

} //Cierre de la clase