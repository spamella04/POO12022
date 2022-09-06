/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;
import modelos.Persona;
import modelos.Sexo;

/**
 *
 * @author labc205
 */
public class DPersona {

    private ArrayList<Persona> listPersona = new ArrayList<>(); //coleccion de datos

    
    public DPersona() {
    }
    
    public DPersona(ArrayList<Persona> listPersona) {
        this.listPersona = listPersona;
    }

    public ArrayList<Persona> getListPersona() {
        return listPersona;
    }

    public void setListPersona(ArrayList<Persona> listPersona) {
        this.listPersona = listPersona;
    }
    /**
     * Permite agregar un nuevo registro a mi lista
     * @param id
     * @param nom
     * @param ape
     * @param email
     * @param sexo
     * @return 
     */
    public int agregarPersona(int id, String nom, String ape, String email, Sexo sexo){
        
        int b = 0;
        Persona pers = new Persona(id, nom, ape, email, sexo);
        listPersona.add(pers);
        b = 1;
        return b;
        
    }
    /**
     * Devuelve una tabla con los registros 
     * almacenados en el listado de personas
     * @return 
     */
    public DefaultTableModel getListPer(){
        // DefaultTableModel es una clase que ayuda a crear una tabla 
        
        DefaultTableModel dtm = new DefaultTableModel();
        //dtm es el nombre de la tabla
        
        //Asigna los encabezados a la tabla
        String titulo[] = {"ID", "NOMBRES", "APELLIDOS", "EMAIL","SEXO"};
        dtm.setColumnIdentifiers(titulo);
        
        // Es un for each
        for (Persona per: listPersona){
            
            String reg[] = new String [5];

            reg[0] = ""+ per.getId();
            reg[1] = per.getNombre();
            reg[2] = per.getApellidos();
            reg[3] = per.getEmail();
            reg[4] = ""+per.getSexo();
            
            dtm.addRow(reg);

        }
        
        return dtm;
    }
        
}
