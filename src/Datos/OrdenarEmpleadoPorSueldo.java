package Datos;

import java.util.Comparator;

public class OrdenarEmpleadoPorSueldo implements Comparator<Empleado> {

    @Override
    public int compare(Empleado o1, Empleado o2) {
        return (int) (o2.getSueldo() - o1.getSueldo()); // Devuelve un entero positivo si el sueldo de o1 es mayor que el de o2
    }

}
