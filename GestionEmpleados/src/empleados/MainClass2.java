package empleados;

import java.util.Set;
import java.util.TreeSet;

public class MainClass2 {
    
    public static void main(String[] args) {
        Comercial com1 = new Comercial(200, "Juan", 30, 100);
        Comercial com2 = new Comercial(201, "Pepito", 31, 100); // Caso de PLUS
        Comercial com3 = new Comercial(150, "Pedro", 29, 100);
        Comercial com4 = new Comercial(150, "Laura", 29, 100);
        
        Set<Comercial> listaComerciales = new TreeSet<>();
        
        listaComerciales.add(com1);
        listaComerciales.add(com2);
        listaComerciales.add(com3);
        listaComerciales.add(com4);
        
        System.out.println(listaComerciales.size());
        
        for (Comercial x : listaComerciales) {
            System.out.println(x);
        }
    }
    
}
