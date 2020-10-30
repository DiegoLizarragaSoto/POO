
class Mago extends Humano{

   String varita, subespecie , habilidades, tipo, casa, sangre;
   public Mago(String nombre, String especie, String sexo, String estado, String dedicacion, String squib, String casa, String varita, String habilidades, String tipo){
   
   super(nombre,especie,sexo,estado,dedicacion,squib);
   this.casa = casa;
   this.varita = varita;
   this.habilidades = habilidades;
   this.tipo = tipo;
 
   
   
}

   public void imprimirInfo(){
    System.out.print("\n Nombre: " +nombre);
     System.out.print("\n Especie: " +especie);
	  System.out.print("\n Sexo: " +sexo);
	   System.out.print("\n Estado: " +estado);
	     System.out.print("\n Se Dededica a: " +dedicacion);
		  System.out.print("\n Es Squib: " +squib);
		   System.out.print("\n Vive en la Casa: " +casa);
			System.out.print("\n Tipo de Varita: " +varita);
			 System.out.print("\n Habilidad mas Fuerte: " +habilidades);
			   System.out.print("\n Tipo de Magia: " +tipo);
			    

}
}	     