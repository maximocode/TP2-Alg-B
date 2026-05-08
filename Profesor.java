/*import tp2.Persona;*/

public class Profesor extends Persona implements MiembroU {
    private String especialidad;
    private int añosexperiencia;
    private Materia materiasasignada;

    public Profesor(){
        super();
    }
    public Profesor(String apellido, String nombre, int edad, String documento, String especialidad, int añosexperiencia, Materia materiasasignada){
        super(apellido, nombre, edad, documento);
        this.especialidad=especialidad;
        this.añosexperiencia=añosexperiencia;
        this.materiasasignada=materiasasignada;
    }
    public String getEspecialidad(){
        return especialidad;
    }
    public void setEspecialidad(String especialidad){
        this.especialidad=especialidad;
    }
    public int getAñosexperiencia(){
        return añosexperiencia;
    }
    public void setAñosexperiencia(int añosexperiencia){
        this.añosexperiencia=añosexperiencia;
    }
    public Materia getMateriasasignada(){
        return materiasasignada;
    }
    public void setMateriasasignada(Materia materiasasignada){
        this.materiasasignada=materiasasignada;
    }
    public void asignarMateria(Materia materia) {
        this.materiasasignada = materia;
    }
    public String toString(){
        return super.toString()+", Especialidad: "+especialidad+", Años de experiencia: "+añosexperiencia+", Materia asignada: "+materiasasignada.getNombre();
    }
    public void equals(Profesor profesor){
        if(this.getDocumento().equals(profesor.getDocumento())){
            System.out.println("Los profesores son iguales");
        }else{
            System.out.println("Los profesores son diferentes");
        }
    }
    public void hashCode(Profesor profesor){
        System.out.println("El hash code del profesor es: "+profesor.getDocumento().hashCode());
    }

    public String obtenerrol(){
        return "Profesor";
    }
    public String infocompleta(){
        return "Especialidad: " + getEspecialidad() + "Años de experiencia: " + getAñosexperiencia() + "Matrerias Asignadas: " + getMateriasasignada();
    }
}
