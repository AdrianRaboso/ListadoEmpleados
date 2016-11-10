package Datos;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.NoSuchElementException;

public class Utilidades {

    public static LinkedList cambiarEmpleadosDelFicheroALaLista() {
        LinkedList lista = new LinkedList();
        ObjectInputStream ois = null;
        FileInputStream fis = null;
        try {
            fis = new FileInputStream("baseDatosEmpleado");
            Empleado empBuscar;
            while (fis.available() > 0) {
                //Sacamos los objetos del fichero y los guardamos en la lista:
                ois = new ObjectInputStream(fis);
                empBuscar = (Empleado) ois.readObject();
                lista.add(empBuscar);
            }
        } catch (ClassNotFoundException | IOException ex) {
            System.out.println("Error cambiarEmpleadosDelFicheroALaLista: " + ex.getMessage());
        } finally {
            try {
                //Cerramos los ficheros.
                ois.close();
                fis.close();
            } catch (IOException | NullPointerException ex) {
                System.out.println("Error cerrando el archivo.");
            }
        }
        return lista;
    }

    public static LinkedList cambiarUsuariosALaLista() {
        LinkedList lista = new LinkedList();
        ObjectInputStream ois = null;
        FileInputStream fis = null;
        try {
            fis = new FileInputStream("UsuarioYContraseña");
            UsuarioYContraseña usuario;
            while (fis.available() > 0) {
                //Sacamos los objetos del fichero y los guardamos en la lista:
                ois = new ObjectInputStream(fis);
                usuario = (UsuarioYContraseña) ois.readObject();
                lista.add(usuario);
            }
        } catch (ClassNotFoundException | IOException ex) {
            System.out.println("Error cambiarUsuariosALaLista: " + ex.getMessage());
        } finally {
            try {
                //Cerramos los ficheros.
                ois.close();
                fis.close();
            } catch (IOException | NullPointerException ex) {
                System.out.println("Error cerrando el archivo.");
            }
        }
        return lista;
    }

    public static LinkedList cambiarEmpleadosDelFicheroALaListaConRutaEspecifica(String ruta) {
        LinkedList lista = new LinkedList();
        ObjectInputStream ois = null;
        FileInputStream fis = null;
        try {
            fis = new FileInputStream(ruta);
            Empleado empBuscar;
            while (fis.available() > 0) {
                //Sacamos los objetos del fichero y los guardamos en la lista:
                ois = new ObjectInputStream(fis);
                empBuscar = (Empleado) ois.readObject();
                lista.add(empBuscar);
            }
        } catch (ClassNotFoundException | IOException ex) {
            System.out.println("Error cambiarEmpleadosDelFicheroALaLista: " + ex.getMessage());
        } finally {
            try {
                //Cerramos los ficheros.
                ois.close();
                fis.close();
            } catch (IOException | NullPointerException ex) {
                System.out.println("Error cerrando el archivo.");
            }
        }
        return lista;
    }

    public static int buscarEmpleadoEnLista(LinkedList lista, String nombre) {
        Empleado empBuscar;
        int index = 0;
        try {
            Iterator<Empleado> ite = lista.listIterator();
            while (ite.hasNext()) {
                empBuscar = ite.next();
                if (nombre.equalsIgnoreCase(empBuscar.getNombre())) {
                    index = lista.indexOf(empBuscar);
                    break;//Salimos del bucle y enviamos el indice del objeto.
                }
            }
        } catch (NoSuchElementException | NullPointerException e) {
            index = 0;
        }
        return index;
    }

    public static boolean exitsUserAndPass(LinkedList lista, String user) {
        UsuarioYContraseña obj;
        try {
            Iterator<UsuarioYContraseña> ite = lista.listIterator();
            do {
                obj = ite.next();
                if (user.equals(obj.getUser())) {
                    return true;
                }

            } while (ite.hasNext());
        } catch (NoSuchElementException | NullPointerException e) {
        }
        return false;
    }

    public static Empleado buscarEmpleadoEnListaDevuelveEmp(LinkedList lista, String nombre) {
        Empleado empBuscar = null;
        try {
            Iterator<Empleado> ite = lista.listIterator();
            while (ite.hasNext()) {
                empBuscar = ite.next();
                if (nombre.equalsIgnoreCase(empBuscar.getNombre())) {
                    break;//Salimos del bucle y enviamos el indice del objeto.
                }
            }
        } catch (NoSuchElementException | NullPointerException e) {
        }
        return empBuscar;
    }

    public static String visListaempleado(LinkedList lista) {
        ListIterator<Empleado> ite = lista.listIterator();
        Empleado emp;
        while (ite.hasNext()) {
            emp = ite.next();
            emp.getNombre();
            return emp.getNombre();
        }
        return "";
    }

    public static void guardarListaEnFichero(LinkedList lista, String ruta) {
        ObjectOutputStream oos = null;
        Iterator<Empleado> ite = lista.iterator();
        File fichero = new File(ruta);
        fichero.delete();
        try {
            Empleado emp = ite.next();
            oos = new ObjectOutputStream(new FileOutputStream(fichero));
            oos.writeObject(emp);

            while (ite.hasNext()) {
                emp = ite.next();
                oos = new ObjectOutputStream(new FileOutputStream(fichero, true));
                oos.writeObject(emp);
            }
        } catch (Exception ex) {
            System.out.println("Error: 'guardarListaEnFichero': " + ex.getMessage());
        } finally {
            try {
                //Cerramos los ficheros.
                oos.close();
            } catch (IOException | NullPointerException ex) {
                System.out.println("Error cerrando el archivo: 'guardarListaEnFichero'");
            }
        }
    }

    public static void guardarListaUsuarioEnFichero(LinkedList lista) {
        ObjectOutputStream oos = null;
        Iterator<UsuarioYContraseña> ite = lista.iterator();
        File fichero = new File("UsuarioYContraseña");
        fichero.delete();
        try {
            UsuarioYContraseña user = ite.next();
            oos = new ObjectOutputStream(new FileOutputStream(fichero));
            oos.writeObject(user);

            while (ite.hasNext()) {
                user = ite.next();
                oos = new ObjectOutputStream(new FileOutputStream(fichero, true));
                oos.writeObject(user);
            }
        } catch (Exception ex) {
            System.out.println("Error: 'guardarListaUsuarioEnFichero': " + ex.getMessage());
        } finally {
            try {
                //Cerramos los ficheros.
                oos.close();
            } catch (IOException | NullPointerException ex) {
                System.out.println("Error cerrando el archivo: 'guardarListaUsuarioEnFichero'");
            }
        }
    }

    public static void guardarListaEnFichero(LinkedList lista) {
        ObjectOutputStream oos = null;
        Iterator<Empleado> ite = lista.iterator();
        File fichero = new File("baseDatosEmpleado");
        fichero.delete();
        try {
            Empleado emp = ite.next();
            oos = new ObjectOutputStream(new FileOutputStream(fichero));
            oos.writeObject(emp);

            while (ite.hasNext()) {
                emp = ite.next();
                oos = new ObjectOutputStream(new FileOutputStream(fichero, true));
                oos.writeObject(emp);
            }
        } catch (Exception ex) {
            System.out.println("Error: 'guardarListaEnFichero': " + ex.getMessage());
        } finally {
            try {
                //Cerramos los ficheros.
                oos.close();
            } catch (IOException | NullPointerException ex) {
                System.out.println("Error cerrando el archivo: 'guardarListaEnFichero'");
            }
        }
    }

    public static void guardarFicheroEnRutaEspecifica(LinkedList lista, String ruta) {
        ObjectOutputStream oos = null;
        Iterator<Empleado> ite = lista.iterator();
        File fichero = new File(ruta);
        fichero.delete();
        try {
            Empleado emp = ite.next();
            oos = new ObjectOutputStream(new FileOutputStream(fichero));
            oos.writeObject(emp);

            while (ite.hasNext()) {
                emp = ite.next();
                oos = new ObjectOutputStream(new FileOutputStream(fichero, true));
                oos.writeObject(emp);
            }
        } catch (Exception ex) {
            System.out.println("Error: 'guardarListaEnFichero': " + ex.getMessage());
        } finally {
            try {
                //Cerramos los ficheros.
                oos.close();
            } catch (IOException | NullPointerException ex) {
                System.out.println("Error cerrando el archivo: 'guardarListaEnFichero'");
            }
        }
    }
}
