
public class Arreglo <T extends Number>{
    private T[] arreglo;
    
    public Arreglo(T[] arreglo){
        this.arreglo = arreglo;
    }
    
    public Double sumaPosiciones(){
        double suma = 0.0;
        for (int i = 0; i < arreglo.length; i++) {
            suma += arreglo[i].doubleValue();
        }
        return suma;
    }
}
