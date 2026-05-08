//package tp2;

public class Persona {

    protected String apellido;
    protected String nombre;
    protected int edad;
    protected String documento;
    
    public Persona(){
    }

    public Persona(String apellido, String nombre, int edad, String documento){
        this.apellido=apellido;
        this.nombre=nombre;
        this.edad=edad;
        this.documento=documento;
    }

    public String getApellido(){
        return apellido;
    }
    public void setApellido(String apellido){
        this.apellido=apellido;
    }
    public String getNombre(){
        return nombre;
    }
    public void setNoombre(String nombre){
        this.nombre=nombre;
    }
    public int getEdad(){
        return edad;
    }
    public void setEdad(int edad){
        this.edad=edad;
    }
    public String getDocumento(){
        return documento;
    }
    public void setDocumento(String documento){
        this.documento=documento;
    }

    public String toString(){
        return "Apellido: "+apellido+", Nombre: "+nombre+", Edad: "+edad+", Documento: "+documento;
    }
    public void equals(Persona persona){
        if(this.documento.equals(persona.getDocumento())){
            System.out.println("Las personas son iguales");
        }else{
            System.out.println("Las personas son diferentes");
        }
    }
    public void hashCode(Persona persona){
        System.out.println("El hash code de la persona es: "+persona.getDocumento().hashCode());
    }
}