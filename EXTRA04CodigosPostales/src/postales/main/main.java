
package postales.main;

import postales.services.PostalesService;

/**
 *
 * @author paula
 */
public class main {

    public static void main(String[] args) {
        PostalesService ps = new PostalesService();
        boolean seguir = true;
        int opc;
        do {            
            System.out.println("\nMENU\n");
            System.out.println("1. Insertar CP.");
            System.out.println("2. Buscar ciudad.");
            System.out.println("3. Eliminar ciudad.");
            System.out.println("4. Mostrar CPs.");
            System.out.println("5. Exit.");
            System.out.print("Elije un indice del menu: ");
            opc = ps.selection();
            
            switch(opc){
                case 1:
                    ps.ingresarPostales();
                    break;
                case 2:
                    ps.buscarCiudad();
                    break;
                case 3:
                    ps.eliminarCiudad();
                    break;
                case 4:
                    ps.mostrarPostales();
                    break;
                case 5:
                    System.out.println();
                    System.out.print("Salir? S/N: ");
                    seguir = !ps.cont();
                    break;
                default:
                    System.out.println("Por favor, elija un valor valido.");
            }
        } while (seguir);
    }
    
}
