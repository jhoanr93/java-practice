package geometria;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        // TODO code application logic here
        int num = 0;
        int ladoCua = 0;
        int lado1R = 0;
        int lado2R = 0;
        
        Scanner leer = new Scanner(System.in);

        System.out.println("Ingrese una opcion");
        System.out.println("1. Cuadrado");
        System.out.println("2. Rectangulo");
        num = leer.nextInt();
        
        if (num == 1){
            System.out.println("Ingrese lado");
            ladoCua = leer.nextInt();
            Figura cuadrado = new Figura(ladoCua);
            
            cuadrado.calcularArea();                   
            cuadrado.calcularPerimetro();
 
        }else if (num == 2){
            System.out.println("Ingrese lado1");
            lado1R = leer.nextInt();
            
            System.out.println("Ingrese lado2");
            lado2R = leer.nextInt();
            
            Figura rectangulo = new Figura(lado1R, lado2R);
            
            rectangulo.calcularArea();
            rectangulo.calcularPerimetro();
                        
        }
        
    }
    
}
