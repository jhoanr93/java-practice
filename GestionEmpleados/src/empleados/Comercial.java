
package empleados;

public class Comercial extends Empleado implements EmpleadoInterface, Comparable<Comercial>{
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
        return super.toString() + "Comercial{" + "comision=" + comision + '}';
    }

    @Override
    public void plus() {
        double salarioFinal = 0;
        salarioFinal = this.getSalario()+ comision + PLUS;
        System.out.println("El salario del comercial: "+ this.getNombre()+ " es: "+ salarioFinal);
    }


    @Override
    public int compareTo(Comercial o) {
        return (int) (o.getSalario() - this.getSalario());
    }

    
    
}
