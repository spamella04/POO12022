package modelos;

/**
 * @author labc205
 * @version 1.0
 * @created 23-ago.-2022 08:43:00
 */
public class Persona {

    private double altura;
    private String apellidos;
    private int idPersona;
    private String nombre;
    private double peso;
    private String sexo;
    private Vehiculo m_Vehiculo;

    public Persona() {

    }

    public Persona(double altura, String apellidos, int idPersona, String nombre, double peso, String sexo, Vehiculo m_Vehiculo) {
        this.altura = altura;
        this.apellidos = apellidos;
        this.idPersona = idPersona;
        this.nombre = nombre;
        this.peso = peso;
        this.sexo = sexo;
        this.m_Vehiculo = m_Vehiculo;
    }

    public void finalize() throws Throwable {

    }

    public String presentar() {
        return "";
    }

    public Vehiculo getM_Vehiculo() {
        return m_Vehiculo;
    }

    public double getAltura() {
        return altura;
    }

    public String getApellidos() {
        return apellidos;
    }

    public int getIdPersona() {
        return idPersona;
    }

    public String getNombre() {
        return nombre;
    }

    public double getPeso() {
        return peso;
    }

    public String getSexo() {
        return sexo;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public void setIdPersona(int idPersona) {
        this.idPersona = idPersona;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public void setM_Vehiculo(Vehiculo m_Vehiculo) {
        this.m_Vehiculo = m_Vehiculo;
    }
}//end Persona
