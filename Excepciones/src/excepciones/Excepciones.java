package excepciones;
public class Excepciones {
    public static void main(String[] args) {
        // TODO code application logic here
        int numero1 = 10;
        int numero2 = 5;
        int resultado = 0;
        int arregloEnteros[] = {1,2,3};
        
        try{
            resultado = numero1/numero2;
            arregloEnteros[-1] = 4;
            arregloEnteros[16] = 4;
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println(e);
        }catch(Exception e){
            System.out.println(e);
        }finally{
            System.out.println("El rta es:" + resultado);
        }
    }
    
}
