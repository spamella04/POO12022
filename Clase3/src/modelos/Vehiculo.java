package modelos;

/**
 * @author labc205
 * @version 1.0
 * @created 23-ago.-2022 08:43:02
 */
public class Vehiculo {

    private int anio;
    private int idVehiculo;
    private String marca;
    private String modelo;
    private String nombre;
    private double precio;

    public Vehiculo() {

    }

    public Vehiculo(int anio, int idVehiculo, String marca, String modelo, String nombre, double precio) {
        this.anio = anio;
        this.idVehiculo = idVehiculo;
        this.marca = marca;
        this.modelo = modelo;
        this.nombre = nombre;
        this.precio = precio;
    }
    
    

    public void finalize() throws Throwable {

    }

    /**
     *
     * @param cantCombustible
     */
    public double combustible(double cantCombustible) {
        return 0;
    }

    /**
     *
     * @param kmRecorridos
     * @param consumo
     */
    public double conducir(double kmRecorridos, double consumo) {
        return 0;
    }

    public boolean encender() {
        return false;
    }

    public int getAnio() {
        return anio;
    }

    public int getIdVehiculo() {
        return idVehiculo;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public String getNombre() {
        return nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public void setIdVehiculo(int idVehiculo) {
        this.idVehiculo = idVehiculo;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
}//end Vehiculo
