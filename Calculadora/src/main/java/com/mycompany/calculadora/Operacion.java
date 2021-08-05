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
public class Operacion {
    double num1;
	double num2;


	public Operacion(double num1, double num2){
		this.num1 = num1;
		this.num2 = num2; 
	}


	public double suma(double num1, double num2){
		double rta = num1 + num2;
		return rta;
	}

	public double resta(double num1, double num2){
		double rta = num1 - num2;
		return rta;
	}

	public double mult(double num1, double num2){
		double rta = num1 * num2;
		return rta;
	}

	public double division(double num1, double num2){
		double rta = num1 / num2;
		return rta;
	}

    
}
