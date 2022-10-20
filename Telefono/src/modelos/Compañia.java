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
public class Compañia {
    
    private int id;
    private String nombre;
    private double precioMsn;

    public Compañia() {
    }

    public Compañia(int id, String nombre, double precioMsn) {
        this.id = id;
        this.nombre = nombre;
        this.precioMsn = precioMsn;
    }

    public double getPrecioMsn() {
        return precioMsn;
    }

    public void setPrecioMsn(double precioMsn) {
        this.precioMsn = precioMsn;
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
    
    public double disiminuirSaldo(double saldo){
        
        return saldo - this.precioMsn;
        
    }

    @Override
    public String toString() {
        return "Compañia{" + "id=" + id + ", nombre=" + nombre + ", precioMsn=" + precioMsn + '}';
    }
    
}
