package gestionempleados2;

public class Repartidor extends Empleado {

    private String zona;

    public String getZona() {
        return zona;
    }

    public void setZona(String zona) {
        this.zona = zona;
    }

    public Repartidor(String zona, String nombre, int edad, double salario) {
        super(nombre, edad, salario);
        this.zona = zona;
    }

    @Override
    public String toString() {
        return super.toString() + " || Repartidor{" + "zona=" + zona + '}';
    }

    @Override
    public void plus() {
        double salarioFinal = 0;

        if (this.getEdad() < 25 && this.getZona().equals("zona 3")) {
            salarioFinal = this.getSalario() + PLUS;
            System.out.println("PLUS APLICADO A: " + this.getNombre().toUpperCase() + " SALARIO FINAL = " + salarioFinal);
            this.setSalario(salarioFinal);
        } else {
            System.out.println("#" + super.toString());
        }

    }

}
