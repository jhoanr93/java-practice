/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package animales;

/**
 *
 * @author Jhoan R <jhoan@gmail.com at prueba.org>
 */
public class Perro extends Animal{

    public Perro(String Raza, String Tamano, double peso, String color) {
        super(peso, color);
        this.Raza = Raza;
        this.Tamano = Tamano;
    }

    public String getRaza() {
        return Raza;
    }

    public void setRaza(String Raza) {
        this.Raza = Raza;
    }

    public String getTamano() {
        return Tamano;
    }

    public void setTamaño(String Tamaño) {
        this.Tamano = Tamaño;
    }
    
    private String Raza;
    private String Tamano;

    @Override
    public String toString() {
        return super.toString()+ "Perro{" + "Raza=" + Raza + ", Tamano=" + Tamano + '}';
        
    }
    
    
    
    
}
