/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio1;

/**
 *
 * @author Jhoan R <jhoan@gmail.com at prueba.org>
 */
public class Animal {

    private String tipo;
    private String nombre;

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Animal(String tipo, String nombre) {
        this.tipo = tipo;
        this.nombre = nombre;
    }
    
    @Override
    public String toString() {
        return "Animal{" + "tipo=" + tipo + ", nombre=" + nombre + '}';
    }
    
    
    
    
    
}
