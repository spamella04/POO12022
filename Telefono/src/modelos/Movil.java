/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelos;

import java.util.ArrayList;

/**
 *
 * @author labc205
 */
public class Movil {
    
    private int numero;
    private double saldo;
    private Compañia com;
    private ArrayList<Mensaje> bandejaEntrada= new ArrayList<>();
    
    public Movil() {
    }

    public Movil(int numero, double saldo, Compañia com){
        this.numero = numero;
        this.saldo = saldo;
        this.com = com;
    }

    public Compañia getCom() {
        return com;
    }

    public void setCom(Compañia com) {
        this.com = com;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    @Override
    public String toString() {
        return "Movil{" + "numero=" + numero + ", saldo=" + saldo + ", com=" + com + ", bandejaEntrada=" + bandejaEntrada + '}';
    }

    
    
    public void recibirMensaje(int origen, int destino, String msn){
        
        bandejaEntrada.add(new Mensaje(origen,destino, msn));
    }
   
}
