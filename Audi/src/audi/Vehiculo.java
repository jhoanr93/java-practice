/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package audi;

/**
 *
 * @author Jhoan R <jhoan@gmail.com at prueba.org>
 */
public class Vehiculo {
    
    
    
    private String modelo;
    private int numeroPuertas = 4;
    private String marca;
    private String placa;    
    private double precio;
    
    public Vehiculo(String modelo, int numeroPuertas, String placa, String marca, double precio ){
        this.modelo = modelo;
        this.numeroPuertas = numeroPuertas;
        this.placa = placa;
        this.marca = marca;
        this.precio = precio;
    }
    
    

    
    public Vehiculo(String modelo, String marca, int precio) {
        this.modelo = modelo;
        this.marca = marca;
        this.precio = precio;
    }
    
    
    

    public int getNumeroPuertas() {
        return numeroPuertas;
    }

    public void setNumeroPuertas(int numeroPuertas) {
        this.numeroPuertas = numeroPuertas;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }
        
    public void setModelo(String modelo){
        this.modelo = modelo;
    }
    
    public String getModelo(){
        return this.modelo;
    }
    
    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
    
    
    

    @Override
    public String toString() {
        return "Vehiculo{" + "modelo=" + modelo + ", marca=" + marca + ", precio=" + precio + '}';
    }
    
    
    
    
    
}
