
package bussiness.main;

import bussiness.services.ProductService;

/**
 *
 * @author paula
 */
public class main {

    public static void main(String[] args) {
        ProductService ps = new ProductService();
        int opc;
        boolean cont;
        do {
            System.out.println("\nMENU\n");
            System.out.println("1. Load/modify a product.");
            System.out.println("2. Delete a product.");
            System.out.println("3. Show all products.");
            opc = ps.selection();
            switch(opc){
                case 1:
                    ps.loadProductInfo();
                    break;
                case 2:
                    ps.deleteProduct();
                    break;
                case 3:
                    ps.showProducts();
                    break;
                default:
                    System.out.println("Select a correct option, please.");
            }
            cont = ps.continuar();
        } while (cont);
    }
    
}
