package animales;

public class Animal {

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Animal(double peso, String color) {
        this.peso = peso;
        this.color = color;
    }
    
    private double peso;
    private String color;

    @Override
    public String toString() {
        return "Animal{" + "peso=" + peso + ", color=" + color + '}';
    }
    
    
    
    
    
}
