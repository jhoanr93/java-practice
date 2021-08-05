package biblioteca;

public class Libros extends Publicaciones implements Prestable{

    public boolean isPrestado() {
        return prestado;
    }

    public void setPrestado(boolean prestado) {
        this.prestado = false;
    }
    
    private boolean prestado;

    public Libros(int codigo, String titulo, int añoPublicacion) {
        super(codigo, titulo, añoPublicacion);
        
    }

    @Override
    public void prestar() {
        this.prestado = true;
    }

    @Override
    public void devolver() {
        this.prestado = false;
    }

    @Override
    public void prestado() {
        System.out.println("El libro esta " + this.prestado);
        
    }

    @Override
    public String toString() {
        return super.toString()+ "Libros{" + "prestado=" + prestado + '}';
    }
    
    
    
}
