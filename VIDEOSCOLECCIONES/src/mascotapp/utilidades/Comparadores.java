
package mascotapp.utilidades;

import java.util.Comparator;
import mascotapp.entidades.Mascota;

/**
 *
 * @author Ana Paula
 */
public class Comparadores {
    
    public static Comparator<Mascota> ordenarPorNombreDesc = new Comparator<Mascota> () {
        @Override
        public int compare(Mascota t, Mascota t1){
            //se pone el siguiente antes del anterior
            return t1.getNombre().compareTo(t.getNombre());
        }
    };
    
    public static Comparator<Mascota> ordenarPorEdadDesc = new Comparator<Mascota> () {
        @Override
        public int compare(Mascota t, Mascota t1){
            return t1.getEdad().compareTo(t.getEdad());
        }
    };
    
}
