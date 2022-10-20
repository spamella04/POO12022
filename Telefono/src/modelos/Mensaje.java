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
public class Mensaje {
    
    private int destino;
    private int origen;
    private String msn;

    public Mensaje() {
    }

    public Mensaje(int destino, int origen, String msn) {
        this.destino = destino;
        this.origen = origen;
        this.msn = msn;
    }

    public String getMsn() {
        return msn;
    }

    public void setMsn(String msn) {
        this.msn = msn;
    }

    public int getDestino() {
        return destino;
    }

    public void setDestino(int destino) {
        this.destino = destino;
    }

    public int getOrigen() {
        return origen;
    }

    public void setOrigen(int origen) {
        this.origen = origen;
    }
    
    public String enviarMensaje(double saldo, double precioMsn){
        
        if(saldo>= precioMsn){
            return "Mensaje Enviado...";
        }
        
        return "No tiene suficente saldo";
    }
    
   

    @Override
    public String toString() {
        return "Mensaje{" + "destino=" + destino + ", origen=" + origen + ", msn=" + msn + '}';
    }
    
    
}
