package alumnos.entidades;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * Crear una clase llamada Alumno que mantenga información sobre las notas de
 * distintos alumnos. La clase Alumno tendrá como atributos, su nombre y una
 * lista de tipo Integer con sus 3 notas.
 *
 * @author paula
 */
public class Alumno {

    private String nombre;
    private ArrayList<Integer> notas;

    public Alumno(String nombre, ArrayList<Integer> notas) {
        this.nombre = nombre;
        this.notas = notas;
    }

    public Alumno() {
        notas = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Integer> getNotas() {
        return notas;
    }

    public void setNotas(ArrayList<Integer> notas) {
        this.notas = notas;
    }

    @Override
    public String toString() {
        return "Alumno{" + "nombre=" + nombre + ", notas=" + notas.toString() + '}';
    }

    /**
     * Metodo que calcula el promedio final a partir de las 3 notas del alumno.
     * Se puede probar si el promedio calculado es correcto.
     * @return promedio final
     */
    public double promedioFinal() {
        int suma = 0;
        Iterator<Integer> it = notas.iterator();
        while (it.hasNext()) {
            suma += it.next();
        }
        return Double.parseDouble(String.valueOf(suma)) / 3;
    }
}
