package perros.services;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author paula
 */
public class ServicioPerro {

    private ArrayList<String> razas = new ArrayList<>();
    private static Scanner ent = new Scanner(System.in);

    public ServicioPerro() {
    }

    public ServicioPerro(ArrayList<String> razas) {
        this.razas = razas;
    }

    public String solicitarRaza() {
        System.out.print("\nPlease, insert a type of dog: ");
        String raza = ent.nextLine();
        return raza;
    }

    public void insertarRaza(String raza) {
        razas.add(raza);
    }

    public boolean otraRaza() {
        System.out.print("Do you want to insert other? Y/N: ");
        return ent.nextLine().equalsIgnoreCase("Y");
    }

    /**
     * Metodo que imprime los elementos de la lista con un iterator. Si el
     * iterator se declara antes de modificar la lista, al querer obtener el
     * .next() mandara error.
     */
    public String mostrarRazas() {
        String ultimo = "";
        Iterator it = razas.iterator();
        while (it.hasNext()) {
            ultimo = it.next().toString();
            System.out.println(" - " + ultimo);
        }
        return ultimo;
    }
    
    public boolean buscarRaza(String raza){
        boolean encontrado = false;
        Iterator it = razas.iterator();
        while(it.hasNext()){ 
            if(it.next().equals(raza)){
                it.remove();
                encontrado = true;
            }
        }
        return encontrado;
    }
    
    public void ordenarRazas(){
        Collections.sort(razas);
    }
    
    public String ultimaRaza(){
        return razas.get(razas.size()-1);
    }
}
