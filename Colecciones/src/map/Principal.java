package map;

import java.util.*;

public class Principal {
    public static void main(String[] args) {
        // TODO code application logic here
        
        Map <String, String> marcasAut = new TreeMap<>();
        marcasAut.put("A002", "Ford");
        marcasAut.put("A001", "Mazda");
        marcasAut.put("A003", "Susuky");
        
        Set<String> marcas = marcasAut.keySet();
        for (String marca : marcas) {
            System.out.println("Clave: "+ marca+ " Marcas: "+ marcasAut.get(marca));
            
        }
    }
    
}
