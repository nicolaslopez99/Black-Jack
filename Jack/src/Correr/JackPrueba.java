/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Correr;



/**
 *
 * @author estudiantes
 */
import prueba.Datos;
import prueba.Dar;
import prueba.Dealer;
import prueba.Jugador;
import prueba.Maso;
import java.util.Scanner;
public class JackPrueba {
    
    static Datos s;

    static void Liskov(Datos a,String si){
        
        a.setCarta();
        a.setMano();
        a.setPedir(si);
        //a.setNumero();
        //a.setTipo();
        a.decidir();
        a.entender();
        
        s=a;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner i = new Scanner (System.in);
        String a;
        String c;
        Jugador b = new Jugador();
        do{
            a= i.nextLine();
            c=a;
            Liskov(b,a);
            System.out.println(s.getMano());
            //s.jugar();
            System.out.println(s.getValor());
            //System.out.println(s.getCarta());
            //System.out.println(s.getNumero());
            //s.entender();

            //s.decidir();


            //System.out.println(s.getValor());
            //System.out.println(s.agregar());
            a="si";
        }while (a=="si");        
    }
    
}
