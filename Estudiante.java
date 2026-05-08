/*import tp2.Persona;*/

public class Estudiante extends Persona implements MiembroU{
    private String carrera;
    private float promedio;
    private Materia materias;

    public Estudiante(){
        super();
    }
    public Estudiante(String apellido, String nombre, int edad, String documento, String carrera, float promedio, Materia materias){
        super(apellido, nombre, edad, documento);
        this.carrera=carrera;
        this.promedio=promedio;
        this.materias=materias;
    }
    public String getCarrera(){
        return carrera;
    }
    public void setCarrera(String carrera){
        this.carrera=carrera;
    }
    public Float getPromedio(){
        return promedio;
    }
    public void setPromedio(float promedio){
        this.promedio=promedio;
    }
    public Materia getMaterias(){
        return materias;
    }
    public void setMaterias(Materia materias){
        this.materias=materias;
    }

    public void agregarMaterias(Materia materia){
        this.materias=materia;
    }

    public String toString(){
        return super.toString()+", Carrera: "+carrera+", Promedio: "+promedio+", Materias: "+materias;
    }
    public void equals(Estudiante estudiante){
        if(this.getDocumento().equals(estudiante.getDocumento())){
            System.out.println("Los estudiantes son iguales");
        }else{
            System.out.println("Los estudiantes son diferentes");
        }
    }
    public void hashCode(Estudiante estudiante){
        System.out.println("El hash code del estudiante es: "+estudiante.getDocumento().hashCode());
    }

    public String obtenerrol(){
        return "Estudiante";
    }
    public String infocompleta(){
        return "Carrera: " + getCarrera() + "Promedio: " + getPromedio() + "Matrerias: " + getMaterias();
    }
}
