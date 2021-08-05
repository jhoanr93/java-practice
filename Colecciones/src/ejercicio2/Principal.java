package ejercicio2;


import java.util.*;


public class Principal {
    public static void main(String[] args) {
        // TODO code application logic here
//        Set<String> listFrutas = new HashSet<>();
//        
//        listFrutas.add("guanabana");
//        listFrutas.add("Fresa");
//        listFrutas.add("uvas");
//        listFrutas.add("kiwi");
//        
//        for(String fruta: listFrutas){
//            System.out.println("Fruta: "+fruta);
//        }
//        
//        listFrutas.add("manzana");
//        listFrutas.add("banano");
//        System.out.println("============");
//        
//        for(String fruta: listFrutas){
//            System.out.println("Fruta: "+ fruta);
//        }
//    
//    }
    
    Set<Estudiante> estudiantes = new TreeSet<>();
    
    estudiantes.add(new Estudiante("Pepito", "123", 15));
    estudiantes.add(new Estudiante("Luis","1234", 16));
    estudiantes.add(new Estudiante("Pedro", "124", 14));
    
        System.out.println(" ***DE MAYOR A MENOR***");
        for (Estudiante estudiante : estudiantes) {
            System.out.println(estudiante);
            
        }
    
    }
    
}
