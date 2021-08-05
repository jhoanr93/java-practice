public class MainClass {

    public static void main(String[] args) {
        // TODO code application logic here
        
//        Generica<Integer, String, Double> generico = new Generica<>(111, "hola", 222.0);
//        generico.mostrarTipo();
        
        Double arrayDouble[] = {4.5,6.2,2.4};
        Arreglo<Double> arregloDou = new Arreglo<>(arrayDouble);
        System.out.println(arregloDou.sumaPosiciones());
        
    }
    
}
