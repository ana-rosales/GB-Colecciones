package cine.servicios;

import cine.entidades.Pelicula;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;

/**
 * En el servicio deberemos tener un bucle que crea un objeto Pelicula
 * pidiéndole al usuario todos sus datos y guardándolos en el objeto Pelicula.
 *
 * @author paula
 */
public class ServicioPelicula {

    private static Scanner ent;
    private ArrayList<Pelicula> peliculas;

    public ServicioPelicula() {
        ent = new Scanner(System.in);
        peliculas = new ArrayList<>();
    }

    public ServicioPelicula(ArrayList<Pelicula> peliculas) {
        ent = new Scanner(System.in);
        this.peliculas = peliculas;
    }

    public ArrayList<Pelicula> getPeliculas() {
        return peliculas;
    }

    /**
     * Metodo que solicita, crea y agrega
     */
    public void solicitarPeliculas() {
        boolean seguir;

        System.out.println("\nSOLICITANDO PELICULAS\n");
        do {
            seguir = false;
            agregarPelicula(crearPelicula(solicitarTitulo(), solicitarDirector(), solicitarDuracion()));
            seguir = continuar();
        } while (seguir);
    }

    /**
     * Metodo que ordena las peliculas alfabeticamente de acuerdo a su titulo.
     */
    public void ordenarPorTitulo() {
        System.out.println("\nPOR TITULO\n");
        peliculas.sort(Pelicula.compararTitulo);
    }

    /**
     * Metodo que ordena las peliculas alfabeticamente de acuerdo a su director.
     */
    public void ordenarPorDirector() {
        System.out.println("\nPOR DIRECTOR\n");
        peliculas.sort(Pelicula.compararDirector);
    }

    /**
     * Metodo que ordena las peliculas de acuerdo a su duracion, de menor a
     * mayor.
     */
    public void ordenarADuracionMayor() {
        System.out.println("\nPOR DURACION (MENOR A MAYOR)\n");
        peliculas.sort(Pelicula.compararADuracionMayor);
    }

    /**
     * Metodo que ordena las peliculas de acuerdo a su duracion, de mayor.
     */
    public void ordenarADuracionMenor() {
        System.out.println("\nPOR DURACION (MAYOR A MENOR)\n");
        peliculas.sort(Pelicula.compararADuracionMenor);
    }

    /**
     * Metodo que muestra todas las peliculas de la lista.
     */
    public void mostrarPeliculas() {
        System.out.println("\nMOSTRANDO PELICULAS\n");
        Iterator<Pelicula> it = peliculas.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }

    /**
     * Metodo que crea una pelicula. Se puede probar si la pelicula se crea
     * correctamente.
     *
     * @param titulo
     * @param director
     * @param duracion
     * @return pelicula
     */
    public Pelicula crearPelicula(String titulo, String director, double duracion) {
        return new Pelicula(titulo, director, duracion);
    }

    /**
     * Metodo que agrega una pelicula a la lista de peliculas. Se puede probar
     * que agregue correctamente la pelicula.
     *
     * @param a
     */
    public void agregarPelicula(Pelicula p) {
        peliculas.add(p);
    }

    /**
     * Metodo que regresa la ultima pelicula de la lista. Funciona para probar
     * si el ordenamiento fue exitoso.
     *
     * @return
     */
    public Pelicula ultimoElemento() {
        return peliculas.get(peliculas.size() - 1);
    }

    /**
     * Metodo que le pregunta al usuario si quiere seguir ingresando alumnos.
     *
     * @return si quiere continuar o no
     */
    public boolean continuar() {
        System.out.print("¿Desea ingresar otra pelicula? S/N: ");
        return ent.nextLine().equalsIgnoreCase("S");
    }

    /**
     * Metodo que solicita el titulo de la pelicula.
     *
     * @return titulo
     */
    public String solicitarTitulo() {
        System.out.print("Ingrese el titulo de la pelicula: ");
        return ent.nextLine();
    }

    /**
     * Metodo que solicita el director de la pelicula.
     *
     * @return director
     */
    public String solicitarDirector() {
        System.out.print("Ingrese el director de la pelicula: ");
        return ent.nextLine();
    }

    /**
     * Metodo que solicita la duracion de la pelicula.
     *
     * @return duracion
     */
    public double solicitarDuracion() {
        System.out.print("Ingrese la duracion de la pelicula: ");
        double duracion = ent.nextDouble();
        ent.nextLine();
        return duracion;
    }

}
