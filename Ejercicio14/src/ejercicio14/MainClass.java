package ejercicio14;

import java.util.*;
import java.util.function.Predicate;


public class MainClass {

    public static void main(String[] args) {

        List<Empleado> listaEmpleados = new ArrayList<>();
        List<String> listaAux = new ArrayList<>();

        listaEmpleados.add(new Empleado("juan", 38, 1_500_000.00));
        listaEmpleados.add(new Empleado("pedro", 27, 2_500_000.00));
        listaEmpleados.add(new Empleado("donald", 36, 2_700_000.00));
        listaEmpleados.add(new Empleado("yitanyali", 55, 1_900_000.00));
        
        Empleado empleado = new Empleado("juan", 38, 1_500_000.00);

        //listaEmpleados.forEach(System.out::println);

        //listaAux = listaEmpleados.stream().filter(e -> e.getEdad() > 35 && e.getSalario() > 2_000_000.00).collect(Collectors.toList());

        //listaAux.forEach(System.out::println);
        
        
        //2. Map
        
//        listaAux = listaEmpleados.stream()
//                .filter(e -> e.getEdad()>35)
//                .map( e -> e.getNombre())
//                .collect(Collectors.toList());
//        
//        listaAux.forEach(System.out::println);
        
        // Sorted
//        Comparator<Empleado> porNombre = (Empleado e1, Empleado e2) ->e2.getNombre().compareTo(e1.getNombre());
//        Comparator<Empleado> porSalario = (Empleado e1, Empleado e2) ->e1.getSalario().compareTo(e2.getSalario());
//        
//        List<Empleado> lisEmpOrd = listaEmpleados.stream().sorted(porNombre).collect(Collectors.toList());
//        List<Empleado> lisEmpOrdSalario = listaEmpleados.stream().sorted(porSalario).collect(Collectors.toList());
//        
//        System.out.println("================= Por nombre ASC ====================");
//        lisEmpOrd.forEach(System.out::println);
//        System.out.println("");
//        System.out.println("================= Por salario MENOR A MAYOR ===================");
//        lisEmpOrdSalario.forEach(System.out::println);


          Predicate <Empleado> iniciaCon = empleado1 -> empleado.getNombre().startsWith("y");
                  boolean iniciaConY = listaEmpleados.stream().anyMatch(iniciaCon);
          System.out.println("->"+ iniciaConY);

    }
}

//        List<Integer> lista1 = new ArrayList<>();
//        List<Integer> lista2 = new ArrayList<>();
//
//        lista1.add(23);
//        lista1.add(59);
//        lista1.add(60);
//        lista1.add(12);
//        lista1.add(18);
//        
//        lista2 = lista1.stream().filter(valor -> valor % 2 == 0).collect(Collectors.toList());
//
//        lista2.forEach(valor -> System.out.println(valor));
//        for (int i = 0; i < lista1.size(); i++) {
//            if (lista1.get(i) % 2 == 0){
//                lista2.add(lista1.get(i));
//            }
//            
//        }
//        System.out.println(lista2);
//        
//    }
