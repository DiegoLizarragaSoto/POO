import java.util.*;
import java.util.Scanner;
import java.text.*;
 
public class Calificaciones   //MAIN
{
	public static void main(String[] ARGS)
	{
		Scanner obtener = new Scanner(System.in);
		int calif,i,notaMayor,notaMenor,nota,sumaNotas;
        String nombre;

        Scanner teclado = new Scanner(System.in);
        System.out.print("Introduzca Su Nombre: ");            //CAPTURAR NOMBRE 
        nombre = teclado.nextLine();
        System.out.println("Nombre:" + nombre + ".");
    
 
        
		System.out.print("Ingrese la Cantidad de calificaciones: ");
		calif = obtener.nextInt();                                //CANTIDAD DE CALIFICACIONES
 
		notaMayor = 0;
		notaMenor = 100;
		sumaNotas = 0;
 
 
		for(i = 1; i <= calif; i++)
		{
			System.out.print("Ingrese Calificacion: " + i + " : ");
			nota = obtener.nextInt();
 
			sumaNotas = sumaNotas + nota;
			if(nota > notaMayor)
			{
				notaMayor=nota;                                         //OPERACION PARA CALIFICACION MAS ALTA Y BAJA 
			}
			if(nota < notaMenor)
			{
				notaMenor=nota;
			}
		}
 
		System.out.print("La Calificacion Mas Alta es: " + notaMayor + "\n");     //IMPRIMIR LAS CALIFICAION MAS ALTA Y BAJA
		System.out.print("La Calificacion Mas Baja es: " + notaMenor + "\n");
	
 
		DecimalFormat df = new DecimalFormat("#.00");
 
		System.out.print("El promedio es: " + df.format((double)sumaNotas/calif) + "\n");   //OPERACION PARA REALIZAR EL PROMEDIO
	}
}