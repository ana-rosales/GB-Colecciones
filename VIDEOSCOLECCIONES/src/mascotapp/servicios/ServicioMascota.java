
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
    private List<String> mascotas; //también puede ser ArrayList

    public ServicioMascota() {
        this.leer = leer = new Scanner(System.in).useDelimiter("\n");
        this.mascotas = new ArrayList();
    }
    
    /**
     * Crear mascota y almacenarla en una colección
     * de mascotas :)
     * @return 
     */
    public void crearMascota(){
        
        System.out.print("Introducir nombre: ");
        String nombre = leer.next();
        
        System.out.print("Introducir apodo: ");
        String apodo = leer.next();
        
        System.out.print("Introducir tipo: ");
        String tipo = leer.next();
        
        String mascota = nombre + " " + apodo + " " + tipo;
        
        mascotas.add(mascota);
    }
    
    /**
     * Muestra mascotas actuales
     */
    public void mostrarMascotas(){
        
        System.out.println("Las mascotas actuales de la Lista Mascotas son: ");
        for (String mascota : mascotas) {
            System.out.println(mascota);
        }
        System.out.println("Cantidad = " + mascotas.size());
        
    }
}
