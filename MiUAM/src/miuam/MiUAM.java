/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package miuam;

import dao.Usuario;
import formularios.Login;


/**
 *
 * @author labc205
 */
public class MiUAM {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       Usuario usuarios = new dao.Usuario();
       usuarios.agregar("18020323", "123","Carlos","Cerda","carlos.cerda@uamv.edu.ni");
       usuarios.agregar("2101522", "147","Carlos","Gurdian","carlos.gurdian@gmail.com");
       usuarios.agregar("19014659", "132","Synthia","Gonzalez","spgonzalez@uamv.edu.ni");
       
       Login login = new Login();
       login.usuarios = usuarios;
       
       login.setVisible(true);

       
    }
    
    public void llenarUsuarios(){
        
       Usuario usuarios = new dao.Usuario();
       usuarios.agregar("18020323", "123","Carlos","Cerda","carlos.cerda@uamv.edu.ni");
       usuarios.agregar("2101522", "147","Carlos","Gurdian","carlos.gurdian@gmail.com");
       usuarios.agregar("19014659", "132","Synthia","Gonzalez","spgonzalez@uamv.edu.ni");
       
       Login login = new Login();
       login.usuarios = usuarios;
       login.setVisible(true);

    }
    
}
