public class Personal extends Persona implements MiembroU {
    private String cargo;
    private String departamento;
    private int antiguedad;

    public Personal(){
        super();
    }
    public Personal(String apellido, String nombre, int edad, String documento, String cargo, String departamento, int antiguedad){
        super(apellido, nombre, edad, documento);
        this.cargo=cargo;
        this.departamento=departamento;
        this.antiguedad=antiguedad;
    }
    public String getCargo(){
        return cargo;
    }
    public void setCargo(String cargo){
        this.cargo=cargo;
    }
    public String getDepartamento(){
        return departamento;
    }
    public void setDepartamento(String departamento){
        this.departamento=departamento;
    }
    public int getAntiguedad(){
        return antiguedad;
    }
    public void setAntiguedad(int antiguedad){
        this.antiguedad=antiguedad;
    }
    public String toString(){
        return super.toString()+", Cargo: "+cargo+", Departamento: "+departamento+", Antiguedad: "+antiguedad+" años";
    }

    public String obtenerrol(){
        return "Personal";
    }
    public String infocompleta(){
        return "Cargo: " + getCargo() + "Departamento: " + getDepartamento() + "Antiguedad: " + getAntiguedad();
    }
}