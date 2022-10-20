package modelo;

import java.util.Date;


/**
 * @author labc205
 * @version 1.0
 * @created 27-sep.-2022 09:06:46
 */
public class Factura {

	private Date fechaFact;
	private int idFact;
	public Cliente m_Cliente;
	public Carrito m_Carrito;

	public Factura(){

	}

	public void finalize() throws Throwable {

	}
	public double calcIVA(){
		return 0;
	}
}//end Factura