
public class Generica<K, T, V> {

    private K objetoK;
    private T objetoT;
    private V objetoV;

    public Generica(K objetoK, T objetoT, V objetoV) {
        this.objetoK = objetoK;
        this.objetoT = objetoT;
        this.objetoV = objetoV;
    }

    public void mostrarTipo() {
        System.out.println("Objeto: " + objetoK.getClass().getName());
        System.out.println("Objeto: " + objetoT.getClass().getName());
        System.out.println("Objeto: " + objetoV.getClass().getName());
    }
}
