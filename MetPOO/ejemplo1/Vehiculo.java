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

	public Vehiculo(){

	}

	public void finalize() throws Throwable {

	}
	/**
	 * 
	 * @param cantCombustible
	 */
	public double combustible(double cantCombustible){
		return 0;
	}

	/**
	 * 
	 * @param kmRecorridos
	 * @param consumo
	 */
	public double conducir(double kmRecorridos, double consumo){
		return 0;
	}

	public boolean encender(){
		return false;
	}
}//end Vehiculo