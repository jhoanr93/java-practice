package enums;
public class Vehiculo {

    public Vehiculo(Marca marca, String color, String placa) {
        this.marca = marca;
        this.color = color;
        this.placa = placa;
    }

    @Override
    public String toString() {
        return "Vehiculo{" + "marca=" + marca + ", precio= " + marca.getValor() +", color=" + color + ", placa=" + placa + '}';
    }

    public Marca getMarca() {
        return marca;
    }

    public String getColor() {
        return color;
    }

    public String getPlaca() {
        return placa;
    }
    
    public Marca marca;
    public String color;
    public String placa;
}
