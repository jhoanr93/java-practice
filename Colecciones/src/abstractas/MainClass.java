package abstractas;

import java.util.*;

public class MainClass {
    public static void main(String[] args) {
        // TODO code application logic here
        Animal perro1 = new Perro();
        Animal perro2 = new Perro();
        Animal perro3 = new Perro();
        
        Animal gato1 = new Gato();
        Animal gato2 = new Gato();
        Animal gato3 = new Gato();
        
        List<Animal> listaAnimales = new ArrayList<>();
        listaAnimales.add(perro1);
        listaAnimales.add(perro2);
        listaAnimales.add(perro3);
        
        listaAnimales.add(gato2);
        listaAnimales.add(gato2);
        listaAnimales.add(gato3);
        
        
        
        for (Animal animal : listaAnimales) {
            
            animal.emitirSonido();
            
        }
    }
}
