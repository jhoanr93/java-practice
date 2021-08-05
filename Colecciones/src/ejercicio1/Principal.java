/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio1;

import java.util.*;

/**
 *
 * @author Jhoan R <jhoan@gmail.com at prueba.org>
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
//        List<String> listaAnimales = new ArrayList();
//        
//        listaAnimales.add("Perro");
//        listaAnimales.add("Perro1");
//        listaAnimales.add("Perro2");
//        
//        for (int i = 0; i < listaAnimales.size(); i++) {
//            System.out.println("Animal: "+listaAnimales.get(i));
//            
//        }
//        
//        System.out.println("===================================");
//        
//        for (String animal : listaAnimales) {
//            System.out.println("Animal: "+ animal);
//            
//        }
//        
//        System.out.println("===================================");
//        
//        for (Iterator iterator = listaAnimales.iterator(); iterator.hasNext();) {
//            //Object next = iterator.next();
//            System.out.println(iterator.next());
//            
//        }
        
        
        List<Animal> listAnimales2 = new ArrayList<>();
        listAnimales2.add(new Animal("Aereo", "Perico"));
        listAnimales2.add(new Animal("Terrestre", "Perro"));
        
        for (Animal animal : listAnimales2) {
            System.out.println(animal);
            
        }
        
        System.out.println("===");
        listAnimales2.remove(0);
        
        
        for (Animal animal : listAnimales2){
            System.out.println(animal);
        }
        
                
        
    }
    
    
    
    
}
