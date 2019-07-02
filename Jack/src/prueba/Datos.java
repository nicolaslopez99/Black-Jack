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
public class Datos {
    
    protected String imagen;
    protected String tipo;
    protected int numero;
    protected String carta;
    protected String mano;
    protected int valor;
    protected String pedir;
    protected String mantener;
    protected String perder;
    private int id;
    protected double Altura;
    protected String Color;
    protected String Nombre;

    public int getID() {
        return id;
    }

    public void setID(int id) {
        this.id = id;
    }
    public double getAltura() {
        return Altura;
    }

    public void setAltura(double Altura) {
        this.Altura = Altura;
    }

    public String getColor() {
        return Color;
    }

    public void setColor(String Color) {
        this.Color = Color;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }
    public String getPedir() {
        return pedir;
    }

    public void setPedir(String pedir) {
        this.pedir = pedir;
    }

    public String getMantener() {
        return mantener;
    }

    public void setMantener(String mantener) {
        this.mantener = mantener;
    }

    public String getPerder() {
        return perder;
    }

    public void setPerder(String perder) {
        this.perder = perder;
    }
    
    

    public String getImagen() {
        return imagen;
    }

    public void setImagen(String imagen) {
        this.imagen = imagen;
    }

    public String getTipo() {
        return tipo;
    }
    
    public void  entender(){
    }

    public void setTipo() {
        this.tipo = tipo;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero() {
        this.numero = numero;
    }
    public String getCarta() {
        return carta;
    }

    public void setCarta() {
        this.carta = carta;
    }

    public String getMano() {
        return mano;
    }

    public void setMano() {
        this.mano = mano;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int numero) {
        this.valor = valor;
    }
     public void decidir(){
         
     }

    public String agregar() {
        return mano;
    }
}
