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
 * @author estudiantes
 */
public class Maso extends Palo{
    ArrayList <String> maso = new ArrayList <String>();    

    public String getMano() {
        return mano;
    }

    public void setMano() {
        String a="";
        ArrayList<String> mano = new ArrayList<String>();
        mano.add(validar(getCarta()));
        setValor(getNumero());
        mano.add(" ");
        mano.add(validar(getCarta()));
        setValor(getNumero());
        for(int i=0 ;i<mano.size() ;i++){
            a= a + mano.get(i);
        }
        this.mano = a;
    }
    String mano;
    public String agregar(){
        
        setCarta();
        validar(getCarta());
        setValor(getNumero());
        mano = getMano()+" "+getCarta();
        return mano;
    }
    
    public void setCarta() {
        setTipo();
        setNumero();
        
        carta=getTipo()+" "+Integer.toString(getNumero())+" ";
        this.carta = carta;
    }
    public String validar(String carta){
        String cartav;
        while(maso.contains(carta) == true){
            setCarta();
            carta=getCarta();
        } 
        maso.add(carta);
        return cartav = carta ;
    }
    public boolean as (String mano){
        boolean saber;
        mano.toCharArray();
        if(mano.contains(" 1 ")==true){
            saber = true;
        } else {
            saber = false;
        }
        return saber;
    }
}