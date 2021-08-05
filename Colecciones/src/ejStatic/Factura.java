package ejStatic;

public class Factura {
    
    private static int cantidad;
    
    public Factura(){
        cantidad++;
        
        if (cantidad >5){
            System.out.println("Limite superado");
        }else{
            System.out.println("Factura N° " + cantidad);
        }
    }
    
    public static int getCantidad(){
        return cantidad;
    }
    
//    @Override
//    protected void finalize() throws Throwable {
//        cantidad--;
//        super.finalize();
//    }
    
}
