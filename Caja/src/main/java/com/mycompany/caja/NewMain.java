/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.caja;

/**
 *
 * @author jhoan
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        // Forma numero 1
        int medidaAncho = 3;
        int medidaAlto = 2;
        int medidaProfundo = 6;
        
        Caja nuevoObjeto1 = new Caja();
        nuevoObjeto1.calcularVolumen();
        
        //Forma numero 2
        Caja nuevoObjeto = new Caja(3,2,6);
        nuevoObjeto.calcularVolumen();
    }
    
}
