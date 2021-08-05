package audi;
import java.util.*;
public class Audi {

    public static void main(String[] args) {

        Vehiculo carro1 = new Vehiculo("2016", "Mazda", 20000);
        Vehiculo carro2 = new Vehiculo("2021", "Duster", 18000);
        Vehiculo carro3 = new Vehiculo("2021", "Susuky", 16000);

        List<Vehiculo> carros = new ArrayList<>();
        carros.add(carro1);
        carros.add(carro2);
        carros.add(carro3);

        double valorMenor = carros.get(0).getPrecio();
        int posicionMenor = 0;

        for (int i = 0; i < carros.size(); i++) {
            Vehiculo carro = carros.get(i);
            if (carro.getPrecio() < valorMenor) {
                valorMenor = carro.getPrecio();
                posicionMenor = i;
            }
        }
        System.out.println("El menor es = " + carros.get(posicionMenor));
    }
}
