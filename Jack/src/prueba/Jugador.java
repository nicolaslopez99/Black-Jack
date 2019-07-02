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
public class Jugador extends Dar{
    int aux=0;
    public void decidir(){

            
        
        if(jugar(getValor()).equals("black jack")){
            System.out.println("Black jack");
        } else if(jugar(getValor()).equals("pedir")&& getPedir().equals("si")){
                System.out.println("Pedir");
                agregar();

                if(getValor()==21){
                    System.out.println("Black jack");
                } else if(getValor()>21){
                if(as(getMano())==true && aux==0){
                    setValor(-10);
                    jugar(getValor());
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

    }

   
    
}
