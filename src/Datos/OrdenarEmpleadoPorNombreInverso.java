package Datos;

import java.util.Comparator;

public class OrdenarEmpleadoPorNombreInverso implements Comparator<Empleado> {

    @Override
    public int compare(Empleado o1, Empleado o2) {
        return o2.getNombre().compareToIgnoreCase(o1.getNombre()); // Devuelve un entero positivo si el nombre de o1 es menor que el de o2
    }

}
