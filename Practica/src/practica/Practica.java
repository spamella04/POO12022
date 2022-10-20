/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica;

import java.util.ArrayList;

/**
 *
 * @author labc205
 */
public class Practica {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args){
        
        // TODO code application logic here
        
//        ArrayList<Integer> listado = new ArrayList <>();
//        listado.add(1);
//        listado.add(2);
//        listado.add(3);
//        
//        for(int num : listado){
//            System.out.println(num);
//        }
//        
//        //Eliminar elementos de un arraylist
//        listado.remove(1);
//        
//        for(int num : listado){
//            System.out.println(num);
//        }

        ArrayList<String> libros = new ArrayList();
        libros.add("POO");
        libros.add("Lenguaje C");
        libros.add("Pyhton");
        
        for(String titulo : libros){
            System.out.println(titulo);
        }
//        System.out.println("Eliminando POO");
//        libros.remove("POO");
//        
//         for(String titulo : libros){
//            System.out.println(titulo);
//        }
         //Iteradores 
         Iterable<String> it;
         it = libros;
         System.out.println(it);
         System.out.println(it.iterator().next());
          System.out.println(it);
          
         
       }
    
}
