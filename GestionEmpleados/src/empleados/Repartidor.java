package empleados;

public class Repartidor extends Empleado implements EmpleadoInterface, Comparable<Repartidor>{
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
        salarioFinal = this.getSalario() + PLUS;
        System.out.println("PLUS APLICADO A: "+ this.getNombre().toUpperCase() + " SALARIO FINAL = " + salarioFinal);
        this.setSalario(salarioFinal);
    }

    @Override
    public int compareTo(Repartidor o) {
        return (int) (o.getSalario() - this.getSalario());
    }

    
    
    }
