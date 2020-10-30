//Código de AngryBirds

public class AngryBirds  {

    public static void main (String [ ] Args) {
		
		

        Pajaro Pajaro1 = new Pajaro ("RED", "Rojo", "Ninguno");

        Pajaro1.setEspecie("Cardenal");
		
		Pajaro Pajaro2 = new Pajaro ("Los Blues", "Azul", "Dividirse en 3");

        Pajaro2.setEspecie("Azulejo");
		
		Pajaro Pajaro3 = new Pajaro ("Hal", "Verde", "Efecto Bumeran");

        Pajaro3.setEspecie("Tucan");
		
		Pajaro Pajaro4 = new Pajaro ("Bomb", "Negro", "Explotar");

        Pajaro4.setEspecie("Cuervo");
		
		Pajaro Pajaro5 = new Pajaro ("Matilda", "Blanco", "Lanzar Un Huevo Explosivo");

        Pajaro5.setEspecie("Gallina");
		
		
        Pajaro1.mostrar();
		
	    Pajaro2.mostrar(); 
		
		Pajaro3.mostrar();
		
		Pajaro4.mostrar();
		
		Pajaro5.mostrar();}

} 

//Cierre de la clase