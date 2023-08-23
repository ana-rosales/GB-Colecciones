
package guiacolecciones;

import guiacolecciones.entidades.Libro;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;

/**
 *
 * @author Ana Paula
 */
public class main {

    public static void main(String[] args) {
        
        /**
         * Ejercicio 01:
         * Corrige el siguiente código: Array<int> listado = new ArrayList;
         * TreeSet<String> = TreeSet(); HashMap<Integer> personas = new
         * HashMap<>;
         */
        System.out.println("\nEjecutando Ejercicio 01: Corrección de errores.\n");
        ArrayList<Integer> listado = new ArrayList<>();
        TreeSet<String> setordenado = new TreeSet<>();
        HashMap<Integer,String> personas = new HashMap<>();
        
        /**
         * Ejercicio 02:
         * Toma la Lista, el Conjunto y el Mapa del ejemplo y agrega 5 objetos a
         * cada uno.
         */
        System.out.println("\nEjecutando Ejercicio 02: Agregar elementos.\n");
        ArrayList<Integer> numerosA = new ArrayList<>();
        int ejemploArreglo = 20;
        numerosA.add(ejemploArreglo);
        int num1 = 1, num2 = 2, num3 = 3, num4 = 4, num5 = 5;
        numerosA.add(num1);
        numerosA.add(num2);
        numerosA.add(num3);
        numerosA.add(num4);
        numerosA.add(num5);
        
        System.out.println("arreglo: " + numerosA.toString());
        
        HashSet<Integer> numerosB = new HashSet<>();
        Integer ejemploHash = 20;
        numerosB.add(ejemploArreglo);
        numerosB.add(num1);
        numerosB.add(num2);
        numerosB.add(num3);
        numerosB.add(num4);
        numerosB.add(num5);
        
        System.out.println("set: " + numerosB.toString());
        
        HashMap<Integer,String> alumnos = new HashMap<>();
        int dniEjemplo = 34576189;
        String nombreEjemplo = "Pepe";
        alumnos.put(dniEjemplo, nombreEjemplo);
        int dni1 = 12345678, dni2 = 87654321, dni3 = 24680246, dni4 = 13579135, dni5 = 14725836;
        String nombre1 = "ana", nombre2 = "axel", nombre3 = "yahir", nombre4 = "vik", nombre5 = "ella";
        alumnos.put(dni1, nombre1);
        alumnos.put(dni2, nombre2);
        alumnos.put(dni3, nombre3);
        alumnos.put(dni4, nombre4);
        alumnos.put(dni5, nombre5);
        
        System.out.println("mapa: " + alumnos.toString());
        
        /**
         * Ejercicio 03: Toma la Lista, el Conjunto y el Mapa que hiciste
         * previamente y elimina en cada uno un objeto de cada forma que
         * aprendiste arriba.
         */
        System.out.println("\nEjecutando Ejercicio 03: Eliminación de elementos.\n");
        numerosA.remove(5);
        numerosA.remove(0);
        numerosA.removeIf(num -> num % 2 == 0);
        System.out.println("Actualización arreglo: " + numerosA.toString());
        
        numerosB.remove(3);
        numerosB.removeIf(num -> num % 2 != 0);
        System.out.println("Actualizacion conjunto: " + numerosB.toString());
        
        alumnos.remove(dni2);
        System.out.println("Actualización mapa: " + alumnos.toString());
        
        /**
         * Ejercicio 04: Corrige el siguiente codigo.
         */
        System.out.println("\nEjecutando Ejercicio 04: Correccion de errores.\n");
        HashMap<Integer,String> personas2 = new HashMap<>();
        String n1 = "Albus";
        String n2 = "Severus";
        personas.put(1, n1);
        personas.put(2, n2);
        System.out.println("Resultado: " + personas.toString());
        
        /**
         * Ejercicio 05: Corrige el siguiente codigo.
         */
        System.out.println("\nEjecutando Ejercicio 05: Correccion de errores.\n");
        ArrayList<String> bebidas = new ArrayList<>();
        bebidas.add("cafe");
        bebidas.add("te");
        Iterator<String> it = bebidas.iterator();
        while(it.hasNext()){
            if (it.next().equals("cafe")){
                it.remove();
            }
        }
        System.out.println("Resultado: " + bebidas.toString());
        
        /**
         * Ejercicio 06: ¡Es tu turno! Crea una lista de Libros y muestra el título de cada uno con un bucle.
         */
        System.out.println("\nEjecutando Ejercicio 06: Lista de objetos propios.\n");
        ArrayList<Libro> libros = new ArrayList<>();
        Iterator<Libro> itLib = libros.iterator();
        Libro lib1 = new Libro("Susane Collins", 300, "Antes de ti");
        Libro lib2 = new Libro("J. K. Rowlin", 600, "Harry Potter");
        Libro lib3 = new Libro("Gabriel Garcia Marquez", 500, "100 anios de soledad");
        libros.addAll(Arrays.asList(lib1, lib2, lib3));
        
        for (Libro libro : libros) {
            System.out.println(" - " + libro);
        }
        
    }
}
 