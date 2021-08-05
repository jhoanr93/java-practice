
import java.util.*;

public class MainClass {

    public static void main(String[] args) {
        // TODO code application logic here

        Scanner entrada = new Scanner(System.in);
        

        System.out.println("Ingrese dia");
        int dia = entrada.nextInt();
        System.out.println("Ingrese mes");
        int mes = entrada.nextInt();
        System.out.println("Ingrese año");
        int año = entrada.nextInt();

        //LocalDate cumpleaños = LocalDate.of(año, mes, dia);

        //Punto 1
        System.out.println("Fecha: "+ Utilidad.mostarFecha(año, mes ,dia));

        //Punto 2
        System.out.println("Es bisiesto?" + Utilidad.esBisiesto(año, mes ,dia));

        //Punto 3
        System.out.println("+ 20 dias: " + Utilidad.sumarDias(año, mes ,dia));


        //Punto 4
        System.out.println("Dia del mes: "+ Utilidad.obtenerDia(año, mes ,dia));
        
    }

}
