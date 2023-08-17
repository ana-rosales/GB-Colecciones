
package mascotapp.main;

import java.util.ArrayList;
import mascotapp.servicios.ServicioMascota;

/**
 *
 * @author Ana Pau
 */
public class MascotAPP {

    public static void main(String[] args) {

//        //VIDEO 01
//        //Arrays
//        String[] nombresArr = new String[5];
//        
//        for (int i = 0; i < nombresArr.length; i++) {
//            nombresArr[i] = "Chiquito " + (i + 1);
//        }
//        
//        for (String nom : nombresArr) {
//            System.out.println(nom);
//        }
//        
//        //Collections
//        ArrayList<String> nombresArrList = new ArrayList<>();
//        
//        nombresArrList.add("Chiquito");
//        nombresArrList.add("Chiquito");
//        nombresArrList.add("Chiquito");
//        
//        System.out.println(nombresArrList.size());
//        nombresArrList.remove("Chiquito");
//        System.out.println(nombresArrList.size());       
//        
//        System.out.println(Integer.MAX_VALUE);


        //VIDEO 02
        ServicioMascota servMasc = new ServicioMascota();
        //crear dos mascotas
        servMasc.crearMascota();;
        servMasc.crearMascota();
        //mostrar todos los mascotas
        servMasc.mostrarMascotas();
    }
    
}
