package biblioteca;
public class Revista extends Publicaciones {

    public int getSerialRevista() {
        return serialRevista;
    }

    public void setSerialRevista(int serialRevista) {
        this.serialRevista = serialRevista;
    }

    public Revista(int serialRevista, int codigo, String titulo, int añoPublicacion) {
        super(codigo, titulo, añoPublicacion);
        this.serialRevista = serialRevista;
    }
    
    private int serialRevista;

    @Override
    public String toString() {
        return  super.toString() + "Revista{" + "serialRevista=" + serialRevista + '}';
    }
    
}
