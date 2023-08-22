
package mascotapp.servicios;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import mascotapp.entidades.Mascota;

/**
 *
 * @author Ana Paula
 */
public class ServicioMascota {
    
    private Scanner leer;
    private List<Mascota> mascotas; //también puede ser ArrayList

    public ServicioMascota() {
        this.leer = leer = new Scanner(System.in).useDelimiter("\n");
        this.mascotas = new ArrayList();
    }
    
    /**
     * Crear mascota y la devuelve.
     * @return 
     */
    public Mascota crearMascota(){
        
        System.out.print("Introducir nombre: ");
        String nombre = leer.next();
        
        System.out.print("Introducir apodo: ");
        String apodo = leer.next();
        
        System.out.print("Introducir tipo: ");
        String tipo = leer.next();
        
        return new Mascota(nombre, apodo, tipo);
    }
    
    /**
     * Añade a la lista mascotas.
     * @param m 
     */
    public void agregarMascota(Mascota m){
        mascotas.add(m);
    }
    
    /**
     * Muestra mascotas actuales
     */
    public void mostrarMascotas(){
        
        System.out.println("Las mascotas actuales de la Lista Mascotas son: ");
        for (Mascota mascota : mascotas) {
            System.out.println(mascota.toString());
        }
        System.out.println("Cantidad = " + mascotas.size());
        
    }
    
    /**
     * Crea n mascotas que se apodan CHIQUITOS
     * @param cantidad es cantidad de mascotas a crear y añadir
     * en la lista
     */
    public void fabricaChiquitos(int cantidad){
        
        for (int i = 0; i < cantidad; i++) {
            
            mascotas.add( new Mascota("Fer", "Chiquito", "Bigel"));
            
        }
        
    }
    
    /**
     * Crea mascotas pidiento datos por teclado.
     * @param cantidad
     */
    public void fabricaMascota(int cantidad){
        for (int i = 0; i < cantidad; i++) {
            Mascota nuevoAmigo = crearMascota();
            agregarMascota(nuevoAmigo);
            System.out.println(nuevoAmigo.toString());
        }
    }
    
    /**
     * Actualiza el apodo de la mascota con el indice indicado,
     * a Roberto.
     * @param index 
     */
    public void actuaizarRoberto(int index){
        //TODO Añadir Try and Catch
        Mascota m = mascotas.get(index);
        m.setApodo("Roberto");
    }
    
    /**
     * Actualiza el apodo de la mascota con el indice indicado.
     * @param index 
     */
    public void actuaizarMascota(int index){
        //TODO Añadir Try and Catch
        
        if (index <= mascotas.size() - 1) {
            System.out.println();
            System.out.println("ACTUALIZANDO");
            Mascota m = crearMascota();
            mascotas.set(index, m);
        } else {
            System.out.println("El indice es erroneo.");
        }
    }
    
    /**
     * Eliminar de acuerdo al índice.
     * @param index 
     */
    public void elminarMascota(int index){
        
        if (index <= mascotas.size() - 1) {
            mascotas.remove(index);
        } else {
            System.out.println("El indice es erroneo.");
        }
    }
    
    public void reemplazarTipo(){
        
        System.out.print("El tipo a reemplazar: ");
        String atr = leer.next();
        System.out.print("El reemplazo: ");
        String rmp = leer.next();
        
        //mascotas.replaceAll(mascota -> mascota.getRaza().replaceAll(atr, rmp));
        //AUN NO SÉ PARA QUÉ SIRVE EL FOREACH
        //TODO corregir este pedazo de codigo
    }
    
    public void eliminarMasscotaPorNombre(String nombre){
        for (int i = 0; i < mascotas.size(); i++) {
            Mascota m = mascotas.get(i);
            
            if(m.getNombre().equals(nombre)){
                mascotas.remove(i);            
            }
        }
    }
    
    public void actualizarMasscotaPorNombre(String nombreViejo, String nombreNuevo){
        for (int i = 0; i < mascotas.size(); i++) {
            Mascota m = mascotas.get(i);
            
            if(m.getNombre().equals(nombreViejo)){
                m.setNombre(nombreNuevo);
            }
        }
    }
}
