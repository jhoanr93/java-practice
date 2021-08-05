package gestionempleados2;

public class Comercial extends Empleado {

    private double comision;

    public double getComision() {
        return comision;
    }

    public void setComision(double comision) {
        this.comision = comision;
    }

    public Comercial(double comision, String nombre, int edad, double salario) {
        super(nombre, edad, salario);
        this.comision = comision;
    }

    @Override
    public String toString() {
        return super.toString() + " || Comercial{" + "comision=" + comision + '}';
    }

    @Override
    public void plus() {
        double salarioFinal = 0;
        if (this.getEdad() > 30 && this.getComision() > 200) {
            salarioFinal = this.getSalario() + comision + PLUS;
            System.out.println("PLUS APLICADO A: " + this.getNombre().toUpperCase() + " SALARIO FINAL ES: $ " + salarioFinal);
            this.setSalario(salarioFinal);
        } else {
            System.out.println("$" + super.toString());
        }

        }
}
