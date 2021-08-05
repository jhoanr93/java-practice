package ejercicio2;

import java.util.Objects;

public class Estudiante implements Comparable<Estudiante>{

    
    
    private String nombre;
    private String codigo;
    private int edad;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public Estudiante(String nombre, String codigo, int edad) {
        this.nombre = nombre;
        this.codigo = codigo;
        this.edad = edad;
    }
    
    

    @Override
    public int compareTo(Estudiante o) {
        return o.edad - this.edad; //De mayor a menor


    }
    
    @Override
    public String toString() {
        return "Estudiante{" + "nombre=" + nombre + ", codigo=" + codigo + ", edad=" + edad + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 29 * hash + Objects.hashCode(this.codigo);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Estudiante other = (Estudiante) obj;
        if (!Objects.equals(this.codigo, other.codigo)) {
            return false;
        }
        return true;
    }

    
    
    
    
}
