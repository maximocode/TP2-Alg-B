public class Materia {
    private String nombre;
    private String codigo;
    private int creditos;
    private Profesor profesor;

    public Materia(String nombre, String codigo, int creditos, Profesor profesor) {
        this.nombre=nombre;
        this.codigo=codigo;
        this.creditos=creditos;
        this.profesor= null;
    }
    public String getNombre(){
        return nombre;
    }
    public void setNombre(String nombre){
        this.nombre=nombre;
    }
    public String getCodigo(){
        return codigo;
    }
    public void setCodigo(String codigo){
        this.codigo=codigo;
    }
    public int getCreditos(){
        return creditos;
    }
    public void setCreditos(int creditos){
        this.creditos=creditos;
    }
    public Profesor getProfesor(){
        return profesor;
    }
    public void setProfesor(Profesor profesor){
        this.profesor=profesor; 
    }
    public String toString(){
        return "Nombre: "+nombre+", Código: "+codigo+", Créditos: "+creditos+", Profesor: "+profesor.getNombre()+" "+profesor.getApellido();
    }
    public void equals(Materia materia){
        if(this.codigo.equals(materia.getCodigo())){
            System.out.println("Las materias son iguales");
        }else{
            System.out.println("Las materias son diferentes");
        }
    }
    public void hashCode(Materia materia){
        System.out.println("El hash code de la materia es: "+materia.getCodigo().hashCode());
    }

}
