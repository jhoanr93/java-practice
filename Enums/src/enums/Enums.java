package enums;

public class Enums {
    public static void main(String[] args) {
        // TODO code application logic here
        Vehiculo carro1 = new Vehiculo(Marca.FORD, "gris", "RNA203");
        Vehiculo carro2 = new Vehiculo(Marca.TOYOTA,"gris", "RNA203");
        Vehiculo carro3 = new Vehiculo(Marca.MAZDA,"gris", "RNA203");
        Vehiculo carro4 = new Vehiculo(Marca.KIA, "gris", "RNA203");
        
        System.out.println(carro1);
        System.out.println(carro2);
        System.out.println(carro3);
        System.out.println(carro4);
        
    }
    
}
