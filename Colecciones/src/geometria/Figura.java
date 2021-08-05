package geometria;

public class Figura {

    private int lado1;
    private int lado2;

    public Figura(int lado1, int lado2) {
        this.lado1 = lado1;
        this.lado2 = lado2;
    }   
    
    public Figura(int lado1) {
        this.lado1 = lado1;
        this.lado2 = lado1;
    }
       
    public void calcularArea(){
        double area = lado1*lado2;
        System.out.println("Area = "+ area);
    }
    
    public void calcularPerimetro(){
        double perimetro = 2*(lado1*lado2);
        System.out.println("Perimetro = "+ perimetro);
    }
      
    
}
