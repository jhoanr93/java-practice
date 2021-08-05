package empleados;

import java.util.*;

public class MainClass {

    public static void main(String[] args) {

        Repartidor rep1 = new Repartidor("zona 2", "diana", 25, 400);
        Repartidor rep2 = new Repartidor("zona 3", "paola", 24, 300); // Caso de PLUS
        Repartidor rep3 = new Repartidor("zona 1", "andreina", 26, 200);
        Repartidor rep4 = new Repartidor("zona 1", "paula", 27, 800);

        Comercial com1 = new Comercial(200, "Juan", 30, 100);
        Comercial com2 = new Comercial(201, "Pepito", 31, 100); // Caso de PLUS
        Comercial com3 = new Comercial(150, "Pedro", 29, 100);
        Comercial com4 = new Comercial(150, "Laura", 29, 100);

        //Declaracion de listas 
        Set<Repartidor> listaRepartidores = new TreeSet<>();
        Set<Comercial> listaComerciales = new TreeSet<>();

        //Añadir elementos a la lista Repartidores
        listaRepartidores.add(rep1);
        listaRepartidores.add(rep2);
        listaRepartidores.add(rep3);
        listaRepartidores.add(rep4);

        //Añadir elementos a la lista Comerciales
        listaComerciales.add(com1);
        listaComerciales.add(com2);
        listaComerciales.add(com3);
        listaComerciales.add(com4);
        
        System.out.println(listaComerciales.size());
        
//        for (Repartidor repartidores : listaRepartidores) {
//            
//            if (repartidores.getEdad() < 25 && repartidores.getZona().equals("zona 3")) {
//                repartidores.plus();
//            } else {
//                System.out.println("#" + repartidores);
//            }
//        }
        
//        Iterator iter = listaRepartidores.iterator();
//        Object first = iter.next();
//        Object last = iter.next();
//        int i = 0;
//        int k = listaRepartidores.size();
//
//        while (iter.hasNext() && i < k) {
//            last = iter.next();
//            i++;
//        }

//        System.out.println("===================================================================");
//        System.out.println("El repartidor que mas gana es: " + first);
//        System.out.println("El repartidor que menos gana es: " + last);
//        System.out.println("====================================================================");
        
        for (Comercial comerciales : listaComerciales) {

//            if (comerciales.getEdad() > 30 && comerciales.getComision() > 200) {
//                comerciales.plus();
//            } else {
//                System.out.println("$" + comerciales);
//            }

                System.out.println("$" + comerciales);
                System.out.println(listaComerciales.size());
        }
        System.out.println(listaComerciales.size());
    }

}
