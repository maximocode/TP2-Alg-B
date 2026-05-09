import java.util.ArrayList;

public class Carrera {
    private String nombre;
    private ArrayList<Estudiante> estudiantes;

    public Carrera(){
        this.estudiantes=new ArrayList<Estudiante>();
    }
    public Carrera(String nombre){
        this.nombre = nombre;
        this.estudiantes = new ArrayList<Estudiante>();
    }

    public String getNombre(){
        return nombre;
    }
    public void setNoombre(String nombre){
        this.nombre=nombre;
    }

    // Agrega un estudiante a la lista
    public void agregarEstudiante(Estudiante estudiante){
        this.estudiantes.add(estudiante);
    }

    // Muestra todos los estudiantes
    public void listarEstudiantes(){
        for(Estudiante e : estudiantes){
            System.out.println(e);
        }
    }

    // Busca un estudiante por nombre
    public Estudiante buscarEstudiante(String nombre){
        for(Estudiante e : estudiantes){
            if(e.getNombre().equalsIgnoreCase(nombre)){
                return e;
            }
        }
        return null; // si no lo encuentra devuelve null
    }
}