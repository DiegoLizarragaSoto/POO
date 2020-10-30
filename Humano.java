

public class Humano extends Ser{

String nivelmagico, dedicacion, squib;

    public  Humano(String nombre, String especie, String sexo, String estado , String dedicacion , String squib){
	
	 super(nombre,especie,sexo,estado);
	 this.dedicacion = dedicacion;
	 this.squib = squib;
	 
	 
	 }
	 
	 public String getDedicacion(){
	 return dedicacion;
	 }
	 
	 public String geSquib(){
	 return squib;
	 }
	 
}