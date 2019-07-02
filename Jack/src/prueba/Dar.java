/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prueba;

/**
 *
 * @author Guest
 */
public class Dar extends Maso{
    
    
    
    public String jugar(int valor){
        String resultado;
        if(valor==21){
            resultado= "black jack";
        } else if(valor< 21){
            resultado= "pedir";
        } else{
            resultado = "perder";
        }
        return resultado;
        
    }
    public String jugarDealer(int valor){
        String resultado;
        if(valor==21){
            resultado= "black jack";
        } else if(valor< 21 && 16<valor){
            resultado= "mantener";
        } else if(valor <= 16){
            resultado = "pedir";
        } else{
            resultado = "perder";
        }
        return resultado;
    }
    
}
