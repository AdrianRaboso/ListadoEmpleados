package Datos;

import java.util.Comparator;

public class OrdenarEmpleadoPorNombre implements Comparator<Empleado> {

    @Override
    public int compare(Empleado o1, Empleado o2) {
        return o1.getNombre().compareToIgnoreCase(o2.getNombre()); // Devuelve un entero positivo si el nombre de o1 es mayor que el de o2
    }

}