/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prueba;

import java.util.ArrayList;

/**
 *
 * @author Guest
 */
public class Dealer extends Dar{
    int aux = 0;
    public void decidir(){
        do{
            
        
        if(jugarDealer(getValor()).equals("black jack")){
            System.out.println("Black jack");
        } else if(jugarDealer(getValor()).equals("mantener")){
            System.out.println("Me mantengo");
        } else if(jugarDealer(getValor()).equals("pedir")){
            System.out.println("Pedir");
            do{
            agregar();
            
        } while(getValor()<17);
            if(getValor()==21){
                System.out.println("Black jack");
            } else if(getValor()<21){
            System.out.println("Me mantengo");
        } else if(getValor()>21){
            if(as(getMano())==true && aux==0){
                setValor(-10);
                jugarDealer(getValor());
                aux++;
            } else {
                System.out.println("Perdio :(");
            }
            System.out.println(getMano());
            System.out.println(as(getMano()));
            
        }
        
            
        } else if(jugarDealer(getValor()).equals("perder")){
            if(as(getMano())==true && aux==0){
                setValor(-10);
                jugarDealer(getValor());
                aux++;
            } else {
                System.out.println("Perdio :(");
            }
        }
        }while (jugarDealer(getValor()).equals("pedir"));
        
    } 
}
