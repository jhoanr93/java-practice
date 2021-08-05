package ejercicio7;

public class Persona {
    private static String nombre;
    private static int edad;

    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "Persona{"+ nombre + '}';
    }
    
    public static Persona mayorEdad(Persona per1, Persona per2){
        if (per1.edad > per2.edad){
            return per1;
            
        }else if (per1.edad == per2.edad){
            return per2;
        }
        return per2;
    }
}
