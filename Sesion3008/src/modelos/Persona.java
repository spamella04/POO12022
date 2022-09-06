/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelos;

/**
 *
 * @author labc205
 */
public class Persona {
    private int id;
    private String nombre;
    private String apellidos;
    private String email;
    private Sexo sexo;

    public Persona() {
    }

    public Persona(int id, String nombre, String apellidos, String email, Sexo sexo){
        this.id = id;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.email = email;
        this.sexo = sexo;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public Sexo getSexo() {
        return sexo;
    }

    public void setSexo(Sexo sexo) {
        this.sexo = sexo;
    }
// mostrar los datos que estan guardados
    @Override
    public String toString() {
        return "Persona{" + "id = "  + id + ", nombre = " + nombre + ", apellidos = " + apellidos + ", email = " + email + ", sexo = " + sexo + '}';
    }
    
    
}
