/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.calculadora;

/**
 *
 * @author jhoan
 */
public class Aritmetica {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double num1 = Double.parseDouble(args[0]);
        double num2 = Double.parseDouble(args[1]);

        Operacion op1 = new Operacion(num1, num2);

        System.out.println("Suma = "+ op1.suma(num1, num2));
        System.out.println("Resta = " + op1.resta(num1, num2));
        System.out.println("Multiplicacion = "+ op1.mult(num1, num2));
        System.out.println("Division = "+ op1.division(num1, num2));
    }
    
}
