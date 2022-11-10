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
    private Connection conn = this.obtenerConexion();
    private PreparedStatement st = null;
    // select * from usuario
    private ResultSet rs; // organizan los datos de la consulta en filas y columnas
    private ArrayList<modelos.Usuario> lista = new ArrayList<>();

    public Usuario() {
        this.obtenerRegistros();
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
        st = conn.prepareStatement(tSQL);
        rs = st.executeQuery();
        while(rs.next()){
           this.agregar(rs.getString("userName"),rs.getString("Userpw"),rs.getString("Nombres"),rs.getString("Apellidos"),rs.getString("Email"));
        }  
        }catch(Exception ex){
            System.out.println(ex.getMessage());
        }
    }
      
    public boolean guardarRegistros(modelos.Usuario u){
        boolean ok = false;
        try{
            String tSQL = "Insert into Usuario(" + "userName, UserPw, Nombres, Apellidos, Email)" + "values (?,?,?,?,?)";
            st = conn.prepareStatement(tSQL);
            st.setString(1, u.getUserName());
            st.setString(2, u.getPw());
            st.setString(3, u.getNombres());
            st.setString(3, u.getApellidos());
            st.setString(4, u.getEmail());
           // if()
        }catch(Exception ex){
            
        }
        return ok;
    }
 
}
