package biblioteca;

public class MainClass {
    public static void main(String[] args) {
        Libros libro1 = new Libros(546, "Harry Potter", 2003);
        Libros libro2 = new Libros(546, "Harry Potter", 2003);
        
        Revista revista1 = new Revista(123, 1, "Vogue", 2021);
        Revista revista2 = new Revista(123, 1, "Vogue", 2021);
        
        libro1.prestado();
        System.out.println("==========");
        System.out.println("Solicitud de prestamo");
        libro1.prestar();
        System.out.println("=========");
        libro1.prestado();
        System.out.println("=========");
        System.out.println("Prestado el libro: "+libro1);
        libro1.devolver();
        System.out.println("==========");
        System.out.println("Devuelto el libro: "+libro1);
        
        System.out.println("===========");
        System.out.println("Seccion de revista");
        System.out.println(revista1);
        
    }
    
}
