/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prueba;

import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author Estudiantes
 */
public class Carta extends Datos {
   
    int aux1=0;
    public int getNumero() {
        return numero;
    }

    public void setNumero() {
        numero= (int)(Math.random()*13)+1;
        this.numero = numero;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int numero) {
        ArrayList<Integer> aux = new ArrayList<Integer>();
        
        if(numero==1 ){
            valor = 11;
            aux.add(valor);   
        }  else if(numero<11){
            valor = numero;
            aux.add(valor);
        } else{
            valor = 10;
            aux.add(valor);
        }
        for(int i=0 ;i<aux.size() ;i++){
            aux1= aux1 + aux.get(i);
        }
        
               
        this.valor = aux1;
    }   
}
