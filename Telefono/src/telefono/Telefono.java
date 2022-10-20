/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package telefono;

import modelos.Compañia;
import modelos.Mensaje;
import modelos.Movil;

/**
 *
 * @author labc205
 */
public class Telefono {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Compañia megaPhone = new Compañia(1, "MEGAPhone", 1);
    //    System.out.println(megaPhone);
        Movil synthia = new Movil(77446655,10,megaPhone);
        Movil lester = new Movil (11223344,10,megaPhone);
        
      //  System.out.println(synthia);
        //System.out.println(lester);
        
        Mensaje msn = new Mensaje();
        
        msn.setDestino(11223344);
        msn.setOrigen(77446655);
        
        msn.setMsn("hola");
        
        //Bandeja de entrada
        
        lester.recibirMensaje(msn.getOrigen(), msn.getDestino(),msn.getMsn());
        System.out.println();
       // System.out.println(msn.enviarMensaje(synthia.getSaldo(), megaPhone.getPrecioMsn()));
        
        double nSaldo = megaPhone.disiminuirSaldo(synthia.getSaldo());
        synthia.setSaldo(nSaldo);
        
        System.out.println(synthia);
        
        System.out.println(lester);
        
         msn.setDestino(11223344);
        msn.setOrigen(77446655);
        
        msn.setMsn("como estas?");
        
        //Bandeja de entrada
        
        lester.recibirMensaje(msn.getOrigen(), msn.getDestino(),msn.getMsn());
        System.out.println();
       // System.out.println(msn.enviarMensaje(synthia.getSaldo(), megaPhone.getPrecioMsn()));
        
        nSaldo = megaPhone.disiminuirSaldo(synthia.getSaldo());
        synthia.setSaldo(nSaldo);
        
        System.out.println(synthia);
        
        System.out.println(lester);
    }
    
}
