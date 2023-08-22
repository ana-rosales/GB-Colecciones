
package mascotapp.main;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import mascotapp.servicios.ServicioMascota;

/**
 *
 * @author Ana Pau
 */
public class MascotAPP {

    public static void main(String[] args) {

//        //VIDEO 01 - COMPARACIÓN ARREGLOS Y LISTAS
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


//        //VIDEO 02 - LISTA DE CADENAS
//        ServicioMascota servMasc = new ServicioMascota();
//        //crear dos mascotas
//        servMasc.crearMascota();;
//        servMasc.crearMascota();
//        //mostrar todos los mascotas
//        servMasc.mostrarMascotas();

//        //VIDEO 03 - LISTA DE OBJETOS
//        ServicioMascota servMasc = new ServicioMascota();
//        System.out.println("\nFabrica chiquitos\n");
//        servMasc.fabricaChiquitos(140);
//        servMasc.mostrarMascotas();
//        
//        System.out.println("\nFabrica mascotas\n");
//        servMasc.fabricaMascota(2);
//        servMasc.mostrarMascotas();


//        //VIDEO 04 - PARTE 01 - ACTUALIZAR Y ELIMINAR
//        ServicioMascota servMasc = new ServicioMascota();
//        System.out.println("\nCreando mascotas\n");
//        servMasc.fabricaMascota(2);
//        servMasc.mostrarMascotas();
//        
//        System.out.println("\nActualizando mascota 0\n");
//        servMasc.actuaizarMascota(0);
//        servMasc.mostrarMascotas();
//        
//        System.out.println("\nEliminando mascota 3\n");
//        servMasc.elminarMascota(3);
//        servMasc.mostrarMascotas();

//        //VIDEO 04 - PARTE 02 - METODOS DE LISTAS
//        String[] nombres = {"Pepe","Pepa"};
//        /**
//         * ARRAYS.ASLIST(ARREGLO)
//         * inicializar arraylist con valores.
//         */
//        List <String> nombresList = new ArrayList<>(Arrays.asList(nombres));
//        System.out.println("INICIALIZADA CON ELEMTNOS:" + nombresList.toString());
//        
//        /**
//         * ADD ALL
//         * agregar elementos de otras listas.
//         * tiene dos versiones
//         * una especifica la posición en la que se insertaran
//         * la otra los agrega al final
//         */
//        List <String> nombresList2 = new ArrayList<>();
//        nombresList2.addAll(0,nombresList);
//        System.out.println("INICIALIZADA CON ELEMTNOS 2:" + nombresList2.toString());
//        
//        /**
//         * CONTAINS
//         * devuelve booleano si se contiene el objeto indicado o conjunto de objetos.
//         */
//        System.out.println("INDICA SI CONTIENE ANA:" + nombresList2.contains("Ana"));
//        System.out.println("INDICA SI CONTIENE UN CONJUNTO DE NOMBRES:" + nombresList2.containsAll(nombresList));
//        
//        /**
//         * EQUALS
//         * Compara dos listas devuelve true solo si son identicas las listas
//         * mismo tipo, mismo size, mismos elementos.
//         */
//        System.out.println("COMPARA LISTAS:" + nombresList.equals(nombresList2));
//        
//        /**
//         * GET
//         * Obtiene el elemento en el indice especificado.
//         */
//        System.out.println("OBTIENE PRIMER ELEMENTO LISTA 1:" + nombresList.get(0));
//        
//        /**
//         * INDEX OF
//         * Devuelve el indice del objeto especificado y -1 si no encuentra.
//         */        
//        System.out.println("OBTIENE EL INDICE DE PRIMERA COINCIDENCIA DE PEPA:" + nombresList.indexOf("Pepa"));
//        
//        /**
//         * IS EMPTY
//         * Devuelve true si está vacía la lista.
//         */
//        System.out.println("INDICA SI LISTA 1 ESTÁ VACIA" + nombresList.isEmpty());
//        
//        /**
//         * LAST INDEX OF
//         * Devuelve el indice de la ultima coincidencia del objeto indicado.
//         */
//        System.out.println("OBTIENE EL INDICE DE ULTIMA COINCIDENCIA DE PEPE:" + nombresList.lastIndexOf("Pepe"));
//        
//        
//        /**
//         * REPLACE ALL
//         * reemplaza todos los elementos que cumplan con la coincidencia por otra palabra.
//         * NO SE SI SE PUEDE CON OTROS OBJETOS
//         */
//        nombresList.replaceAll(nombre -> nombre.replaceAll("Pepa", "Odiamos a Pepa"));
//        System.out.println("REEMPLAZANDO EL NOMBRE PEPA:" + nombresList.toString());
//        
//        nombresList.add("Yahir");
//        
////        ServicioMascota servMasc = new ServicioMascota();
////        servMasc.fabricaMascota(3);
////        servMasc.mostrarMascotas();
////        servMasc.reemplazarTipo();
////        servMasc.mostrarMascotas();
//        
//        /**
//         * REMOVE ALL
//         * Elimina todos los objetos que pertenezcan a la coleccion indicada.
//         */
//        nombresList.removeAll(nombresList2);
//        System.out.println("ELIMINAR UN CONJUNTO DE NOMBRES: " + nombresList.toString());
//        
//        //QUE DIFERENCIA TIENEN
//        /**
//         * ClEAR
//         * elimina todos los elementos.
//         */
//        nombresList.clear();
//        System.out.println("LIMPIAR TODA LA LISTA:" + nombresList.toString());
//        
//        /**
//         * RETAIN ALL
//         * Elimina todos los elementos que se indiquen en la coleccion.
//         */
//        nombresList.retainAll(nombresList2);
//        System.out.println("RETENER SOLO PEPE Y PEPA: " + nombresList.toString());
//        
//        /**
//         * SET
//         * Guarda el elemento indicado en el indice indicado.
//         */
//        nombresList.addAll(Arrays.asList("Veronica","Ana","Michel","Yahir"));
//        nombresList.set(0, "Ana BONITA");
//        System.out.println("ALMACENAR POR INDICE: " + nombresList.toString());
//        
//        /**
//         * SORT
//         * Ordena de acuerdo a un comparador.
//         */
//        nombresList.sort(Comparator.naturalOrder());
//        System.out.println("ORDENANDO LISTA: " + nombresList.toString());
//        
//        /**
//         * SUBLIST
//         * Devuelve una lista con los elementos hasta n-1.
//         */
//        System.out.println("SUBLIST: " + nombresList.subList(0, 3));
//        
//        /**
//         * TOARRAY
//         * Devuelve un arreglo de objetos si no se especifica,
//         * de lo contrario devuelve un arreglo del tipo especificado.
//         */
//        System.out.println("CONVERTIR A ARREGLO DE OBJETOS: " + Arrays.toString(nombresList.toArray()));
//        System.out.println("CONVERTIR A ARREGLO DE STRINGS: " + Arrays.toString(nombresList.toArray( new String[0] )));
//        
//        /**
//         * STILL UNKNOWN
//         * - ITERATOR
//         * - FOREACH
//         * - SPLITERATOR
//         * - STREAM
//         * - WAIT
//         */

        //VIDEO 05: RECORRER UNA LISTA
        
        ArrayList<String> personas = new ArrayList<>(Arrays.asList("Michel","Yahir feo","Viktor","Omar","Vania","Michelle","Adri","Pame","Vanessa","Jimena"));
        
        System.out.println("\nRECORRIENDO CON FOR ELEMENT\n");
        for (String persona : personas) {
            System.out.println(persona);
        }
        
        System.out.println("\nRECORRIENDO CON FOR I\n");
        for (int i = 0; i < personas.size(); i++) {
            System.out.println(personas.get(i));
        }
        
        System.out.println("\nRECORRIENDO CON FOREACH\n");
        personas.forEach(e -> System.out.println(e));
        
        System.out.println("\nRECORRIENDO CON ITERATOR\n");
        Iterator<String> it = personas.iterator();
        
        while(it.hasNext()){
            System.out.println(it.next());
            if(it.next().equalsIgnoreCase("yahir feo")){
                it.remove();
                System.out.println("\nELIMINANDO CON ITERATOR\n");
            }
        }        
        System.out.println(personas.toString());
    }
    
}
