package ejercicio7;

public class Principal {

    public static void main(String[] args) {
        // TODO code application logic here
        
        Persona per1 = new Persona("Juan", 25);
        Persona per2 = new Persona("Pedro", 28);
        
        System.out.println("El mayor es -> "+ Persona.mayorEdad(per1, per2));
    }
    
}
