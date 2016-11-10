package Datos;

import java.util.Comparator;

public class OrdenarEmpleadoPorSueldoInverso implements Comparator<Empleado> {

    @Override
    public int compare(Empleado o1, Empleado o2) {
        return (int) (o1.getSueldo() - o2.getSueldo()); // Devuelve un entero positivo si el sueldo de o1 es menor que el de o2
    }

}
