package lambda;

import java.util.function.BinaryOperator;
import java.util.function.Predicate;

public class MainClass {
    public static void main(String[] args) {
        // TODO code application logic here
//        Calculadora prueba = new Calculadora() {
//            @Override
//            public void mostrarMensaje() {
//                System.out.println("Hola mundo");
//            }
//        };
//        
//        prueba.mostrarMensaje();
        
//        Calculadora calculadoraLambda = (numero1, numero2) -> numero1 + numero2;
//        Calculadora calculadoraResta = (numero1, numero2) -> numero1 - numero2;
//        Calculadora calculadoraMult = (numero1, numero2) -> numero1 * numero2;
//        Calculadora calculadoraDiv = (numero1, numero2) -> numero1 / numero2;
//        
//        System.out.println("Suma = "+ calculadoraLambda.operacion(2, 3));
//        System.out.println("Resta = "+ calculadoraResta.operacion(2, 3));
//        System.out.println("Multip = "+ calculadoraMult.operacion(2, 3));
//        System.out.println("Division = "+ calculadoraDiv.operacion(2, 3));

          BinaryOperator<Float> operacionS = (numero1, numero2) -> numero1 + numero2;
          BinaryOperator<Float> operacionR = (numero1, numero2) -> numero1 - numero2;
          BinaryOperator<Float> operacionM = (numero1, numero2) -> numero1 * numero2;
          BinaryOperator<Float> operacionD = (numero1, numero2) -> numero1 / numero2;
          
          System.out.println(operacionS.apply(2f, 3f));
          System.out.println(operacionR.apply(2f, 3f));
          System.out.println(operacionM.apply(2f, 3f));
          System.out.println(operacionD.apply(2f, 3f));
          
          Predicate<Integer> menorque = i -> (i<18);
          System.out.println("Predicado: " + menorque.test(10));
        
        
        
    }
    
}
