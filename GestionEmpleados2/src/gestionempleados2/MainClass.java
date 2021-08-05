package gestionempleados2;

import java.util.ArrayList;

public class MainClass {
    
    public static void main(String[] args) {
        //Objetos repartidores
        Repartidor rep1 = new Repartidor("zona 2", "diana", 25, 400);
        Repartidor rep2 = new Repartidor("zona 3", "paola", 24, 300); // Caso de PLUS
        Repartidor rep3 = new Repartidor("zona 1", "andreina", 26, 200); // Menor salario
        Repartidor rep4 = new Repartidor("zona 1", "paula", 27, 800);

        //Objetos comercial
        Comercial com1 = new Comercial(200, "Juan", 30, 100);
        Comercial com2 = new Comercial(201, "Pepito", 31, 100); // Caso de PLUS
        Comercial com3 = new Comercial(150, "Pedro", 29, 100);
        Comercial com4 = new Comercial(148, "Laura", 29, 100); // Menor salario
        
        ArrayList<Empleado> empleados = new ArrayList<Empleado>();
        
        empleados.add(rep1);
        empleados.add(rep2);
        empleados.add(rep3);
        empleados.add(rep4);
        empleados.add(com1);
        empleados.add(com2);
        empleados.add(com3);
        empleados.add(com4);
        
        for (int i = 0; i < empleados.size(); i++) {
              empleados.get(i).plus();
        }
        
        System.out.println("==============================================================");
        
        double valorMenor = empleados.get(0).getSalario();
        double valorMayor = empleados.get(0).getSalario();
        int posicionMenor = 0;
        int posicionMayor = 0;
        int j = 0;
        
        for (int i = 0; i < empleados.size(); i++) {
            Empleado repAleatorio = empleados.get(i);
            if (repAleatorio.getSalario() < valorMenor) {
                valorMenor = repAleatorio.getSalario();
                posicionMenor = i;
            }
            if (repAleatorio.getSalario() > valorMayor) {
                valorMayor = repAleatorio.getSalario();
                posicionMayor = j;
            }
            j++;
        }
        
        System.out.println("El repartidor de menor salario es: "+ empleados.get(posicionMenor).getNombre().toUpperCase()+ " con $ "+ empleados.get(posicionMenor).getSalario());
        System.out.println("El repartidor de mayor salario es: "+ empleados.get(posicionMayor).getNombre().toUpperCase()+ " con $ "+ empleados.get(posicionMayor).getSalario());
        
    }
    
}
