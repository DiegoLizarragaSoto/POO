import java.util.*; 

public class Estudiante  {
    public static void main (String []args)      {
        List<Alumno> x = new ArrayList<Alumno>();     
        Scanner entradaTeclado = new Scanner(System.in);
        String respuesta;       
        int i=1;
        do{
            String calificacion="Reprobado";
            System.out.println("Registro de Alumnos \n");
            System.out.println("Seleccione una opcion:");
            System.out.println("1 - Registrar un alumno ");
            System.out.println("2 - Consultar un alumno ");
            System.out.println("3 - Modificar notas ");
            System.out.println("4 - Ver clase completa ");
            System.out.println("5 - Salir ");
            respuesta = entradaTeclado.next();           
            switch (respuesta){
                case "1":                 
                System.out.println("Nombre de alumno");
                String nombre = entradaTeclado.next();       
                System.out.println("Materia del alumno");
                String materia = entradaTeclado.next();
                System.out.println("Matricula del alumno");
                int matricula = entradaTeclado.nextInt();
                System.out.println("Nota del alumno");
                Double nota = entradaTeclado.nextDouble();               
                if (nota>=60){calificacion="Aprobado";
                }           
                Alumno p = new Alumno(i,nombre,materia,matricula,nota);
                p.setCalificacion(calificacion);
                x.add(p);               
                i++;       
                respuesta="0";               
                break;
                case "2":
                System.out.println("Introduce la id del alumno a consultar :");
                int id = entradaTeclado.nextInt();
                if (x.size()<id){System.out.println("Hay "+x.size()+" alumnos registrados");
                }else{System.out.println(x.get(id-1));}
                respuesta="0";
                break;
                case "3":
                System.out.println("Introduce la id del alumno a modificar :");
                id = entradaTeclado.nextInt();
                if (x.size()<id){System.out.println("Hay "+x.size()+" alumnos registrados");
                }else{
                    System.out.println(x.get(id-1));
                    System.out.println("Escribe la nueva nota");
                    Double nuevaNota=entradaTeclado.nextDouble();
                    if (nuevaNota>=60){calificacion="Aprobado";
                    }                                 
                    x.get(id-1).setNota(nuevaNota);
                    x.get(id-1).setCalificacion(calificacion);
                    System.out.println(x.get(id-1));
                }
                respuesta="0";
                break;
                case "4":
                System.out.println("Alumnos en la clase: \n"+x);
                respuesta="0";
                break;
                case "5":
                System.out.println("Adios");
                respuesta="1";
                break;
                default:
                System.out.println("Opción invalida.Debes elegir 1,2,3,4 ó 5");
                respuesta="0";
            }
        }while (respuesta=="0");     
    }
}


 