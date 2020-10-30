public class Alumno {
    private int idAlumno;
    private String nombre; 
    private String materia;
    private int matricula;
    private Double nota;
    private String calificacion;
    public Alumno(int idAlumno, String nombre,String materia,int matricula,Double nota) {
        this.idAlumno = idAlumno;   this.nombre = nombre;    this.materia = materia;
        this.matricula = matricula; this.nota = nota;}

    public void setNota(Double nota){this.nota=nota;}
    public void setCalificacion(String calificacion){this.calificacion=calificacion;}
    
    public String toString() { return "ID Alumno: "+idAlumno+" Nombre: "+nombre+" materia: "+materia+" matricula: "+matricula+" Nota: "+nota+"  "+calificacion+"\n";  }
  }