package singers.services;

import singers.entities.FamousSinger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author paula
 */
public class SingerService {

    private static Scanner ent;
    private static ArrayList<FamousSinger> singers;

    public SingerService() {
        ent = new Scanner(System.in);
        FamousSinger s1, s2, s3, s4, s5;
        s1 = new FamousSinger("Taylor Swift", "Midnights");
        s2 = new FamousSinger("Michael Jackson", "Thriller");
        s3 = new FamousSinger("Luis Miguel", "Romance");
        s4 = new FamousSinger("Kanye West", "Donda");
        s5 = new FamousSinger("The Beatles", "White Album");
        singers = new ArrayList<>(Arrays.asList(s1, s2, s3, s4, s5));
    }

    public static ArrayList<FamousSinger> getSingers() {
        return singers;
    }

    public static void setSingers(ArrayList<FamousSinger> aSingers) {
        singers = aSingers;
    }

    
    /**
     * This method iterates the list in order to show all the contents of it.
     */
    public void showSingers() {
        System.out.println("\nTHE MOST FAMOUS SINGERS:\n");
        Iterator<FamousSinger> it = singers.iterator();
        while (it.hasNext()) {
            FamousSinger next = it.next();
            System.out.println(" - " + next);
        }
    }

    /**
     * This method asks the user to insert the name and the most popular album
     * of a singer, in order to create the object of that singer, and to add
     * the object in the list.
     */
    public void newSinger() {
        System.out.println("\nNEW SINGER:\n");
        do {
            System.out.print("Please, enter the singer's name: ");
            String name = ent.nextLine();
            System.out.print("Please, enter the singer's most sold album: ");
            String album = ent.nextLine();
            addSinger(createSinger(name, album));
            System.out.print("Insert another singer? Y/N: ");
        } while (cont());
    }

    /**
     * Method that asks the user to indicate a singer to remove it from the list.
     */
    public void deleteSinger() {
        System.out.println("\nDELETING SINGER:\n");
        do {
            System.out.print("Please, enter the singer's name: ");
            String name = ent.nextLine();
            removeSinger(name);
            System.out.print("Look for another singer? Y/N: ");
        } while (cont());

    }

    /**
     * Method that removes the singer from the list, first, the method searches
     * the singer, and if it finds it, it will remove it.
     * Needs test.
     * @param name 
     */
    public void removeSinger(String name) {
        Iterator<FamousSinger> it = singers.iterator();
        boolean found = false;
        while (it.hasNext()) {
            if (it.next().getName().equalsIgnoreCase(name)) {
                it.remove();
                found = true;
                System.out.println("Found and deleted.");
            }
        }
        if(!found){
            System.out.println("Not found.");
        }
    }
    
    /**
     * Method that indicates whether an element in the list has the name
     * specified or not.
     * @param name
     * @return boolean
     */
    public boolean contains(String name){
        Iterator<FamousSinger> it = singers.iterator();
        boolean found = false;
        while (it.hasNext()) {
            if (it.next().getName().equalsIgnoreCase(name)) {
                found = true;
            }
        }
        return found;
    }

    /**
     * Method that creates an object Singer according to the parameters given.
     * Needs test
     * @param name
     * @param album
     * @return Singer
     */
    public FamousSinger createSinger(String name, String album) {
        return new FamousSinger(name, album);
    }

    /**
     * Method that adds a singer to the list.
     * Needs test.
     * @param c 
     */
    public void addSinger(FamousSinger c) {
        singers.add(c);
    }

    /**
     * Method that returns a boolean whether if the response given by the user
     * equals "Y" or not.
     * @return boolean
     */
    public boolean cont() {
        return ent.nextLine().equalsIgnoreCase("Y");
    }

    /**
     * Method that returns an integer given from the user.
     * @return integer
     */
    public int selection() {
        int sel = ent.nextInt();
        ent.nextLine();
        return sel;
    }

}
