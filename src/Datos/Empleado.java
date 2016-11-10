package Datos;

import java.io.Serializable;

public class Empleado implements Serializable, Comparable {

    private String nombre;
    private float sueldo;
    private boolean sexo;

    public Empleado(String name, float salary, boolean sex) {
        nombre = name;
        sueldo = salary;
        sexo = sex;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setSueldo(float sueldo) {
        this.sueldo = sueldo;
    }

    public void setSexo(boolean sexo) {
        this.sexo = sexo;
    }

    public String getNombre() {
        return nombre;
    }

    public float getSueldo() {
        return sueldo;
    }

    public boolean isSexo() {
        return sexo;
    }

    @Override
    public int compareTo(Object o) {
        Empleado emp = (Empleado) o;
        if (emp.getNombre().compareTo(this.getNombre()) > 1) {
            return -1;
        } else {
            return 1;
        }
    }
}
