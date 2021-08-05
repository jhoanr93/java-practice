package ejercicioAnonimas;

public class MainClass {
    public static void main(String[] args) {
        // TODO code application logic here
        Anonima objAnonima = new Anonima(){
            
            @Override
            public void metodo(String nombre){
                
                int cantidad = nombre.length();
                System.out.println("Bienvenidos " + nombre + " tiene: "+ cantidad);
            }
        };
        objAnonima.metodo("Andres");
        
    }
    
}
