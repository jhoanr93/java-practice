package biblioteca;
public class Publicaciones {
    private int codigo;
    private String titulo;
    private int añoPublicacion;

    public Publicaciones(int codigo, String titulo, int añoPublicacion) {
        this.codigo = codigo;
        this.titulo = titulo;
        this.añoPublicacion = añoPublicacion;
    }

    @Override
    public String toString() {
        return "Publicaciones{" + "codigo=" + codigo + ", titulo=" + titulo + ", a\u00f1oPublicacion=" + añoPublicacion + '}';
    }
}
