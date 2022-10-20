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
public class MLogico {
    /**
     * Verifica si dos numeros eneteros son iguales
     * @param num1
     * @param num2
     * @return 
     */
    public boolean sonIguales(int num1, int num2){
            return num1 == num2;
    }
    /**
     * Verifica si dos numeros reales son iguales
     * @param num1
     * @param num2
     * @return 
     */
    public boolean sonIguales(double num1, double num2){
        return num1 == num2;
    }
    
    /**
     * Identifica cual de los dos numeros es el mayor
     * @param num1
     * @param num2
     * @return 
     */
    public double numeroMayor(double num1, double num2){
        
        if(num1>num2){
            return num1;
        }else{
            return num2;
        }
    }
    
    /**
     * Identifica cual de los dos numeros es el menor
     * @param num1
     * @param num2
     * @return 
     */
    public double numeroMenor(double num1, double num2){
        
        if(num1>num2){
            return num2;
        }else{
            return num1;
        }
    }
    
    /**
     * Identifica si un numero es mayor o igual a otro
     * @param num1
     * @param num2
     * @return 
     */
    public boolean mayorOIgual(double num1 , double num2){
        return num1 >= num2;
    }
    
    public boolean menorOIgual(double num1 , double num2){
        return num1 <= num2;
    }
    
    /** Verifica si dos letras son iguales
     * 
     * @param char1
     * @param char2
     * @return 
     */
    public boolean caracteresIguales(String char1, String char2){
        return char1.equals(char2);
    }
    
     public boolean caracteresDiferentes(String char1, String char2){
        return char1.equals(char2);
    }
     
     public boolean cadenasIguales(String cadena1, String cadena2){
         return cadena1.equals(cadena2);
     }
    
}
