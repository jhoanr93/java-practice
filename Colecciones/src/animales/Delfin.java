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
public class Delfin extends Animal{

    public Delfin(String habitat, String continente, double peso, String color) {
        super(peso, color);
        this.habitat = habitat;
        this.continente = continente;
    }

    public String getHabitat() {
        return habitat;
    }

    public void setHabitat(String habitat) {
        this.habitat = habitat;
    }

    public String getContinente() {
        return continente;
    }

    public void setContinente(String continente) {
        this.continente = continente;
    }
    
    private String habitat;
    private String continente;

    @Override
    public String toString() {
        return super.toString()+"Delfin{" + "habitat=" + habitat + ", continente=" + continente + '}';
    }
    
    
    
}
