/*
 * Clase que tiene los metodos de operaciones aritmeticas basicas
 */
package aritmetica;

/**
 *
 * @author jhoan
 * @version 1.0.0
 */
public class Operacion {
    double num1;
    double num2;


    public Operacion(double num1, double num2){
            this.num1 = num1;
            this.num2 = num2; 
    }

/*Calcula la suma entre dos numeros
    @param entero numero1
    @param entero numero2
    @return suma de dos numeros*/
    public double suma(double num1, double num2){
            double rta = num1 + num2;
            return rta;
    }
/*Calcula la resta entre dos numeros
    @param entero numero1
    @param entero numero2
    @return resta de dos numeros*/
    public double resta(double num1, double num2){
            double rta = num1 - num2;
            return rta;
    }
/*Calcula la multiplicacion entre dos numeros
    @param entero numero1
    @param entero numero2
    @return multiplicacion de dos numeros*/
    public double mult(double num1, double num2){
            double rta = num1 * num2;
            return rta;
    }
/* Calcula la division entre dos numeros
    @param entero numero1
    @param entero numero2
    @return division de dos numeros*/
    public double division(double num1, double num2){
            double rta = num1 / num2;
            return rta;
    }
    
}
