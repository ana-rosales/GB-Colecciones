package bussiness.services;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

/**
 *
 * @author paula
 */
public class ProductService {

    private static Scanner ent;
    private static HashMap<String, Double> products;

    public ProductService(HashMap<String, Double> products) {
        ent = new Scanner(System.in);
        this.products = products;
    }

    public ProductService() {
        ent = new Scanner(System.in);
        products = new HashMap<>();
    }

    public static HashMap<String, Double> getProducts() {
        return products;
    }

    public static void setProducts(HashMap<String, Double> aProducts) {
        products = aProducts;
    }

    /**
     * This method loads a new HashMap element, according to the info given, if
     * the key already exists, it will only update the value.
     */
    public void loadProductInfo() {
        System.out.println("\nLOADING/UPDATING PRODUCT\n");
        showProducts();
        boolean cont;
        do {
            insertProduct(getProductName(), getProductPrice());
            cont = continuar();
        } while (cont);
        System.out.println();
    }

    /**
     * This method deletes a product from the HashMap, if not encountered it
     * will be notified to the user. 
     */
    public void deleteProduct() {
        System.out.println("\nDELETING PRODUCT\n");
        showProducts();
        boolean cont;
        do {
            String product = getProductName();
            removeProduct(product);
            cont = continuar();
        } while (cont);
        System.out.println();
    }

    /**
     * Method that shows all the products in the map.
     */
    public void showProducts() {
        if (!products.isEmpty()) {
            System.out.println("\nCurrent Stock\n");
            for (Map.Entry<String, Double> entry : products.entrySet()) {
                String key = entry.getKey();
                Double value = entry.getValue();
                System.out.println(key + " : " + value);
            }
        } else {
            System.out.println("Out of Stock!");
        }
        System.out.println();
    }

    /**
     * Method that removes the product from the map. It can be tested to check 
     * whether if it deletes the corresponding product or not.
     * @param name 
     */
    public void removeProduct(String name) {
        if (products.get(name) != null) {
            products.remove(name);
        } else {
            System.out.println("Product not found.");
        }
    }

    /**
     * Method which puts a product in the map. It needs to be tested to check if
     * the product was correctly loaded.
     *
     * @param name
     * @param price
     */
    public void insertProduct(String name, Double price) {
        products.put(name, price);
    }

    /**
     * Method that returns true if the user selects Y (means yes) to continue.
     *
     * @return boolean if Y or N
     */
    public boolean continuar() {
        System.out.print("Do you want to continue? Y/N = ");
        return ent.nextLine().equalsIgnoreCase("Y");
    }

    public int selection() {
        System.out.print("Choose an index from the list = ");
        int selection = ent.nextInt();
        ent.nextLine();
        return selection;
    }

    public String getProductName() {
        System.out.print("Enter the name of the product: ");
        return ent.nextLine();
    }

    public Double getProductPrice() {
        System.out.print("Enter the price of the product: ");
        Double price = ent.nextDouble();
        ent.nextLine();
        return price;
    }

}
