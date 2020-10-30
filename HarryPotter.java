

public class HarryPotter{
  
  public static void main (String[] args){
     
	 Mago Harry = new Mago("Harry Potter","Humano","Masculino","Vivo","Estudiante","No","Gryffindor","Acebo Pluma de Fenix","Magia sin varita.","Blanca");
	 Criaturas Dobby = new Criaturas("Dobby","Elfo","Masculino","Vivo","No","Bosque");
	 Mago Hermione = new Mago("Hermione","Humano","Femenino","Vivo","Estudiante","No","Griffindor","Fibra de Corazon","Magia no Verbal","Blanca");
	 
	 
	 Harry.imprimirInfo();
	 System.out.print("\n");
	 Dobby.imprimirDeta();
	 System.out.print("\n");
	 Hermione.imprimirInfo();
	
	
	
	}
}