/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prueba;

/**
 *
 * @author Estudiantes
 */
public class Palo extends Carta{
   
    public String getTipo() {
        return tipo;
    }

    public void setTipo() {
        String [] palos = {"picas","corazones","diamantes","treboles"};
        int ale = (int) (Math.random()*4);
        tipo= palos[ale];
        this.tipo = tipo;
    }
    
}
