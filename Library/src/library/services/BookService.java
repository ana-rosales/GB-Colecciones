
package library.services;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import library.entities.Book;

/**
 *
 * @author paula
 */
public class BookService {
    private static Scanner ent;
    private static HashSet<Book> bookSet;

    public BookService(HashSet<Book> bookSet){
        ent = new Scanner(System.in);
        this.bookSet = new HashSet<>(bookSet);
    }
    
    public BookService() {
        ent = new Scanner(System.in);
        bookSet = new HashSet<>();
    }

    public static HashSet<Book> getBookSet() {
        return bookSet;
    }

    public static void setBookSet(HashSet<Book> aBookSet) {
        bookSet = aBookSet;
    }
    
    /**
     * Asks the user to insert the book information, then it calls the method
     * that creates the book object and finally it calls the method which adds
     * the new object to the set.
     */
    public void insertBooks(){
        System.out.println("\nNEW BOOKS\n");
        do {            
            System.out.println("Please enter the title of the book: ");
            String title = ent.nextLine();
            System.out.println("Please enter the author of the book: ");
            String author = ent.nextLine();
            System.out.println("Please enter the number of copies left: ");
            int copiesL = ent.nextInt();
            ent.nextLine();
            System.out.println("Please enter the number of lent copies: ");
            int Lcopies = ent.nextInt();
            ent.nextLine();
            addBook(createBook(title, author, copiesL, Lcopies));
            System.out.print("Wanna insert another book? Y/N: ");
        } while (cont());
    }
    
    /**
     * Shows all the books in stock.
     */
    public void stock(){
        Iterator<Book> it = bookSet.iterator();
        while (it.hasNext()) {
            Book next = it.next();
            System.out.println(next);
        }
    }
    
    /**
     * Method that creates a book object according to the parameters given.
     * @param title
     * @param author
     * @param copiesL
     * @param Lcopies
     * @return book
     */
    public Book createBook(String title, String author, int copiesL, int Lcopies){
        return new Book(title, author, copiesL, Lcopies);
    }
    
    /**
     * Method that adds the object book given as a parameter in the list.
     * @param b 
     */
    public void addBook(Book b){
        bookSet.add(b);
    }
    
    public boolean cont(){
        return ent.nextLine().equalsIgnoreCase("Y");
    }
    
    public int selection(){
        int sel = ent.nextInt();
        ent.nextLine();
        return sel;
    }
}
