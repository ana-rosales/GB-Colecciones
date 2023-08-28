package perros;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;
import perros.services.ServicioPerro;

/**
 *
 * @author paula
 */
public class main {

    public static void main(String[] args) {
        
        /**
         * Ejercicio 01: Diseñar un programa que lea y guarde razas de perros en
         * un ArrayList de tipo String. El programa pedirá una raza de perro en
         * un bucle, el mismo se guardará en la lista y después se le preguntará
         * al usuario si quiere guardar otro perro o si quiere salir. Si decide
         * salir, se mostrará todos los perros guardados en el ArrayList.
         */
        
        ServicioPerro sp = new ServicioPerro();
        boolean opc, encontrado;

        do {
            opc = false;
            sp.insertarRaza(sp.solicitarRaza());
            opc = sp.otraRaza();
        } while (opc);

        System.out.println("You're exiting right now. Take a look to the list you've made: ");
        sp.mostrarRazas();
        
        /**
         * Ejercicio 02: Continuando el ejercicio anterior, después de mostrar los perros, al
         * usuario se le pedirá un perro y se recorrerá la lista con un
         * Iterator, se buscará el perro en la lista. Si el perro está en la
         * lista, se eliminará el perro que ingresó el usuario y se mostrará la
         * lista ordenada. Si el perro no se encuentra en la lista, se le
         * informará al usuario y se mostrará la lista ordenada.
         */
        
        System.out.println("Now we're gonna search for a type of dog.");
        do {            
            encontrado = sp.buscarRaza(sp.solicitarRaza());
            if (encontrado) {
                System.out.println("Type of dog found and deleted.");
            } else {
                System.out.println("Sorry, type of dog not found.");
            }
            System.out.println("Showing the sorted list of types:");
            sp.ordenarRazas();
            sp.mostrarRazas();
            opc = sp.otraRaza();
        } while (opc);
        
        

    }

}
