/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.util.ArrayList;

/**
 *
 * @author labc205
 */
public class Usuario {
    
    private ArrayList<modelos.Usuario> lista = new ArrayList<>();

    public Usuario() {
    }

    public ArrayList<modelos.Usuario> getLista() {
        return lista;
    }

    public void setLista(ArrayList<modelos.Usuario> lista) {
        this.lista = lista;
    }
    
    public void agregar(String user, String pw, String nombres, String apellidos, String email){
        this.lista.add(new modelos.Usuario(user, pw, nombres, apellidos, email));
    }
    
    public boolean autenticarUsuario(String user, String pw){
        
        for(modelos.Usuario us: this.lista){
            if(us.verificarUsuario(user, pw)){
                return true;
            }
        }
        
        return false;
        
    }
 
}
