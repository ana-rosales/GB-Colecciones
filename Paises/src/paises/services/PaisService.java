
package paises.services;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;
import paises.entidades.Pais;

/**
 *
 * @author paula
 */
public class PaisService {
    private static Scanner ent;
    private static HashSet<Pais> paises;
    private static TreeSet<Pais> paisesOrdenado;

    public PaisService(HashSet<Pais> paises) {
        ent = new Scanner(System.in);
        this.paises = paises;
        this.paisesOrdenado = new TreeSet<>();
        ordenarAlfabeticamente();
    }
    
    public PaisService() {
        ent = new Scanner(System.in);
        paises = new HashSet<>();
        paisesOrdenado = new TreeSet<>();
    }

    public static HashSet<Pais> getPaises() {
        return paises;
    }

    public static void setPaises(HashSet<Pais> aPaises) {
        paises = aPaises;
    }
    
    public static TreeSet<Pais> getPaisesOrdenado() {
        return paisesOrdenado;
    }

    public static void setPaisesOrdenado(TreeSet<Pais> aPaises) {
        paisesOrdenado = aPaises;
    }
    
    /**
     * Metodo que crea uno o varios paises a partir de los datos proporcionados
     * por el usuario, en bucle; tambien los guarda en un set.
     */
    public void solicitarPaises(){
        boolean seguir;
        do {
            System.out.println("\nCREATING A COUNTRY\n");
            agregarPais(crearPais(getName(), getHabitants()));
            seguir = continuar();
        } while (seguir);
        
        mostrarPaises(paises);
    }
    
    /**
     * Metodo que ordena alfabeticamente los paises ingresados y se los almacena
     * en un TreeSet.
     */
    public void ordenarAlfabeticamente(){
        paisesOrdenado = new TreeSet<Pais>(Pais.compararNombre);
        Iterator<Pais> it = paises.iterator();
        while (it.hasNext()) {
            paisesOrdenado.add(it.next());
        }
        
        mostrarPaises(paisesOrdenado);
    }
    
    /**
     * Metodo que solicita un nombre de pais y lo pasa como argumento al metodo
     * que elimina paises, si lo encuentra se elimina, se le indica al usuario
     * si se elimino o no.
     */
    public void buscarPais(){
        System.out.println("\nDELETE A COUNTRY FROM THE SET.\n");
        boolean found = eliminarPais(getName());
        if(found){
            System.out.println("Country deleted.");
        } else {
            System.out.println("Country not found.");
        }
        mostrarPaises(paises);
        mostrarPaises(paisesOrdenado);
    }
    
    /**
     * Metodo que muestra el contenido de un conjunto de paises.
     * @param paises 
     */
    public void mostrarPaises(Set<Pais> paises){
        System.out.println("\nMOSTRANDO TODOS LOS PAISES\n");
        Iterator it = paises.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }
    
    /**
     * Metodo que crea un pais.
     * Se puede probar que cree correctamente al pais.
     * @param nombre
     * @param habitants
     * @return el pais creado
     */
    public Pais crearPais(String nombre, int hab) {
        return new Pais(nombre,hab);
    }
    
    /**
     * Metodo que agrega un alumno al conjunto de paises.
     * Se puede probar que agregue correctamente al pais.
     * @param a 
     */
    public void agregarPais(Pais a){
        paises.add(a);
        ordenarAlfabeticamente();
    }
    
     /**
     * Metodo que busca a un pais en la lista de paises y si lo encuentra lo
     * elimina.
     * Es necesario probar si si encuentra el pais.
     * @param nombre
     * @return verdadero si encuentra, falso si no.
     */
    public boolean eliminarPais(String nombre) {
        Iterator<Pais> it = paises.iterator();
        boolean encontrado = false;
        while (it.hasNext()) {
            if (it.next().getNombre().equalsIgnoreCase(nombre)) {
                encontrado = true;
                it.remove();
                ordenarAlfabeticamente();
                break;
            }
        }
        return encontrado;
    }
    
    /**
     * Metodo que le pregunta al usuario si quiere seguir ingresando alumnos.
     * @return si quiere continuar o no
     */
    public boolean continuar() {
        System.out.print("¿Desea continuar? S/N: ");
        return ent.nextLine().equalsIgnoreCase("S");
    }
    
    /**
     * Metodo que solicita el nombre de un pais y lo devuelve.
     * @return nombre de pais.
     */
    public String getName(){
        System.out.print("Please, enter the name of the country: ");
        return ent.nextLine();
    }

    /**
     * Metodo que solicita la cantidad de habitantes de un pais.
     * @return habitantes de un pais.
     */
    public int getHabitants(){
        System.out.print("Please, enter the amount of habitants: ");
        int hab = ent.nextInt();
        ent.nextLine();
        return hab;
    }
    
    
}
