
public class Main{
    public static void main(String[] args) {

        Carrera c1=new Carrera("Sistemas");
        Carrera c2=new Carrera("Industrial");
        
        Estudiante alu1=new Estudiante("Nuñez", "Lihue", 18, "46.123.567", c1, 7.50f);
        Estudiante alu2=new Estudiante();
        Estudiante alu3=new Estudiante("Perez", "Nicolas", 20, "47.123.897", c2, 6.89f);
        
        Materia m2=new Materia("Algoritmos", "11B", 3, 7, null);
        Materia m1=new Materia("Matematicas", "11A", 2, 8, null);
        
        Profesor p1=new Profesor("Ferreira", "Martin", 30, "32.567.765", "Exactas", 1, null);
        
        alu2.setApellido("Gonzales");
        alu2.setDocumento("41.123.543");
        alu2.setNombre("Santiago");
        alu2.setEdad(25);
        
        alu2.agregarMaterias(m1);;
        alu2.setCarrera(c2);
        alu1.agregarMaterias(m2);
        alu3.agregarMaterias(m1);

        p1.asignarMateria(m1);



    }
}