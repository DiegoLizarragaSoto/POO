

public class Criaturas extends  Ser {

   String peligroso, habilidades, habitad;
   public Criaturas(String nombre , String especie , String sexo, String estado, String peligroso , String habitad){
      
	   super(nombre,especie,sexo,estado);
	   this.peligroso = peligroso;
	   this.habitad = habitad;
	   
	   }
	   
	   public void imprimirDeta(){
	    System.out.print("\n Nombre: " + nombre);
		 System.out.print("\n Tipo de Especie: " + especie);
		  System.out.print("\n Sexo: " + sexo);
		   System.out.print("\n Estado: " + estado);
		    System.out.print("\n Es peligroso? : " + peligroso);
		     System.out.print("\n Tipo de Habitad: " + habitad);
			}
}