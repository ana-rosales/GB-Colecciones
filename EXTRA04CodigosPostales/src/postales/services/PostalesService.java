package postales.services;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author paula
 */
public class PostalesService {

    private static Scanner ent;
    private HashMap<Integer, String> postales;

    public PostalesService(HashMap<Integer, String> postales) {
        ent = new Scanner(System.in);
        this.postales = postales;
    }

    public PostalesService() {
        ent = new Scanner(System.in);
        postales = new HashMap<>();
    }

    public HashMap<Integer, String> getPostales() {
        return postales;
    }

    public void setPostales(HashMap<Integer, String> postales) {
        this.postales = postales;
    }

    public void ingresarPostales() {
        System.out.println("\nINGRESAR CODIGOS POSTALES\n");
        do {
            System.out.print("Ingrese el codigo postal: ");
            int codigo = ent.nextInt();
            ent.nextLine();
            System.out.print("Ingrese la ciudad del codigo: ");
            String ciudad = ent.nextLine();
            postales.put(codigo, ciudad);
            System.out.print("\nIngresado hasta el momento:\n" + postales.entrySet() + "\n\n");
            System.out.print("Desea ingresar un nuevo codigo? S/N: ");
        } while (cont());
    }

    public void buscarCiudad() {
        System.out.println("\nBUSCAR CIUDAD\n");
        System.out.print("Ingrese el codigo postal: ");
        int codigo = ent.nextInt();
        if (postales.containsKey(codigo)) {
            System.out.println("La ciudad es: " + postales.get(codigo));
        } else {
            System.out.println("No se encontro el codigo en el sistema.");
        }
    }

    public void eliminarCiudad() {
        System.out.println("\nELIMINAR CIUDAD\n");
        System.out.print("Ingrese la ciudad a eliminar: ");
        String ciudad = ent.nextLine();
        Integer codigo = 0;
        for (Map.Entry<Integer, String> entry : postales.entrySet()) {
            String value = entry.getValue();
            if(value.equals(ciudad)){
                codigo = entry.getKey();
            }
        }
        postales.put(codigo, null);
    }

    public void mostrarPostales() {
        System.out.println("\nPOSTALES INGRESADOS\n");
        for (Map.Entry<Integer, String> entry : postales.entrySet()) {
            Integer key = entry.getKey();
            String value = entry.getValue();
            System.out.println(" - " + key + " : " + value);

        }
    }

    public boolean cont() {
        return ent.nextLine().equalsIgnoreCase("S");
    }

    public int selection() {
        int sel = ent.nextInt();
        ent.nextLine();
        return sel;
    }
}
