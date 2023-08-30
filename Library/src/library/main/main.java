
package library.main;

import library.services.BookService;

/**
 *
 * @author paula
 */
public class main {

    public static void main(String[] args) {
        BookService bs = new BookService();
        boolean stay = true;
        do {            
            System.out.println("\nMENU\n");
            System.out.println("1. Insert new book.");
            System.out.println("2. Stock.");
            System.out.println("3. Exit.");
            System.out.print("Choose an index from the menu: ");
            
            switch(bs.selection()){
                case 1:
                    bs.insertBooks();
                    break;
                case 2:
                    bs.stock();
                    break;
                case 3:
                    System.out.print("Quit? Y/N: ");
                    stay = !bs.cont();
                    break;
                default:
                    System.out.println("Please, select a correct option.");
            }
        } while (stay);
        
    }
    
}
