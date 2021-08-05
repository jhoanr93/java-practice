package animales;

public class Principal {
    public static void main(String[] args) {
        // TODO code application logic here
        
        
        Perro labrador = new Perro("Labrador", "grande", 15, "gris");
        Perro criollo = new Perro("Criollo", "medio", 12, "blanco");
        
        Delfin delf1 = new Delfin("Mar", "America", 24,"Rosado");
        Delfin delf2 = new Delfin("Mar", "Oceania", 28,"Gris");
        
        System.out.println(labrador);
        System.out.println(criollo);
        
        System.out.println("============");
        
        System.out.println(delf1);
        System.out.println(delf2);
        
        
    }
    
}
