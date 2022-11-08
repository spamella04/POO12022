/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.util.ArrayList;
import java.sql.*; // para usar resultset y statement

/**
 *
 * @author labc205
 */ 
// extends significa herencia
public class Usuario extends Conexion{
    private ResultSet rs;
    private Statement st;
    private Connection conn = this.obtenerConexion();
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
    
    public void editar(String user, String pw, String nombres, String apellidos, String email){
            
        for(modelos.Usuario usuario: this.lista){
            
            if(usuario.existe(user)){
                usuario.setPw(pw);
                usuario.setNombres(nombres);
                usuario.setApellidos(apellidos);
                usuario.setEmail(email);
            }
        }
    }
    
    public boolean eliminarUsuario(String userName){
        for (modelos.Usuario usuario : this.lista){
            if(usuario.existe(userName)){
                this.lista.remove(usuario);
                return true;
            }
        }
        return false;
        //011122
    }
    
    
    public boolean autenticarUsuario(String user, String pw){
        
        for(modelos.Usuario us: this.lista){
            if(us.verificarUsuario(user, pw)){
                return true;
            }
        }
        
        return false;
        
    }
    
    public ArrayList buscarXNombre(String valor){
        
        ArrayList<modelos.Usuario> resultado = new ArrayList<>();
       
        for(modelos.Usuario usuario: this.lista){
            String userN = usuario.getNombres().toUpperCase() + " "+ usuario.getApellidos().toUpperCase();
            if(userN.startsWith(valor.toUpperCase())){
            resultado.add(usuario);
            }
        }
        return resultado;
        
    }
    
    public void obtenerRegistros(){
        String tSQL = "Select * from Usuario";
        try{
        rs = st.executeQuery(tSQL);
        while(rs.next()){
           this.agregar(rs.getString("userName"),rs.getString("pw"),rs.getString("nombres"),rs.getString("apellidos"),rs.getString("email"));
        }  
        }catch(Exception ex){
            System.out.println(ex.getMessage());
        }
    }
      
 
}
