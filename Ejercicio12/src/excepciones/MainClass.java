package excepciones;

import javax.management.RuntimeErrorException;

public class MainClass {

    public static int dividir() throws Excepcion {
        System.out.println("================ P3 ===================");
        int a = 0;
        int b = 300;
        int resultado = 0;

        if (a != 0) {
            resultado = b / a;
        } else {
            throw new Excepcion("Numero 2 no sirve");
        }

        return resultado;
    }
    
    public static void capError(int a, int b) throws RuntimeException{
        
        int resultado = 0;
        
        //resultado = b/a;
        
        if (a == 0){
            throw new RuntimeException("ERROR PUNTO2");
        }else{
            System.out.println("rta: "+ resultado);
        }

    }

    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("================ P1 ===================");
        int a = 0;
        int b = 300;
        int resultado = 0;

        try {
            resultado = b / a;
            System.out.println("El rta es:" + resultado);
        } catch (Exception e) {
            System.out.println("Se ha producido un error");
        } finally {
            System.out.println("Programa finalizado");
        }

        
        try{
            dividir();
        }catch(Excepcion e){
            System.out.println(e);
        }
        
        System.out.println("================ P2 ===================");
        try{
            MainClass.capError(a, b);
        }catch(Exception e){
            System.out.println("Error punto2" + e);
        }
        
    }

}
