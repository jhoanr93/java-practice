package excepciones;

public class Excepcion extends Exception{
    public Excepcion(String msj){
        super("Error Excepcion ESPECIAL " + msj);
    }
}
